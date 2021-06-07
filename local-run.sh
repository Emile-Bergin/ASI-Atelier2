#!/bin/bash
rm -r Backend/target
rm -r usr/target
rm -r room/target
rm -r game/target
rm -r card/target
mvn install -f Backend/pom.xml -DskipTests
mvn install -f user/pom.xml -DskipTests
mvn install -f room/pom.xml -DskipTests
mvn install -f game/pom.xml -DskipTests
mvn install -f card/pom.xml -DskipTests
docker-compose up -d --force-recreate --build
