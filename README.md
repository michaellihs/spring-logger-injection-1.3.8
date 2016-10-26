Inject Logger as Bean with Spring (Boot)
========================================

This project contains an example of how to inject a logger class with Spring / Spring Boot following [this tweet from Josh Long](https://twitter.com/starbuxman/status/785367443522805760).

The `pom.xml` also provides an example of how to use more recent version of the Spring framework in older versions of Spring Boot:

```xml
<properties>
    <spring-framework.version>4.3</spring-framework.version>
</properties>
```

Reason for this is that Spring Boot 1.3.8 does not support the injection method required for the injection of the logger.