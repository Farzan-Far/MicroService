
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

Service discovery (Eureka-Server)

Advanced Message Queuing Protocol (AMQP)

Docker (Docker Compose)

container orchestration engine (Kubernetes)

## Features

- Complete and real CRUD API
- it can run locally, with Docker, and in the Kubernetes cluster
- Micro Service Architecture
- Docker for containerization and deployment


## Screenshot
![Screenshot from 2023-05-20 22-46-38](https://github.com/Farzan-Far/MicroService/assets/74488136/c9224e48-b709-497d-acdb-57b27ed57c9e)


### Quick Overview

It has three main services and one message queue 
The client is the main service here 
The Client talks to the Check service and the response goes to the queue and then published to the Notification Service.
Each Service has a database that is built into the Docker
Also, RabbitMQ and Zipkin are handled by Docker.








