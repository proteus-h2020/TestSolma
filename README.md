#  Sample SOLMA application
Solma is  a scalable online machine learning algorithms (including classification, clustering, regression, ensemble algorithms, graph oriented algorithms, linear algebra operations, and anomaly and novelty detection) implemented on top of Apache Flink using the hybrid processing capabilities.

This project creates sample project for SOLMA library. The purpose is to ease the application development for SOLMA by providing already working project.
The application works on top of Flink. 

### Usage
- Clone proteus-engine [1] (if already cloned, execute ``` git pull origin proteus-dev ```)
- From commandline go to above directory and execute ``` mvn clean install ```
- Develop SOLMA application (on top of this project)
- For simple examples, please look at [unit tests](https://github.com/proteus-h2020/SOLMA/tree/master/src/test/scala/eu/proteus/solma) from repo [4].
- Move to project directory directory and execute ``` mvn install ```
- To generate jar with a given project, go to related directory (with command line) and execute ``` mvn clean install ```
- Use jar file under ``` ./target/ ``` and use [3] to exetuce jar with flink



[1] https://github.com/proteus-h2020/proteus-engine
[2] https://github.com/proteus-h2020/SOLMA
[3] https://ci.apache.org/projects/flink/flink-docs-release-1.2/setup/cli.html
[4] https://github.com/proteus-h2020/SOLMA