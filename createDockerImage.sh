#!/usr/bin/env bash
docker build -t 'org.k3yake/city-api-db' -f cd/docker/city-api-db/Dockerfile .
docker tag org.k3yake/city-api-db:latest localhost:5000/org.k3yake/city-api-db:`(date +"%Y%m%d%H%M%S")`

gradle clean build
docker build -t 'org.k3yake/city-api' -f cd/docker/city-api/Dockerfile --build-arg JAR_FILE=./build/libs/mini-kube-example.jar .
docker tag org.k3yake/city-api:latest localhost:5000/org.k3yake/city-api:`(date +"%Y%m%d%H%M%S")`

