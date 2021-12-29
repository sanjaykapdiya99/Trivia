package com.trivia.ui.activity.view_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lcom/trivia/ui/activity/view_model/MainActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "questionList", "Landroidx/lifecycle/MutableLiveData;", "", "getQuestionList", "()Landroidx/lifecycle/MutableLiveData;", "setQuestionList", "(Landroidx/lifecycle/MutableLiveData;)V", "showLoader", "", "getShowLoader", "setShowLoader", "strRightAnswer", "getStrRightAnswer", "()Ljava/lang/String;", "setStrRightAnswer", "(Ljava/lang/String;)V", "strUserAnswer", "getStrUserAnswer", "setStrUserAnswer", "valueIndex", "", "getValueIndex", "()I", "setValueIndex", "(I)V", "clickOnSubmitButton", "", "v", "Landroid/view/View;", "getQuestionAnswerData", "context", "Landroid/content/Context;", "showResultsDialog", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    private int valueIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> questionList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showLoader;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strRightAnswer = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> strUserAnswer;
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final int getValueIndex() {
        return 0;
    }
    
    public final void setValueIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getQuestionList() {
        return null;
    }
    
    public final void setQuestionList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowLoader() {
        return null;
    }
    
    public final void setShowLoader(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrRightAnswer() {
        return null;
    }
    
    public final void setStrRightAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStrUserAnswer() {
        return null;
    }
    
    public final void setStrUserAnswer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void getQuestionAnswerData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void clickOnSubmitButton(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void showResultsDialog(android.view.View v) {
    }
}