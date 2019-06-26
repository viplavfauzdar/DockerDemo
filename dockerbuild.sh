./mvnw clean verify -DskipTests

docker build --tag=dockerdemo .
docker run --publish=8080:8080 --rm=true --name=dockerdemo dockerdemo