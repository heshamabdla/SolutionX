package com.example.solutionx.feautres.login.presentation


sealed class PersonLoginState(
){
    data class IsLoading(val loading: Boolean):PersonLoginState()
    data class Success(val person: Person?):PersonLoginState()
    data class Error(val error: String?):PersonLoginState()
}
