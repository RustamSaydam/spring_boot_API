FROM maven:latest as maven
WORKDIR /app
COPY . .
RUN mvn dependency:resolve
CMD ["mvn", "spring-boot:run"]