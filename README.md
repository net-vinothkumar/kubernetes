
# Context
This is a POC to demonstrate how we can package and deploy a spring boot 2 based application to k8s. 

# Project structure
The project consiste of the following :
* Simple Spring boot 2 application, that expose a greeting endpoint.
* Dockerfile manifest to build the image
* deployment.yml manifest file for k8s resources definition (POD, SERVICE, PodDisruptionBudget)


### Reference Documentation
For further reference, please consider the following sections:

* [Kubernetes](https://kubernetes.io/)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready)


# Deploy the spring application to kubernetes - Steps :

* Build the demo spring boot application - docker image
    > mvn clean install \
    > docker build -t demo:0.1.0 .
* Push the built docker image to your own docker repository
    > docker images \
    > docker login \
    > docker push (your_repo_name)/demo-k8s:0.3.0
* Install minikube in your computer using these instructions - https://kubernetes.io/docs/tasks/tools/install-minikube/
* Start the minikube in your local machine
    > minikube start
* Create the deployment in kubernetes - it helps to pull the spring boot demo app docker images and deploy in K8S.
    > kubectl create -f deployment.yml # your application will be deployed in kubernetes
* View the container status
    > kubectl get pods
* To get the external Ip for accessing your application, please run
    > kubectl get svc
    > minikube tunnel
* Access your deployed spring boot application in kubernetes
    > curl (external-ip)/hello
* To view the kubernetes setup
    > minikube dashboard

