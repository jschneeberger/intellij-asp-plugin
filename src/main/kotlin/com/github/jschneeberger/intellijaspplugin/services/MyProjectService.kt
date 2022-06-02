package com.github.jschneeberger.intellijaspplugin.services

import com.intellij.openapi.project.Project
import com.github.jschneeberger.intellijaspplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
