/**
* Gradle unit-test step.
*/

def call() {
	sh "./gradlew test"
}
