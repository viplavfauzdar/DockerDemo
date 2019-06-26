FROM java:8
WORKDIR /fauz
ADD ./target/DockerDemo-0.0.1-SNAPSHOT.jar /fauz/dockerdemo.jar
CMD java -jar dockerdemo.jar