taskkill /IM "postgres.exe" /F
mvn install -f Backend/pom.xml -DskipTests
docker-compose up -d --build