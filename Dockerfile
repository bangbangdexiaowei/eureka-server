FROM bangbangdexiaowei/centos7-jdk8:latest
MAINTAINER xiaowei
WORKDIR /root
ADD /target/*.jar /root/application.jar
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
ENV TZ Asia/Shanghai
EXPOSE 8761
ENTRYPOINT ["java","-jar","/root/application.jar"]