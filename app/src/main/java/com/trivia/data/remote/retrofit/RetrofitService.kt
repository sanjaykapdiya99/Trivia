package com.trivia.data.remote.retrofit

import com.trivia.data.model.QuestionAnswerResponseItem
import com.trivia.data.remote.urls_keys.URL
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {
    @GET(URL.END_POINT)
    suspend fun getExploreData(): Response<ArrayList<QuestionAnswerResponseItem>>
}