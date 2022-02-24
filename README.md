# Colin Brennan
# CS445-HW2


1. Installl java and gradle if not yet installed on your machine:

```
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo snap install gradle --classic
```

2. Change the permissions fro gradlew and the build script

```
sudo chmod +x gradlew
sudo chmod 777 build.sh
```

3. Build

```
./gradlew clean build

```

4. The build can be automated by running the build.sh script located in the same directory as this README.txt
```
sudo chmod 777 build.sh
./build.sh
```