# kn-project
It's a project responsible to manipulate an XML( JSM queue message) and send to a different destination( JSM topic message).
- Using ActiveMQ as a Broker and two modules, one as a service(Eureka Server) and another one as an integrator(spring-boot).

How to Run

# Run applications.
$ ./mvnw spring-boot:run


# Run a single test class (patroclos-integrator).
$ ./mvnw -Dtest=PatroclosIntegration test

$ ./mvnw -Dtest=PatroclosUnit test

Remember, in order to everything works well you have to be running in your environment a local ActiveMQ Broker to manage messages.
You can find one here:
http://activemq.apache.org/download.html
