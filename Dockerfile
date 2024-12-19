FROM openjdk:17

ENV JAVA_OPTS="--add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.security.jgss/sun.security.krb5=ALL-UNNAMED"

RUN ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ADD target/release-test-*.jar /data/release-test-0.0.1.jar

WORKDIR /data

ENTRYPOINT ["/bin/sh", "-c", "java ${JAVA_OPTS} -jar release-test-0.0.1.jar"]

EXPOSE 30001