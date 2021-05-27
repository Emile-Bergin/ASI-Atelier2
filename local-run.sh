#!/bin/bash
mvn install -f Backend/pom.xml -DskipTests
docker-compose up -d
