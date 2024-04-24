
FROM openjdk:17-jdk-alpine AS builder

COPY ./.mvn ./.mvn
COPY ./mvnw .
COPY ./pom.xml .

RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target/
#RUN ./mvnw dependency:go-ofline

COPY ./src ./src

RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-alpine

RUN mkdir ./logs
ARG TEGERT_FOLDER=/target
COPY --from=builder $TEGERT_FOLDER/mx.com.raccoon.punto.venta-0.0.1-SNAPSHOT.jar .
ARG PORT_APP=8001
ENV PORT $PORT_APP
EXPOSE $PORT

#ENTRYPOINT ["java", "-jar", "msvc-usuarios-0.0.1-SNAPSHOT.jar"]
CMD ["java", "-jar", "mx.com.raccoon.punto.venta-0.0.1-SNAPSHOT.jar"]
