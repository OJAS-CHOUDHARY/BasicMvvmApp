package com.ojasx.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ojasx.mvvm.model.UserData
import com.ojasx.mvvm.model.UserRepository
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    val userRepository : UserRepository = UserRepository()
    private val _userData = MutableLiveData<UserData>()
    val userdata = _userData

    fun getUserData(){
        viewModelScope.launch{
            val userResult = userRepository.fetchUserData()
            _userData.postValue(userResult)

        }
    }

}