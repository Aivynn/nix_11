#!/bin/sh

javac -sourcepath ./src/ -d ./build/classes -cp "./libs/*"  src/major/Main.java

java -cp ./build/classes:./libs/* major.Main