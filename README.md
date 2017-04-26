#  Sample SOLMA application
SOLMA is  a scalable online machine learning library which includes classification, clustering, regression, ensemble algorithms, graph, linear algebra, and anomaly and novelty detection algorithms. All the algorithms are implemented on top of Apache Flink using the hybrid processing capabilities.

This project creates sample project for SOLMA library. The purpose is to ease the application development for SOLMA by providing already working project.
The application works on top of Flink.

### Usage
- Clone proteus-engine [1] ``` git clone https://github.com/proteus-h2020/proteus-engine.git ``` (if already cloned, execute ``` git pull origin proteus-dev ```)
- From commandline go to the proteus-engine directory and execute ``` mvn clean install -Dmaven.test.skip=true```
- Clone SOLMA project [2] ``` git clone https://github.com/proteus-h2020/SOLMA.git ``` (if already cloned, execute ``` git pull origin develop ```)
- From commandline go to the SOLMA directory and execute ``` mvn install ```
- Clone this project ``` git clone https://github.com/proteus-h2020/TestSolma.git ``` (if already cloned, execute ``` git pull origin master ```)
- Move to the TestSolma project directory and execute ``` mvn clean install ```
- Go to the ```proteus-engine/build-target/bin``` directory and execute ```./start-local.sh```
- Execute Flink with the jar file ``` TestSolma/target/TestSolma-1.0-SNAPSHOT-jar-with-dependencies.jar``` (```.../proteus-engine/build-target/bin/flink run .../TestSolma/target/TestSolma-1.0-SNAPSHOT-jar-with-dependencies.jar```)

For more examples, please look at [unit tests](https://github.com/proteus-h2020/SOLMA/tree/master/src/test/scala/eu/proteus/solma) from repo [2].




[1] https://github.com/proteus-h2020/proteus-engine

[2] https://github.com/proteus-h2020/SOLMA
