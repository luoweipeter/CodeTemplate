package com.github.luoweipeter.codetemplate.services

import com.intellij.openapi.project.Project
import com.github.luoweipeter.codetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
