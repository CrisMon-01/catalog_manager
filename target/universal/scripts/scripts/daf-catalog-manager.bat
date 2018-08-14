@REM ***REMOVED***-catalog-manager launcher script
@REM
@REM Environment:
@REM JAVA_HOME - location of a JDK home dir (optional if java on path)
@REM CFG_OPTS  - JVM options (optional)
@REM Configuration:
@REM DAF_CATALOG_MANAGER_config.txt found in the DAF_CATALOG_MANAGER_HOME.
@setlocal enabledelayedexpansion

@echo off

if "%DAF_CATALOG_MANAGER_HOME%"=="" set "DAF_CATALOG_MANAGER_HOME=%~dp0\\.."

set "APP_LIB_DIR=%DAF_CATALOG_MANAGER_HOME%\lib\"

rem Detect if we were double clicked, although theoretically A user could
rem manually run cmd /c
for %%x in (!cmdcmdline!) do if %%~x==/c set DOUBLECLICKED=1

rem FIRST we load the config file of extra options.
set "CFG_FILE=%DAF_CATALOG_MANAGER_HOME%\DAF_CATALOG_MANAGER_config.txt"
set CFG_OPTS=
if exist "%CFG_FILE%" (
  FOR /F "tokens=* eol=# usebackq delims=" %%i IN ("%CFG_FILE%") DO (
    set DO_NOT_REUSE_ME=%%i
    rem ZOMG (Part #2) WE use !! here to delay the expansion of
    rem CFG_OPTS, otherwise it remains "" for this loop.
    set CFG_OPTS=!CFG_OPTS! !DO_NOT_REUSE_ME!
  )
)

rem We use the value of the JAVACMD ***REMOVED***ironment variable if defined
set _JAVACMD=%JAVACMD%

if "%_JAVACMD%"=="" (
  if not "%JAVA_HOME%"=="" (
    if exist "%JAVA_HOME%\bin\java.exe" set "_JAVACMD=%JAVA_HOME%\bin\java.exe"
  )
)

if "%_JAVACMD%"=="" set _JAVACMD=java

rem Detect if this java is ok to use.
for /F %%j in ('"%_JAVACMD%" -version  2^>^&1') do (
  if %%~j==java set JAVAINSTALLED=1
  if %%~j==openjdk set JAVAINSTALLED=1
)

rem BAT has no logical or, so we do it OLD SCHOOL! Oppan Redmond Style
set JAVAOK=true
if not defined JAVAINSTALLED set JAVAOK=false

if "%JAVAOK%"=="false" (
  echo.
  echo A Java JDK is not installed or can't be found.
  if not "%JAVA_HOME%"=="" (
    echo JAVA_HOME = "%JAVA_HOME%"
  )
  echo.
  echo Please go to
  echo   ***REMOVED***://www.oracle.com/technetwork/java/javase/downloads/index.html
  echo and download a valid Java JDK and install before running ***REMOVED***-catalog-manager.
  echo.
  echo If you think this message is in error, please check
  echo your ***REMOVED***ironment variables to see if "java.exe" and "javac.exe" are
  echo available via JAVA_HOME or PATH.
  echo.
  if defined DOUBLECLICKED pause
  exit /B 1
)


rem We use the value of the JAVA_OPTS ***REMOVED***ironment variable if defined, rather than the config.
set _JAVA_OPTS=%JAVA_OPTS%
if "!_JAVA_OPTS!"=="" set _JAVA_OPTS=!CFG_OPTS!

rem We keep in _JAVA_PARAMS all -J-prefixed and -D-prefixed arguments
rem "-J" is stripped, "-D" is left as is, and everything is appended to JAVA_OPTS
set _JAVA_PARAMS=
set _APP_ARGS=

:param_loop
call set _PARAM1=%%1
set "_TEST_PARAM=%~1"

if ["!_PARAM1!"]==[""] goto param_afterloop


rem ignore arguments that do not start with '-'
if "%_TEST_PARAM:~0,1%"=="-" goto param_java_check
set _APP_ARGS=!_APP_ARGS! !_PARAM1!
shift
goto param_loop

:param_java_check
if "!_TEST_PARAM:~0,2!"=="-J" (
  rem strip -J prefix
  set _JAVA_PARAMS=!_JAVA_PARAMS! !_TEST_PARAM:~2!
  shift
  goto param_loop
)

if "!_TEST_PARAM:~0,2!"=="-D" (
  rem test if this was double-quoted property "-Dprop=42"
  for /F "delims== tokens=1,*" %%G in ("!_TEST_PARAM!") DO (
    if not ["%%H"] == [""] (
      set _JAVA_PARAMS=!_JAVA_PARAMS! !_PARAM1!
    ) else if [%2] neq [] (
      rem it was a normal property: -Dprop=42 or -Drop="42"
      call set _PARAM1=%%1=%%2
      set _JAVA_PARAMS=!_JAVA_PARAMS! !_PARAM1!
      shift
    )
  )
) else (
  if "!_TEST_PARAM!"=="-main" (
    call set CUSTOM_MAIN_CLASS=%%2
    shift
  ) else (
    set _APP_ARGS=!_APP_ARGS! !_PARAM1!
  )
)
shift
goto param_loop
:param_afterloop

set _JAVA_OPTS=!_JAVA_OPTS! !_JAVA_PARAMS!
:run

set "APP_CLASSPATH=%APP_LIB_DIR%\..\conf\;%APP_LIB_DIR%\it.gov.***REMOVED***.***REMOVED***-catalog-manager-1.0.4-SNAPSHOT-sans-externalized.jar;%APP_LIB_DIR%\it.gov.***REMOVED***.***REMOVED***-catalog-manager-client-1.0.4-SNAPSHOT.jar;%APP_LIB_DIR%\org.scala-lang.scala-library-2.11.8.jar;%APP_LIB_DIR%\com.typesafe.play.play-json_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play-iteratees_2.11-2.5.14.jar;%APP_LIB_DIR%\org.scala-stm.scala-stm_2.11-0.7.jar;%APP_LIB_DIR%\com.typesafe.config-1.3.1.jar;%APP_LIB_DIR%\com.typesafe.play.play-functional_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play-datacommons_2.11-2.5.14.jar;%APP_LIB_DIR%\org.joda.joda-convert-1.8.1.jar;%APP_LIB_DIR%\org.scala-lang.scala-reflect-2.11.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.core.jackson-core-2.7.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.core.jackson-annotations-2.7.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.core.jackson-databind-2.7.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.datatype.jackson-datatype-jdk8-2.7.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.datatype.jackson-datatype-jsr310-2.7.8.jar;%APP_LIB_DIR%\com.typesafe.play.play-ws_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.build-link-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play-exceptions-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play-netty-utils-2.5.14.jar;%APP_LIB_DIR%\org.slf4j.jul-to-slf4j-1.7.21.jar;%APP_LIB_DIR%\org.slf4j.jcl-over-slf4j-1.7.21.jar;%APP_LIB_DIR%\com.typesafe.play.play-streams_2.11-2.5.14.jar;%APP_LIB_DIR%\org.reactivestreams.reactive-streams-1.0.0.jar;%APP_LIB_DIR%\com.typesafe.akka.akka-stream_2.11-2.4.17.jar;%APP_LIB_DIR%\com.typesafe.akka.akka-actor_2.11-2.4.17.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-java8-compat_2.11-0.7.0.jar;%APP_LIB_DIR%\com.typesafe.ssl-config-core_2.11-0.2.1.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-parser-combinators_2.11-1.0.4.jar;%APP_LIB_DIR%\com.typesafe.play.twirl-api_2.11-1.1.1.jar;%APP_LIB_DIR%\org.apache.commons.commons-lang3-3.4.jar;%APP_LIB_DIR%\com.typesafe.akka.akka-slf4j_2.11-2.4.17.jar;%APP_LIB_DIR%\xerces.xercesImpl-2.11.0.jar;%APP_LIB_DIR%\xml-apis.xml-apis-1.4.01.jar;%APP_LIB_DIR%\javax.transaction.jta-1.1.jar;%APP_LIB_DIR%\com.google.inject.guice-4.0.jar;%APP_LIB_DIR%\javax.inject.javax.inject-1.jar;%APP_LIB_DIR%\aopalliance.aopalliance-1.0.jar;%APP_LIB_DIR%\com.google.guava.guava-19.0.jar;%APP_LIB_DIR%\com.google.inject.extensions.guice-assistedinject-4.0.jar;%APP_LIB_DIR%\org.async***REMOVED***client.async-***REMOVED***-client-2.0.24.jar;%APP_LIB_DIR%\org.async***REMOVED***client.async-***REMOVED***-client-netty-utils-2.0.24.jar;%APP_LIB_DIR%\io.netty.netty-buffer-4.0.42.Final.jar;%APP_LIB_DIR%\io.netty.netty-common-4.0.42.Final.jar;%APP_LIB_DIR%\io.netty.netty-codec-***REMOVED***-4.0.42.Final.jar;%APP_LIB_DIR%\io.netty.netty-codec-4.0.42.Final.jar;%APP_LIB_DIR%\io.netty.netty-transport-4.0.42.Final.jar;%APP_LIB_DIR%\io.netty.netty-handler-4.0.42.Final.jar;%APP_LIB_DIR%\io.netty.netty-transport-native-epoll-4.0.42.Final-linux-x86_64.jar;%APP_LIB_DIR%\org.async***REMOVED***client.netty-resolver-dns-2.0.24.jar;%APP_LIB_DIR%\org.async***REMOVED***client.netty-resolver-2.0.24.jar;%APP_LIB_DIR%\org.async***REMOVED***client.netty-codec-dns-2.0.24.jar;%APP_LIB_DIR%\com.typesafe.netty.netty-reactive-streams-1.0.8.jar;%APP_LIB_DIR%\org.javassist.javassist-3.21.0-GA.jar;%APP_LIB_DIR%\oauth.signpost.signpost-core-1.2.1.2.jar;%APP_LIB_DIR%\oauth.signpost.signpost-commons***REMOVED***4-1.2.1.2.jar;%APP_LIB_DIR%\org.apache.***REMOVED***components.***REMOVED***core-4.4.4.jar;%APP_LIB_DIR%\org.apache.***REMOVED***components.***REMOVED***client-4.5.2.jar;%APP_LIB_DIR%\commons-logging.commons-logging-1.2.jar;%APP_LIB_DIR%\de.zalando.api-first-hand-api_2.11-0.2.4-***REMOVED***.jar;%APP_LIB_DIR%\com.fasterxml.jackson.module.jackson-module-scala_2.11-2.7.4.jar;%APP_LIB_DIR%\com.fasterxml.jackson.module.jackson-module-paranamer-2.7.4.jar;%APP_LIB_DIR%\com.thoughtworks.paranamer.paranamer-2.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.dataformat.jackson-dataformat-yaml-2.7.4.jar;%APP_LIB_DIR%\org.yaml.snakeyaml-1.15.jar;%APP_LIB_DIR%\com.fasterxml.jackson.dataformat.jackson-dataformat-csv-2.7.4.jar;%APP_LIB_DIR%\com.typesafe.play.play-server_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play-netty-server_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.netty.netty-reactive-streams-***REMOVED***-1.0.8.jar;%APP_LIB_DIR%\com.typesafe.play.play-logback_2.11-2.5.14.jar;%APP_LIB_DIR%\ch.qos.logback.logback-classic-1.2.3.jar;%APP_LIB_DIR%\ch.qos.logback.logback-core-1.2.3.jar;%APP_LIB_DIR%\org.slf4j.slf4j-api-1.7.25.jar;%APP_LIB_DIR%\com.typesafe.play.play-jdbc_2.11-2.5.14.jar;%APP_LIB_DIR%\com.typesafe.play.play-jdbc-api_2.11-2.5.14.jar;%APP_LIB_DIR%\com.jolbox.bonecp-0.8.0.RELEASE.jar;%APP_LIB_DIR%\com.zaxxer.HikariCP-2.5.1.jar;%APP_LIB_DIR%\com.googlecode.usc.jdbcdslog-1.0.6.2.jar;%APP_LIB_DIR%\com.h2database.h2-1.4.192.jar;%APP_LIB_DIR%\tyrex.tyrex-1.0.1.jar;%APP_LIB_DIR%\com.typesafe.play.play-cache_2.11-2.5.14.jar;%APP_LIB_DIR%\net.sf.ehcache.ehcache-core-2.6.11.jar;%APP_LIB_DIR%\com.typesafe.play.filters-helpers_2.11-2.5.14.jar;%APP_LIB_DIR%\org.webjars.swagger-ui-3.0.7.jar;%APP_LIB_DIR%\org.mongodb.casbah-commons_2.11-3.1.1.jar;%APP_LIB_DIR%\com.github.nscala-time.nscala-time_2.11-1.0.0.jar;%APP_LIB_DIR%\org.mongodb.mongo-java-driver-3.2.2.jar;%APP_LIB_DIR%\org.mongodb.casbah-core_2.11-3.1.1.jar;%APP_LIB_DIR%\org.mongodb.casbah-query_2.11-3.1.1.jar;%APP_LIB_DIR%\org.mongodb.casbah-gridfs_2.11-3.1.1.jar;%APP_LIB_DIR%\net.caoticode.dirwatcher.dir-watcher_2.11-0.1.0.jar;%APP_LIB_DIR%\com.twitter.util-eval_2.11-6.26.0.jar;%APP_LIB_DIR%\org.scala-lang.scala-compiler-2.11.8.jar;%APP_LIB_DIR%\com.twitter.util-core_2.11-6.26.0.jar;%APP_LIB_DIR%\com.twitter.util-function_2.11-6.26.0.jar;%APP_LIB_DIR%\it.gov.***REMOVED***.common_2.11-1.1.0-SNAPSHOT.jar;%APP_LIB_DIR%\io.swagger.swagger-play2_2.11-1.5.3.jar;%APP_LIB_DIR%\io.swagger.swagger-core-1.5.8.jar;%APP_LIB_DIR%\com.fasterxml.jackson.datatype.jackson-datatype-joda-2.4.5.jar;%APP_LIB_DIR%\io.swagger.swagger-models-1.5.8.jar;%APP_LIB_DIR%\io.swagger.swagger-annotations-1.5.8.jar;%APP_LIB_DIR%\javax.validation.validation-api-1.1.0.Final.jar;%APP_LIB_DIR%\io.swagger.swagger-scala-module_2.11-1.0.2.jar;%APP_LIB_DIR%\com.typesafe.play.routes-compiler_2.11-2.5.4.jar;%APP_LIB_DIR%\commons-io.commons-io-2.4.jar;%APP_LIB_DIR%\com.github.cb372.scalacache-guava_2.11-0.9.4.jar;%APP_LIB_DIR%\com.github.cb372.scalacache-core_2.11-0.9.4.jar;%APP_LIB_DIR%\joda-time.joda-time-2.9.9.jar;%APP_LIB_DIR%\com.google.code.findbugs.jsr305-1.3.9.jar;%APP_LIB_DIR%\org.pac4j.play-pac4j-3.0.0.jar;%APP_LIB_DIR%\org.pac4j.pac4j-core-2.0.0.jar;%APP_LIB_DIR%\org.pac4j.pac4j-***REMOVED***-2.0.0.jar;%APP_LIB_DIR%\org.pac4j.pac4j-jwt-2.0.0.jar;%APP_LIB_DIR%\com.nimbusds.nimbus-jose-jwt-4.34.2.jar;%APP_LIB_DIR%\com.github.stephenc.jcip.jcip-annotations-1.0-1.jar;%APP_LIB_DIR%\net.minidev.json-smart-1.3.1.jar;%APP_LIB_DIR%\org.bouncycastle.bcpkix-jdk15on-1.55.jar;%APP_LIB_DIR%\org.bouncycastle.bcprov-jdk15on-1.56.jar;%APP_LIB_DIR%\org.pac4j.pac4j-ldap-2.0.0.jar;%APP_LIB_DIR%\org.ldaptive.ldaptive-1.2.1.jar;%APP_LIB_DIR%\commons-cli.commons-cli-1.3.1.jar;%APP_LIB_DIR%\commons-codec.commons-codec-1.11.jar;%APP_LIB_DIR%\me.lessis.base64_2.11-0.2.0.jar;%APP_LIB_DIR%\ch.lightshed.courier_2.11-0.1.4.jar;%APP_LIB_DIR%\javax.mail.mail-1.4.7.jar;%APP_LIB_DIR%\javax.activation.activation-1.1.1.jar;%APP_LIB_DIR%\com.sksamuel.avro4s.avro4s-core_2.11-1.1.3.jar;%APP_LIB_DIR%\com.chuusai.shapeless_2.11-2.2.5.jar;%APP_LIB_DIR%\org.apache.avro.avro-1.7.7.jar;%APP_LIB_DIR%\org.codehaus.jackson.jackson-core-asl-1.9.13.jar;%APP_LIB_DIR%\org.codehaus.jackson.jackson-mapper-asl-1.9.13.jar;%APP_LIB_DIR%\org.xerial.snappy.snappy-java-1.0.5.jar;%APP_LIB_DIR%\org.apache.commons.commons-compress-1.4.1.jar;%APP_LIB_DIR%\org.tukaani.xz-1.0.jar;%APP_LIB_DIR%\com.sksamuel.avro4s.avro4s-json_2.11-1.1.3.jar;%APP_LIB_DIR%\org.json4s.json4s-native_2.11-3.3.0.jar;%APP_LIB_DIR%\org.json4s.json4s-core_2.11-3.3.0.jar;%APP_LIB_DIR%\org.json4s.json4s-ast_2.11-3.3.0.jar;%APP_LIB_DIR%\org.json4s.json4s-scalap_2.11-3.3.0.jar;%APP_LIB_DIR%\org.scala-lang.modules.scala-xml_2.11-1.0.5.jar;%APP_LIB_DIR%\com.sksamuel.avro4s.avro4s-generator_2.11-1.1.3.jar;%APP_LIB_DIR%\io.prometheus.simpleclient-0.1.0.jar;%APP_LIB_DIR%\io.prometheus.simpleclient_hotspot-0.1.0.jar;%APP_LIB_DIR%\io.prometheus.simpleclient_common-0.1.0.jar;%APP_LIB_DIR%\it.gov.***REMOVED***.***REMOVED***-catalog-manager-1.0.4-SNAPSHOT-assets.jar"
set "APP_MAIN_CLASS=play.core.server.ProdServerStart"

if defined CUSTOM_MAIN_CLASS (
    set MAIN_CLASS=!CUSTOM_MAIN_CLASS!
) else (
    set MAIN_CLASS=!APP_MAIN_CLASS!
)

rem Call the application and pass all arguments unchanged.
"%_JAVACMD%" !_JAVA_OPTS! !DAF_CATALOG_MANAGER_OPTS! -cp "%APP_CLASSPATH%" %MAIN_CLASS% !_APP_ARGS!

@endlocal


:end

exit /B %ERRORLEVEL%
