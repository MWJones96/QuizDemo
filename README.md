# QuizDemo

Learning Kotlin + Clean Architecture + TDD, through a small Android quiz app.

## Overview

QuizDemo is a learning project for building an Android app in Kotlin with a Clean Architecture layout and test-driven development. It is at a very early stage: the domain entities for a quiz are defined, and the app itself is still the Android Studio starter screen.

## What is implemented

- Domain entities in `domain/entities/QuizEntity.kt`:
  - `QuizQuestionEntity`: a question, its list of possible answers and the correct answer.
  - `QuizQuestionListEntity`: a list of quiz questions.
- `MainActivity`, which shows the default "Hello World!" layout.

No quiz screens, data sources, use cases or project-specific tests exist yet.

## Tech stack

- Kotlin 1.3.71
- Android SDK: compile and target SDK 28, minimum SDK 16, build tools 29.0.3
- AndroidX `appcompat` 1.0.2, `core-ktx` 1.0.2, `constraintlayout` 1.1.3
- JUnit 4.12, AndroidX Test and Espresso 3.2.0 for tests
- Gradle 5.6.4 (wrapper) with Android Gradle plugin 3.6.3

## Getting started

### Prerequisites

- Android Studio, or an Android SDK with API level 28 and build tools 29.0.3.
- A JDK that Android Gradle plugin 3.6 and Gradle 5.6 support (JDK 8 is the safe choice).

### Build and run

Open the project in Android Studio and run the `app` configuration, or use the Gradle wrapper:

```sh
./gradlew assembleDebug      # build the debug APK
./gradlew installDebug       # install it on a connected device or emulator
```

Note that the application ID in `app/build.gradle` is `com.example.pubinfo`, while the code package is `com.example.quizdemo`.

## Tests

Only the default Android Studio example tests are present so far.

```sh
./gradlew test                   # local unit tests
./gradlew connectedAndroidTest   # instrumented tests (needs a device or emulator)
```

## Project structure

```
app/build.gradle                       Module build: SDK versions and dependencies
app/src/main/java/com/example/quizdemo/
  MainActivity.kt                      Starter activity
  domain/entities/QuizEntity.kt        Quiz question and question-list entities
app/src/main/res/                      Layout, strings, theme and launcher icons
app/src/test/                          Local unit tests
app/src/androidTest/                   Instrumented tests
```

## Status

Early work in progress. The build uses the `jcenter()` repository, which has since been shut down, so building today may need the repositories and Gradle versions updated.
