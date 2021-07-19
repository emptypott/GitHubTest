package com.example.githubapitest.retrofit

import com.example.githubapitest.Profile
import com.example.githubapitest.Repos
import retrofit2.Call
import retrofit2.http.GET

interface API {

    @GET("/jakewharton")
    fun getUserProfile() : Call<Profile>

    @GET("/jakewharton/repos")
    fun getUserRepos() : Call<Repos>
}