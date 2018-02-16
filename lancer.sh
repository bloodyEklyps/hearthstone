#!/bin/bash

mkdir bin
cd bin
javac ../src/*/*/*/*.java -d ../bin/ -cp ../src/
javac ../src/*/*/*.java -d ../bin/ -cp ../src/
javac ../src/*/*.java -d ../bin/ -cp ../src/
java game/Main
