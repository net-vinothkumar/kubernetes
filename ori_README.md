
# Context
This is a POC to demonstrate how we can package and deploy a spring boot 2 based application to k8s. 
You can find the complete article here at : [Building and deploying a spring boot application to kubernetes](https://www.linkedin.com/pulse/building-deploying-spring-boot-application-kubernetes-roussi/) for detailed steps 
# Project structure
The project consiste of the following :
* Simple Spring boot 2 application, that expose a greeting endpoint.
* Dockerfile manifest to build the image
* deployment.yml manifest file for k8s resources definition (POD, SERVICE, PodDisruptionBudget)

# Note
Further enhancement/clean up will be added to the project + additional features will be added on separated branches

### Reference Documentation
For further reference, please consider the following sections:

* [Kubernetes](https://kubernetes.io/)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready)
