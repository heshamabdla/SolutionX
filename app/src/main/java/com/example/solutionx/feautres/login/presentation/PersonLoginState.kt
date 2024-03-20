package com.example.solutionx.feautres.login.presentation

import android.text.BoringLayout
import com.example.solutionx.feautres.login.common.Resource
import com.example.solutionx.feautres.login.domain.models.Person


sealed class PersonLoginState(
){
    data class IsLoading(val loading: Boolean):PersonLoginState()
    data class Success(val person: Person?):PersonLoginState()
    data class Error(val error: String?):PersonLoginState()
}
