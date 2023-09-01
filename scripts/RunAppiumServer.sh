#!/bin/bash
set -ex

# Install or update appium globally
npm install -g appium

# Check if the 'xcuitest' driver is installed
if appium driver list --installed | grep -q "xcuitest"; then
  echo "'xcuitest' driver is already installed. Updating..."
  appium driver update xcuitest
else
  echo "'xcuitest' driver is not installed. Installing..."
  appium driver install xcuitest
fi

# Install or update appium-flutter-driver
appium driver install --source=npm appium-flutter-driver

# Check Appium version
appium -v

# Start the Appium server in the background
appium &>/dev/null &
