# Spring boot Kafka demo app
Demo Spring boot Kafka App which consist of consumers and producers.

### Running the project in Docker
<strong>Prerequisites</strong></br>
- Docker installation

<strong>Steps</strong></br>
- **Step 1:** The project needs to be built first using the command `mvn install -DskipTests` via intelliJ or commandline. It should be executed under the `kafka-demo` as shown below.
  ![](https://i.imgur.com/nxGHgvP.png)

- **Step 2:** Execute the following docker command inside the `docker-compose` directory in order to bring up the Spring project and the Kafka servers.

    ```
    docker-compose up 
    ```




### Running the project in IntelliJ
<strong>Prerequisites</strong></br>
- Java 17
- Docker installation

<strong>Steps</strong></br>
- **Step 1:** Execute thr following docker command inside the `docker-compose` directory in order to bring up the Kafka servers.

    ```
    docker-compose -f common.yml -f kafka_cluster.yml up 
    ```
  
- **Step 2:** Build and run the project in IntelliJ.

### Sending messages to the Kafka topics
Import requests from the `collections` directory and execute them in Postman in order to create messages.

### Connecting to the Kafka Server
The [Offset Explorer](https://www.kafkatool.com/) can be used with the following configs.

![](https://i.imgur.com/A6K4b8Y.png)
![](https://i.imgur.com/JHktpaa.png)



### Checking Kafka messages inside a given topic
This can be done using [kafkacat](https://hub.docker.com/r/confluentinc/cp-kafkacat/).
```
docker run -it --network=host confluentinc/cp-kafkacat kafkacat -C -b  localhost:19092  -t users
```

```
docker run -it --network=host confluentinc/cp-kafkacat kafkacat -C -b  localhost:39092  -t beverages
```




