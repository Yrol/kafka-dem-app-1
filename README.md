# Spring boot Kafka demo app
Demo Spring boot Kafka App which consist of consumers and producers.

### Kafka Docker server
The Kafka server configuration can be found inside the `docker` directory, and it consists of a Zookeeper, a Schema registry and 3 brokers. Execute the following Docker command inside 
the `docker` directory to spin up the server.


```
docker-compose -f common.yml -f kafka_cluster.yml up 
```

### Running the project
<strong>Prerequisites</strong></br>
- Java 17
- Docker installation and make sure the Kafka server explained above is up and running

Clone the project and open in IntelliJ. Build and run the project.

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




