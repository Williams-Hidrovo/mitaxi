package com.willdev.mitaxi.presentation.screens.auth.login

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel(){
    var state by mutableStateOf(LoginState())
        private set

    fun onEmailInput(newEmail:String){
        state=state.copy(email = newEmail)
    }

    fun onPasswordInput(newPassword:String){
        state=state.copy(password = newPassword)
    }

    fun loginSubmit(){
        Log.d( "LoginViewModel","EMAIL: ${state.email}")
        Log.d( "LoginViewModel","PASSWORD: ${state.password}")
    }

}