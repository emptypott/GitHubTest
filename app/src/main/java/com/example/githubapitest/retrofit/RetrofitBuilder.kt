package com.example.githubapitest.retrofit

import android.security.identity.AccessControlProfileId
import retrofit2.Retrofit

object RetrofitBuilder {
    var api: API

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/users/")
    }
}