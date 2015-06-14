#!/bin/sh
cd bookstore
./gradlew clean test
cd ..
rm -rf examplereport/*
cp -r bookstore/build/reports/jgiven/html5/* examplereport
