# SpringStudy


## 프로젝트 생성 
#### https://start.spring.io
#### Project: Gradle - Groovy Project 
#### Spring Boot: 2.3.x
#### Language: Java
#### Packaging: Jar
#### Java: 11 Project Metadata
#### groupId: hello
#### artifactId: core Dependencies: 선택하지 않는다.
#### 3.0이상을 선택할 경우 Java17이상 Javax패키지 jakarta로 변경

## Gradle 전체 설정
    plugins {
      id 'org.springframework.boot' version '2.3.3.RELEASE'
      id 'io.spring.dependency-management' version '1.0.9.RELEASE'
      id 'java'
    }
    group = 'hello'
    version = '0.0.1-SNAPSHOT'
    sourceCompatibility = '11'
    repositories {
    mavenCentral()
    }
    dependencies {
    implementation 'org.springframework.boot:spring-boot-starter'
    testImplementation('org.springframework.boot:spring-boot-starter-test') {
    exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
    }
    }

