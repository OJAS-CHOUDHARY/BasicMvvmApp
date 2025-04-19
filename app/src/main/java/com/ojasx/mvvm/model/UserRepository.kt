package com.ojasx.mvvm.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun fetchUserData() : UserData{
        delay(2000)
        return UserData("Ojas",19)
    }
}