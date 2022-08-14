/**
* Gradle compile step.
*/
def call() {
	sh './gradlew compileJava'
}
