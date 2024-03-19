package com.example.solutionx.feautres.login.common

import android.net.http.HttpException
import java.io.IOException

class SolutionXException(private val e: Exception) : Exception() {
    fun findExceptionType():Exception {
        when (e) {
            is IOException -> {
                throw IOException("Couldn't reach server. Check your internet connection.")
            }

            is RuntimeException -> {
                throw RuntimeException("An unexpected error occured")
            }

            is ClassNotFoundException -> {
                throw ClassNotFoundException("An unexpected error")
            }

            is CloneNotSupportedException -> {
                throw CloneNotSupportedException("An unexpected error")
            }
//            is HttpException


        }
        return e
    }
}









