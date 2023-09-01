#!/bin/bash
set -ex
npm install -g appium
# npm install appium doctor -g
appium driver install uiautomator2
# appium driver install xcuitest
appium driver install --source=npm appium-flutter-driver

appium -v
appium &>/dev/null &
