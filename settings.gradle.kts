pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "gala"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":cores")
include(":feature")
include(":feature:home")
include(":cores:domain")
include(":cores:data")
include(":cores:component")
include(":feature:settings")
include(":feature:news")
