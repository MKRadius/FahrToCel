FROM maven:latest
WORKDIR /FahrToCel
COPY pom.xml /FahrToCel
COPY . /FahrToCel/
RUN mvn package
CMD [ "java", "-jar", "target/fahrtocel_khai.jar" ]
# ENTRYPOINT [ "java", "-jar", "target/fahrtocel_khai.jar" ]
