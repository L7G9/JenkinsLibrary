#!/usr/bin/env groovy

/**
* Gradle compile step
*/
def call() {
	sh "./gradlew compileJava"
}
