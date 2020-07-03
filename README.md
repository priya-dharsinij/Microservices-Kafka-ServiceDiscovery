# BotOMat Spring Boot RESTful API 

### Description
A RESTful API for BotOMat application using Spring Boot, H2 database and Spring Boot Data JPA. This application instantiates a robot and assign tasks.
BotOMAt completes all the tasks assigned for the robot as per the eta and send a response with the status.  

### Requirements
1. Java - 1.8.x
2. Maven - 4.0.0

### Steps to Setup

#### 1. Clone the application
```
git clone https://github.com/RedVentures22/bot-o-mat-priya-dharsinij.git
```
#### 2. Run the app using maven
```
mvn spring-boot:run
```

### Explore Rest API
The app defines following end-points.

|   Method      |    Url        |   Descriptiion         |    [Link to Header](#sample-valid-json-request-body)        |
| ------------- | ------------- | -----------------------| ----------------------------------- |
|     POST      |   /robots     |   Instantiate robot    |    JSON                             |
|     GET       |   /tasks      |   Get available tasks  |                                     |

Test them using postman or any other rest client.












































Sample Valid JSON Request Body


### What is coming next?
