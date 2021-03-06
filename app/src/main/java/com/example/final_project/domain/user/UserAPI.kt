package com.example.final_project.domain.user

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface UserAPI {
    @POST("account/register/user")
    fun registerUser(@Body userAccount: UserAccount): Call<UserResponseMessage>

    @GET("user/profile/detail/{id}")
    fun getUserByID(@Path("id") id: String): Call<UserResponseMessage>

    @Multipart
    @POST("user/profile/image/upload/{id}")
    fun uploadUserProfilePicture(
        @Part imagename: MultipartBody.Part,
        @Path("id") id: String
    ): Call<UserResponseMessage>

    @POST("user/profile/update/location/{id}")
    fun updateUserLocationByID(
        @Path("id") id: String,
        @Body userLocation: UserLocation
    ): Call<UserResponseMessage>

    @POST("user/profile/update/{id}")
    fun updateUserProfileByID(
        @Path("id") id: String,
        @Body userProfile: UserProfile
    ): Call<UserResponseMessage>
}