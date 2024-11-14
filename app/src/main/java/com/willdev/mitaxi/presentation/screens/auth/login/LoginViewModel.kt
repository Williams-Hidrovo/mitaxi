package com.willdev.mitaxi.presentation.screens.auth.login

import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor():ViewModel(){
    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf(value = "");

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

    fun showError(){
        Log.d("LoginError",errorMessage)
    }

    fun isValidForm():Boolean{
        errorMessage=""
        if(state.email==""){
            errorMessage="El email no puede estar vacio"
            return false
        }
        else if(state.password.isEmpty()){
            errorMessage="Ingresar el password"
            return false
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()){
            errorMessage="Ingrese un correo valido"
            return false
        }
        else if(state.password.length<6){
            errorMessage="El password debe tener al menos 6 caracteres"
            return false
        }
        return true
    }

}