[![Build Status](https://travis-ci.org/deathman92/twilio-spring-boot-starter.svg?branch=master)](https://travis-ci.org/deathman92/sendgrid-spring-boot-starter)
[ ![Download](https://api.bintray.com/packages/deathman92/maven-release/twilio-spring-boot-starter/images/download.svg) ](https://bintray.com/deathman92/maven-release/twilio-spring-boot-starter/_latestVersion)
  
# Spring Boot SendGrid starter
A Spring Boot starter that will help you configure [Twilio](https://github.com/twilio/twilio-java) within the application context.

## Features
In order to add SendGrid to your project simply add this dependency to your classpath:
### Gradle
```groovy
repositories {
 jcenter()
}

dependencies {
 compile("com.github.deathman92:twilio-spring-boot-starter:1.0.0")
}
```
### Maven
```xml
<dependency>
  <groupId>com.github.deathman92</groupId>
  <artifactId>twilio-spring-boot-starter</artifactId>
  <version>1.0.0</version>
</dependency>
```

# Spring Boot properties configuration
```properties
twilio.accountSID= // your accountSID (required)
twilio.authToken= // your auhtToken (required)
twilio.endpoint= // used endpoint [default: https://api.twilio.com]
```

# Licence
[MIT](/LICENSE.md)
