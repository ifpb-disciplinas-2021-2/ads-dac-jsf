mvn clean package
docker image build -t ricardojob/app .
docker container run -p 8081:8080 --name app ricardojob/app
