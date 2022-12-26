FROM jdk11-base


COPY ./jar/*.jar /data/program.jar

EXPOSE 8081

# 以容器方式启动
ENTRYPOINT ["sh","-c","java -jar /data/program.jar"]






