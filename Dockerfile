FROM openjdk:14-alpine
COPY build/libs/microapp-*-all.jar microapp.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "microapp.jar"]