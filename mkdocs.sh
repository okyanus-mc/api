#!/bin/bash

rm -rf docs/
./gradlew javadoc
mv build/docs/javadoc docs/
