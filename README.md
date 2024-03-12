## Spring-Micro-Services
This is a spring boot monorepo which contains an API Gateway, Discovery server, Config-Server and the business logic with postgres as the database.
### API GATEWAY
- Gateway: Provides a simple, yet effective way to route to APIs in Servlet-based applications. Provides cross-cutting concerns to those APIs such as security, monitoring/metrics, and resiliency.
- Eureka Discovery Client: A REST based service for locating services for the purpose of load balancing and failover of middle-tier servers.
- Config Client: Client that connects to a Spring Cloud Config Server to fetch the application's configuration.
- Spring Boot Actuator: Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions.
- NOTE: To activate the mono-repo -> go to file then select modules from existing sources -> project `pom.xml` .
### Discovery Server
- The server dependencies include Eureka Server, Config Client, Spring Boot Actuator
- Eureka Server run on Port `localhost:8761` but run the config-server first then run other services.
### Config Server 
- Config-Server: Central management for configuration via Git, SVN, or HashiCorp Vault.
### Users
- Dependencies -> PostgreSQL Driver, Lombok, Spring Data JPA, Spring Web, Config Client, Eureka Discovery Client, Spring Boot Actuator.
### Quests
- OpenFeign: Declarative REST Client. OpenFeign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations.
