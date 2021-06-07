taskkill /IM "postgres.exe" /F
mvn install -f Backend/pom.xml -DskipTests
mvn install -f user/pom.xml -DskipTests
mvn install -f room/pom.xml -DskipTests
mvn install -f game/pom.xml -DskipTests
mvn install -f card/pom.xml -DskipTests
docker-compose up -d --build
