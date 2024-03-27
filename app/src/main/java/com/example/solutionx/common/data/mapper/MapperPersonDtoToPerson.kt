package com.example.solutionx.feautres.login.data.mapper

import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.solutionx.feautres.login.data.dto.PersonDto

internal object MapperPersonDtoTLoginResponse {
    fun LoginResponse.toPersonDto(): PersonDto {

        return PersonDto(
            message=message, accessToken = token)
    }
        fun PersonDto.toLoginResponse(): LoginResponse {

        return LoginResponse(
            message=message, token =accessToken,null)
    }


}