#!/bin/bash
mvn clean install -DskipTests
docker-compose up -d --force-recreate --build
