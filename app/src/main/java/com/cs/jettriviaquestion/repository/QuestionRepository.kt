package com.cs.jettriviaquestion.repository

import android.util.Log
import com.cs.jettriviaquestion.data.DataOrException
import com.cs.jettriviaquestion.model.QuestionItem
import com.cs.jettriviaquestion.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val dataOrException = DataOrException<ArrayList<QuestionItem>, Boolean, Exception>()


    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        } catch (
            exception: Exception
        ) {

            dataOrException.e = exception
            Log.d("Exception", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }
}