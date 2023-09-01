#!/bin/bash
set -ex

# Make sure Appium is installed
if ! command -v appium &>/dev/null; then
  npm install -g appium
fi

# Check if the xcuitest driver is installed
if appium driver list --installed | grep -q "xcuitest"; then
  # If it's installed, update it
  appium driver update xcuitest
else
  # If it's not installed, install it
  appium driver install xcuitest
fi

# Install the appium-flutter-driver
appium driver install --source=npm appium-flutter-driver

# Print the Appium version
appium -v

# Start the Appium server in the background
appium &>/dev/null &
