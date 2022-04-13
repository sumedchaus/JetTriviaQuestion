package com.cs.jettriviaquestion.network

import com.cs.jettriviaquestion.model.Question
import com.cs.jettriviaquestion.model.QuestionItem
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
    //or
//    suspend fun getAllQuestions(): List<QuestionItem>

}