package com.example.solutionx.feautres.login.data.repository.datasource.localDS

import android.content.Context
import android.provider.ContactsContract.Data
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.mysolutionx.features.login.domain.models.LoginResponse
import com.example.mysolutionx.features.login.domain.models.User
import kotlinx.coroutines.flow.map


//const val DataStore_NAME = "PHONEBOOK"
//
//val Context.datastore : DataStore< Preferences> by  preferencesDataStore(name = DataStore_NAME)
//
//internal class LoginLocalDS(private val context: Context) : LoginLocalDSInterface {
//    companion object{
//        val token = stringPreferencesKey("ToKEN")
//        val message = stringPreferencesKey("MESSAGE")
////        val user = stringPreferencesKey("USER")
//    }
//    override suspend fun saveLogin(loginResponse: LoginResponse) {
//        context.datastore.edit { l->
//            l[token] = loginResponse.token
//            l[message]= loginResponse.message
////            l[user]= loginResponse.user
//
//
//    }
//        }
//
//    override suspend fun getAccessToken(): String {
//        context.datastore.data.map { l ->
//            l(
//                token = l[token]!!z,
//
//            )
//        }
//        return token
//
//    }
//
//    override suspend fun getUser(): User {
//        TODO("Not yet implemented")
//    }
//
//
//}