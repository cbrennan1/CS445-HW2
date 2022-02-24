#!/bin/bash

sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk
sudo apt-get install -y junit

sudo snap install gradle --classic
sudo ./gradlew clean build
sudo ./gradlew jacocoTestReport