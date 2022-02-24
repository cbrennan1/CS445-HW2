#!/bin/bash

cd CS445-HW2
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo snap install gradle --classic
gradle clean build
gradle jacocoTestReport