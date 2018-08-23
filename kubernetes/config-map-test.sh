#!/usr/bin/***REMOVED*** bash
kubectl --kubeconfig=../../.kube/config.***REMOVED***-***REMOVED*** delete configmap catalog-manager-conf
kubectl --kubeconfig=../../.kube/config.***REMOVED***-***REMOVED*** create configmap catalog-manager-conf --from-file=../conf/test/prodBase.conf
