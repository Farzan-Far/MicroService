
# MicroService with Spring Boot

 This is one of the most useable Rest-Service in Telecom companies with Microservices architecture.

This is an absolute Service that is used in production.

## Technologies used

Java 17

Spring Boot

Spring Cloud

Open-Feign

Spring Data JPA

Maven Build Tool 

Postgres and pgadmin

Zipkin

RabbitMQ

Jib plugin

ApiGW

Service discovery(Eureka-Server)

Advanced Message Queuing Protocol (AMQP)

Docker (Docker Compose)

Kubernetes (Minikube)


## Screenshots

/home/farzan/Pictures/Screenshots/Screenshot from 2023-05-20 22-46-38.png


### Quick overview

it has three main services and one message queue 
the Client is the main service here 
The Client talks to the Check service and the response goes to the queue and then published to the Notification Service.
Each Service has a database that is built into the Docker
also, RabbitMQ and Zipkin are handled by Docker.








