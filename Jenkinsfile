pipeline{
    agent any
     stages {
        stage('Build') {
         steps {
             script{
             if(***REMOVED***.BRANCH_NAME=='testci'){
                sh '''
                sbt " -DSTAGING=true; reload; clean; compile;  docker:publish"
                '''
                }
            }
         }
        }
        stage('Staging'){
            steps{
            script{
                if(***REMOVED***.BRANCH_NAME=='test'){
                    sh '''
                    cd kubernetes
                    ./config-map-test.sh
                    kubectl delete -f  ***REMOVED***_datipubblici_test.yaml
                    kubectl create -f  ***REMOVED***_datipubblici_test.yaml --namespace=security-enhancements
                    '''
            }
            }
        }
     }
     }
}

