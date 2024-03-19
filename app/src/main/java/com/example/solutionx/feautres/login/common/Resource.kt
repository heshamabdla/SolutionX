package com.example.solutionx.feautres.login.common

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Failure<T>(exception: SolutionXException):Resource<T>()
    class Loading<T>(loading:Boolean) : Resource<T>()

}
