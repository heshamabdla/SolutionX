package com.example.mysolutionx.common.data.Repository.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.mysolutionx.features.login.domain.models.User
import com.example.solutionx.common.domain.Repository.local.ILoginLocalDS
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

const val DataStore_NAME = "PERSON"
val Context.datastore : DataStore<Preferences> by  preferencesDataStore(name = DataStore_NAME)

class LocalDSImp(@ApplicationContext private val context: Context,
                 private val gson: Gson
    ) : ILoginLocalDS {

        companion object{
            var tokenKey = stringPreferencesKey("ToKEN")
            var messageKey = stringPreferencesKey("MESSAGE")
            var userKey = stringPreferencesKey("USER")
        }


        override suspend fun getAccessToken(): Flow<String?> {
            return context.datastore.data.map {
                p -> p[tokenKey]
            }
        }

    override suspend fun getUser(): Flow<User?> {
        return context.datastore.data.map { p->
                val userJson= p[userKey] ?: return@map null
                userJson.let {
                   gson.fromJson(it,User::class.java)}
        }
    }

    override suspend fun saveLogin(loginResponse: LoginResponse) {
        context.datastore.edit { p->
            p[tokenKey] = loginResponse.token
            p[userKey]= gson.toJson(loginResponse.user)
//            p[messageKey] = loginResponse.message


        }
    }


    }
