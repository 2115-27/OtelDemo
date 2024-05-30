plugins {
  id("java")
  id("org.springframework.boot") version "3.0.6"
  id("io.spring.dependency-management") version "1.1.0"
}

sourceSets {
  main {
    java.setSrcDirs(setOf("."))
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web");
  implementation("io.opentelemetry:opentelemetry-api");
  implementation("io.opentelemetry:opentelemetry-sdk");
  implementation("io.opentelemetry:opentelemetry-exporter-logging");
  implementation("io.opentelemetry.semconv:opentelemetry-semconv:1.25.0-alpha");
  implementation("io.opentelemetry:opentelemetry-sdk-extension-autoconfigure");
}
