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

### v1.0.3
* Added `spring-boot-starter-remote-shell` to enable remote shell to log in.
* You will see ssh configuration options, e.g.
```
    
    Configuring property ssh.port=2000 from properties
    Configuring property ssh.auth_timeout=600000 from properties
    Configuring property ssh.idle_timeout=600000 from properties
    Configuring property ssh.default_encoding=UTF-8 from properties
    Configuring property auth=simple from properties
    Configuring property auth.simple.username=user from properties
    Configuring property auth.simple.password=5b5e235f-db1f-4b69-895f-d09277a39a26 from properties
    
```

* Try logging into the remote shell, e.g.
```
    
    ssh -p 2000 user@localhost
    (use default password, e.g. 5b5e235f-db1f-4b69-895f-d09277a39a26)
    
```

* Try various commands, e.g.
```
    
    help
    
    Try one of these commands with the -h or --help switch:
    NAME       DESCRIPTION
    autoconfig Display auto configuration report from ApplicationContext
    beans      Display beans in ApplicationContext
    cron       manages the cron plugin
    dashboard  a monitoring dashboard
    egrep      search file(s) for lines that match a pattern
    endpoint   Invoke actuator endpoints
    env        display the term env
    filter     a filter for a stream of map
    java       various java language commands
    jmx        Java Management Extensions
    jul        java.util.logging commands
    jvm        JVM informations
    less       opposite of more
    mail       interact with emails
    man        format and display the on-line manual pages
    metrics    Display metrics provided by Spring Boot
    shell      shell related command
    sleep      sleep for some time
    sort       sort a map
    system     vm system properties commands
    thread     JVM thread commands
    help       provides basic help
    repl       list the repl or change the current repl
    
```

### v1.0.4
* Make sure HSQL database is available with datasource details described below.
* Added `spring-boot-starter-data-jpa` to enable Spring Data with JPA (Hibernate)
* Added HSQL database drivers
* Added `src/main/resources/application.properties`, e.g.
    
```
    #
    # src/main/resources/application.properties
    #
    spring.datasource.driverClassName=org.hsqldb.jdbcDriver
    spring.datasource.url=jdbc:hsqldb:hsql://localhost:9002/mydb
    spring.datasource.username=sa
    spring.datasource.password=
    
    spring.jpa.hibernate.ddl-auto=validate
    
```

* Try http://localhost:8080/health



