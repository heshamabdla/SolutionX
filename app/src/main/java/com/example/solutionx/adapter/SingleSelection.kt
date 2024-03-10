package com.example.solutionx.adapter

import java.io.Serializable

interface SingleSelection {
        var id: Int
        var name: String
        var selected: Boolean
        fun getIconRes(): Int = -1

}