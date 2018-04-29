#!/usr/bin/env bash
gradle clean build
docker build -t 'org.k3yake/city-api' -f cd/docker/Dockerfile --build-arg JAR_FILE=./build/libs/mini-kube-example.jar .
docker tag org.k3yake/city-api:latest localhost:5000/org.k3yake/city-api:latest