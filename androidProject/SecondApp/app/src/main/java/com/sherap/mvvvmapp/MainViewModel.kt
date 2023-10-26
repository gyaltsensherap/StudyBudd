package com.sherap.mvvvmapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sherap.mvvvmapp.event.Event

class MainViewModel : ViewModel() {
    var userName = ""
    var password = ""
    val errorLiveData = MutableLiveData<Event<String>>()
    val validUserToast = MutableLiveData<Event<String>>()
    fun onSignInClick() {
        if (isValidUserNameOrPassword()) {
            validUserToast.value = Event("Valid User")
        }
    }

    private fun isValidUserNameOrPassword(): Boolean {
        return if (userName.isEmpty()) {
            errorLiveData.value = Event("User name is empty")
            false
        } else if (password.isEmpty()) {
            errorLiveData.value = Event("Password is empty")
            false
        } else {
            true
        }
    }
}
