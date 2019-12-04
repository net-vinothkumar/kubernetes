
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
