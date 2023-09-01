#!/bin/bash
set -ex

# Install Appium and its drivers
npm install -g appium
# npm install -g appium-doctor  # Optional: Install appium-doctor for additional checks
# appium-doctor --ios           # Optional: Check the iOS setup with appium-doctor
appium driver install xcuitest
appium driver install --source=npm appium-flutter-driver

# Print the installed Appium version for verification
appium -v

# Start Appium in the background
appium &

# Wait for Appium to fully start (you may need to adjust the sleep duration)
sleep 10  # Adjust as needed

# Optionally, you can add more commands to run your tests here

# Terminate Appium (if needed) when tests are finished
# pkill -f "appium"
