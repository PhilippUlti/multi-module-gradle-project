/*
    Name of the root-project: In our case it is "multi-module-gradle-project",
    but it can also be something like DataFramework or whatever you are working on
 */
rootProject.name = "multi-module-gradle-project"

/*
    If you want to add a new module use:
    include("module-name")

    If you want to rename the subproject to be able to build multiple projects with different names:
    project(":module-2").name = "module-2"
 */
include("module-1")
project(":module-1").name = "module-1"
include("module-2")
project(":module-2").name = "module-2"
