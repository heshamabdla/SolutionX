package com.example.solutionx.feautres.login.common

import android.net.http.HttpException
import java.io.IOException

class SolutionXException(private val e: Exception) : Exception() {

    fun findExceptionType():Exception {
        when (e) {
            is IOException -> {
                return IOException("Couldn't reach server. Check your internet connection.)")
            }

            is RuntimeException -> {
                return RuntimeException("An unexpected error occured")
            }

            is ClassNotFoundException -> {
                return ClassNotFoundException("An unexpected error")
            }

            is CloneNotSupportedException -> {
                return CloneNotSupportedException("An unexpected error")
            }
//            is HttpException

        }
        return e
    }
}









