#!/usr/bin/***REMOVED*** bash
kubectl delete configmap catalog-manager-conf
kubectl create configmap catalog-manager-conf --from-file=../conf/test/prodBase.conf