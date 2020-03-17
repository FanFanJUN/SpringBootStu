#!/bin/bash
MAIN_CLASS=springboot-0.0.1-SNAPSHOT.jar
#得到进程ID
PID=`ps -ef|grep MAIN_CLASS|grep -v grep|awk '{print $2}'`
if [ "$PID" = "" ]
then
       echo "application is not running!"
else
       kill -9 $PID
       echo "application stop success!"
fi