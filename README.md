# Multi-Module-Gradle-Project

This is a **multi-module** gradle template project. For example it can be used to provide support for different plugin modules for both bukkit and proxy specific software


# Setup

Setup this project by cloning the repository

## Create new modules

New modules can easily be created using the **settings.gradle.kts**:
```kotlin
include("your-module-name")
project(":your-module-name").name = "YourCustomModuleName"
```
## Add module specific plugins/dependencies/repositories

By splitting a project into multiple modules you are allowed to add module-specific plugins, repositories and dependencies to provide only the information needed for each module. You are also able to create dependencies between two or more modules within the same root project using `implementation(project(":your-module-name"))`. These additions need to be made inside the **build.gradle.kts** (an example could look like this):
```kotlin
plugins {
	id("com.github.johnrengelman.shadow") version "5.1.0"
}
repositories {
	maven("https://papermc.io/repo/repository/maven-public/")
}
dependencies {
	compileOnly("com.sk89q.worldedit:worldedit-bukkit:7.2.0-SNAPSHOT")
}
```

## Add new gradle tasks
