FROM anapsix/alpine-java:8_jdk_unlimited
RUN apk update && apk add bash krb5-libs krb5
RUN ln -sf /etc/krb5.conf /opt/jdk/jre/lib/security/krb5.conf
WORKDIR /opt/docker
ADD opt /opt
RUN ["chown", "-R", "daemon:daemon", "."]
EXPOSE 9000
USER daemon
ENTRYPOINT ["bin/***REMOVED***-catalog-manager", "-Dconfig.file=conf/production.conf"]
CMD []
