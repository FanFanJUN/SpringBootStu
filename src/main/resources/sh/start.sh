#!/bin/bash
JAVA_OPTS=-Xmx512m
MAIN_CLASS=springboot-0.0.1-SNAPSHOT.jar
#得到进程ID
# -Dlogback.configurationFile=$LOGBACK_CFG 指定logback配置文件
PID=`ps -ef|grep MAIN_CLASS|grep -v grep|awk '{print $2}'`
if [ "$PID" = "" ]
then
       nohup java $JAVA_OPTS -jar $MAIN_CLASS  > catalina.out  2>&1 &
       echo "application start success!"
       exit 0
else
       echo "application is already running!"
fi