# BotOMat Spring Boot RESTful API 

### Description
A RESTful API for BotOMat application using Spring Boot, H2 database and Spring Boot Data JPA. This application instantiates a robot and assign random tasks.
BotOMat completes all the tasks assigned for the robot as per the eta and send a response with the status.  

### Features
- REST API 
- Custom API Error handling using ControllerAdvice
- MVC Test
- Automatic model mapping
- Persistance for Robot, Task and Robot_Task status using Spring Data JPA and H2 database(inmemory database)


### Prerequisites
1. Java - 1.8.x
2. Maven

### Steps to Setup

#### 1. Clone the application
```
$ git clone https://github.com/RedVentures22/bot-o-mat-priya-dharsinij.git
```
#### 2. Run the app using maven
```
$ cd bot-o-mat-priya-dharsinij
$ mvn spring-boot:run
```
Explore using postman or any rest client or by issuing the following curl request.

#### 1. Instantiate Robot
```
curl -d '{"name" : "Lauren", "type" : "Unipedal"}' -H 'Content-Type: application/json' http://localhost:8080/robots
```
#### 2. Get available tasks
```
curl http://localhost:8080/tasks
```

The app defines following end-points. 

|   Method      |    Url        |   Descriptiion |    Sample JSON Request   |
| ------------- | ------------- | -----------------------| ------------------ |
|     POST      |   /robots     |   Instantiate robot, assigns and completes tasks   |    [JSON](#instantiate-robot)   |
|     GET       |   /tasks      |   Get available tasks  |                    |



### Sample JSON Request

#### Instantiate Robot -> /robots
```
{
    "name" : "Lauren",
    "type" : "Unipedal"
}
```

### coming up next
- Allow users to create multiple robots at one time
- Create tasks specific for each robot type


