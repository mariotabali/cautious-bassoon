#
- spring initializer
- get intelliJ idea
- install gradle (not gradlew that is included)
- fix dependencies
- add a controller

gradle build
./gradlew clean build
./gradlew bootRun

post to /api/questions
needs application/json content-type

# Software Requirements
- jdk 21
- gradle
- check:
  - java -version
  - gradle -version
# Development Requirements
- intellij idea
# example in arch
- sudo pacman -Sy jdk21-openjdk intellij-idea-community-edition gradle
- export _JAVA_AWT_WM_NONREPARENTING=1
- export AWT_TOOLKIT=MToolkit

=======
# cautious-bassoon
springboot surveys 1
