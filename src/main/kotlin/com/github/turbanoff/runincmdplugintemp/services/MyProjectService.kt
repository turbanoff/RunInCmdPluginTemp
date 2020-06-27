package com.github.turbanoff.runincmdplugintemp.services

import com.intellij.openapi.project.Project
import com.github.turbanoff.runincmdplugintemp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
