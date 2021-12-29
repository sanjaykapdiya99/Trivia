package com.trivia.ui.activity.view_model

import android.app.Application
import android.content.Context
import android.util.Log
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.trivia.R
import com.trivia.data.repository.QuestionAnswerRepository
import com.trivia.interfaces.SendAnySingleValueInterface
import com.trivia.utils.CommonUtils
import kotlinx.coroutines.launch

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    var valueIndex = 0
    var questionList: MutableLiveData<String> = MutableLiveData()
    var showLoader: MutableLiveData<Boolean> = MutableLiveData(false)
    var strRightAnswer: String = ""
    var strUserAnswer: MutableLiveData<String> = MutableLiveData("")

    fun getQuestionAnswerData(context:Context) {
        if(CommonUtils.isOnline(context)){
            viewModelScope.launch {
                showLoader.value=true
                val listOfData = QuestionAnswerRepository().getAllQuestionAnswer()
                questionList.value = listOfData.body()?.get(valueIndex)?.question ?: ""
                strRightAnswer = listOfData.body()?.get(valueIndex)?.answer ?: ""
                Log.e("~~right",strRightAnswer)
                showLoader.value=false
            }
        }else{
            CommonUtils.showToast(context,context.getString(R.string.pleaseCheckYourInternetConnection))
        }
    }

    fun clickOnSubmitButton(v: View) {
        if (strUserAnswer.value!!.isEmpty()) {
            CommonUtils.showToast(v.context, v.context.getString(R.string.enterYourAnswer))
            return
        }
        showResultsDialog(v)
    }

    private fun showResultsDialog(v: View) {
        val message = if (strUserAnswer.value!!.equals(strRightAnswer,true))
            v.context.getString(R.string.yourAnswerIsRight)
        else v.context.getString(R.string.sorryYourAnswerIsWrong).plus(" ").plus(strRightAnswer)

        CommonUtils.showResultDialog(v.context, message,
            object : SendAnySingleValueInterface {
                override fun sendData(message: String) {
                    strUserAnswer.value = ""
                    strRightAnswer = ""
                    getQuestionAnswerData(v.context)
                }
            })
    }
}