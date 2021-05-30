#!/bin/bash
rm -r Backend/target
mvn install -f Backend/pom.xml -DskipTests
docker-compose up -d --force-recreate --build
