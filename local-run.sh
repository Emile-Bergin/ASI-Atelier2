#!/bin/bash
rm -r Backend/target
rm -r usr/target
mvn install -f Backend/pom.xml -DskipTests
mvn install -f user/pom.xml -DskipTests
docker-compose up -d --force-recreate --build
