package com.example.easyfood.retrofit

import com.example.easyfood.data_model.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {
    @GET("random.php")
    fun getRandomMeal() : Call<MealList>
}