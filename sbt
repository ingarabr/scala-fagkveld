#!/bin/sh
java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx512M -Xss2M -jar `dirname $0`/sbt-launch.jar "$@"
