#!/bin/sh

if [ ! -f ./target/hw_3_Strings.jar ]; then
    echo "Trying to build project"
    mvn clean package
    echo "Project build successfully"
fi

java -jar ./target/hw_3_Strings.jar