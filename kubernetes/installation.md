## Installation

### Prerequisites

Security Manager must be properly installed and configured before proceed with Catalog Manager installation

### Procedure

The installation depends on the ***REMOVED***ironment where is is run.
For this reason, when executing the following steps, replace \<***REMOVED***ironment\> with `test` or `prod` accordingly.

1. git clone ***REMOVED***://github.com/***REMOVED***/***REMOVED***
2. cd `catalog-manager`
3. `sbt` or `sbt eval System.setProperty("STAGING", "true")` If you want to deploy on test ***REMOVED***ironment
4. `docker:publish` to compile and push the docker image on Nexus
5. cd `kubernetes` 
6. `./config-map-<***REMOVED***ironment>.sh` to create config map
7. `./kubectl create -f ***REMOVED***_catalog_manager_<***REMOVED***ironment>..yaml` to deploy the containers in kubernetes

