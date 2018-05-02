#!/bin/bash
cd frontend/
./build-frontend.sh
cd ../
cd backend/
./build-backend.sh
cd ../

docker-compose build
