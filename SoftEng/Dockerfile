 FROM openjdk:8u181-jre-alpine
 RUN mkdir SE
 WORKDIR SE
 COPY ./SE/computer-store-server/build/libs/gs-spring-boot-0.1.0.jar .
 CMD java $JAVA_OPTS -jar gs-spring-boot-0.1.0.jar