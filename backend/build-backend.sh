#!/bin/bash
cd messaging-service/
mvn clean package
cd ../
cd notifications-service/
mvn clean package
cd ../
