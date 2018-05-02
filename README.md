# Playground - Docker, SpringBoot, and Angular 5
This playground repository is intended to build an application in Angular which
consumes multiple backend microservices developed in SpringBoot.
The idea is to initially configure a test environment based on a single-host
with multiple docker containers hosting the different services. A web-server
(NGINX) that acts as the entry-point of the application hosting the built
Angular application and configured to proxy the API traffic to the corresponding
backend service hosted on its own docker container.

![Single Host Diagram](https://github.com/ahmedabadawi/playground-docker-spring-angular/blob/c3929b44989c6d902d2b6972f0ddce80b07fb7b5/docs/single-host.png)

## Build Steps
1. Clone repository
```bash
git clone https://github.com/ahmedabadawi/playground-docker-spring-angular.git
cd playground-docker-spring-angular
```
2. Build Angular application
```bash
cd frontend/frontend-app
ng build
```
3. Build backend services
```bash
cd ../../backend
cd messaging-service
mvn clean package
cd ../notifications-service
mvn clean package
```
4. Build and run docker compose
```bash
cd ../../
docker-compose build
docker-compose up
```
5. Open browser on http://localhost

## Prerequisites
- Docker CE >= version 18
- Docker Compose >= version 1.20
- Maven 3.x.x
- JDK 1.8+

## Disclaimer
My playground repositories are not intended to provide complete applications,
basically they are sandboxes and pet projects to try different technologies and
techniques.
