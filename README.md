# kafka-poc

# Spring Boot Application Setup Guide

This guide outlines the steps to set up and run the Spring Boot application with Apache Kafka configured on your local environment.

---

## Prerequisites

Before you begin, ensure that you have the following installed on your system:

- Java Development Kit (JDK) 17 or later
- Apache Kafka (version 3.9.0 recommended)
---

## Setup Instructions

### Step 1: Set Up Kafka in Your Local Environment

1. **Download Kafka**  
   Download the latest Kafka release from [Apache Kafka Downloads](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.9.0/kafka_2.13-3.9.0.tgz).

2. **Extract Kafka Archive**  
   Open a terminal and run the following commands to extract and navigate into the Kafka directory:
   ```bash
   $ tar -xzf kafka_2.13-3.9.0.tgz
   $ cd kafka_2.13-3.9.0
   ```

3. **Start Zookeeper Service**  
   Kafka requires Zookeeper to manage its services. Start the Zookeeper service using the command:
   ```bash
   $ bin/zookeeper-server-start.sh config/zookeeper.properties
   ```

4. **Start Kafka Broker Service**  
   After Zookeeper is running, start the Kafka broker service with:
   ```bash
   $ bin/kafka-server-start.sh config/server.properties
   ```

At this point, Kafka should be running locally on your system.

---

### Step 2: Start the Spring Boot Application

Once Kafka is up and running, you can start your Spring Boot application:

1. Navigate to the root directory of your Spring Boot project.

2. Use your preferred build tool to run the application:
    - **For Maven**
      ```bash
      $ ./mvnw spring-boot:run
      ```

3. Confirm that the application starts successfully and connects to the Kafka broker.
