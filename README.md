# forum-springboot

Simple Spring Boot application demo.

## How to Run Spring Boot Application

### Run from Eclipse
* Execute `example.forum.run.Application` from Eclipse, e.g. right click on `example.forum.run.Application`, `Run As`, `Java Application`

### Run from Command Prompt
* Type in the Maven commands from the command prompt, e.g.

```
mvn package && java -jar target/forum-springboot-1.0.0-SNAPSHOT.jar
```

## Versions

### v1.0.0
* Simplest possible Spring Boot application. Doesn't do anything, just exits the application.

### v1.0.1
* Added `spring-boot-starter-web` to enable embedded container (Tomcat).
* Try http://localhost:8080

### v1.0.2
* Added `spring-boot-starter-actuator` to enable monitoring, metrics and other useful utilities.
* Try the following pages:
  * http://localhost:8080/beans
  * http://localhost:8080/metrics
  * http://localhost:8080/dump
  * http://localhost:8080/env
  * http://localhost:8080/trace
  * http://localhost:8080/info
  * http://localhost:8080/health
  * http://localhost:8080/mappings


