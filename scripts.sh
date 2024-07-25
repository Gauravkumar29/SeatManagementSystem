docker build -t student-management-system:latest .
docker run --network "host" --name student-management-system -m 2G --cpus=1 -it -d -p 8080:8080 -e JAVA_OPTIONS='-Xms1G -Xmx1G -XX:+UseStringDeduplication' student-management-system:latest
