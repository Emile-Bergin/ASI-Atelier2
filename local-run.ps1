taskkill /IM "postgres.exe" /F
mvn clean install -DskipTests
docker-compose up -d --build
