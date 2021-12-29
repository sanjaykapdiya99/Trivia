package com.trivia.data.repository

import com.trivia.data.model.QuestionAnswerResponseItem
import com.trivia.data.remote.retrofit.RetrofitClient
import retrofit2.Response

class QuestionAnswerRepository {
    suspend fun getAllQuestionAnswer(): Response<ArrayList<QuestionAnswerResponseItem>> {
        return RetrofitClient.retrofit.getExploreData()
    }
}