package com.trivia.databinding;
import com.trivia.R;
import com.trivia.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.trivia.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txtTitle, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtAnswerandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mainActivityVM.strUserAnswer.getValue()
            //         is mainActivityVM.strUserAnswer.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtAnswer);
            // localize variables for thread safety
            // mainActivityVM.strUserAnswer
            androidx.lifecycle.MutableLiveData<java.lang.String> mainActivityVMStrUserAnswer = null;
            // mainActivityVM.strUserAnswer != null
            boolean mainActivityVMStrUserAnswerJavaLangObjectNull = false;
            // mainActivityVM.strUserAnswer.getValue()
            java.lang.String mainActivityVMStrUserAnswerGetValue = null;
            // mainActivityVM
            com.trivia.ui.activity.view_model.MainActivityViewModel mainActivityVM = mMainActivityVM;
            // mainActivityVM != null
            boolean mainActivityVMJavaLangObjectNull = false;



            mainActivityVMJavaLangObjectNull = (mainActivityVM) != (null);
            if (mainActivityVMJavaLangObjectNull) {


                mainActivityVMStrUserAnswer = mainActivityVM.getStrUserAnswer();

                mainActivityVMStrUserAnswerJavaLangObjectNull = (mainActivityVMStrUserAnswer) != (null);
                if (mainActivityVMStrUserAnswerJavaLangObjectNull) {




                    mainActivityVMStrUserAnswer.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (android.widget.LinearLayout) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            );
        this.edtAnswer.setTag(null);
        this.llLoader.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mbtnSubmit.setTag(null);
        this.txtQuestion.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.trivia.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainActivityVM == variableId) {
            setMainActivityVM((com.trivia.ui.activity.view_model.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainActivityVM(@Nullable com.trivia.ui.activity.view_model.MainActivityViewModel MainActivityVM) {
        this.mMainActivityVM = MainActivityVM;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.mainActivityVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainActivityVMShowLoader((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMainActivityVMStrUserAnswer((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeMainActivityVMQuestionList((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainActivityVMShowLoader(androidx.lifecycle.MutableLiveData<java.lang.Boolean> MainActivityVMShowLoader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainActivityVMStrUserAnswer(androidx.lifecycle.MutableLiveData<java.lang.String> MainActivityVMStrUserAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainActivityVMQuestionList(androidx.lifecycle.MutableLiveData<java.lang.String> MainActivityVMQuestionList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> mainActivityVMShowLoader = null;
        java.lang.String mainActivityVMStrUserAnswerGetValue = null;
        int mainActivityVMShowLoaderViewVISIBLEViewGONE = 0;
        java.lang.String mainActivityVMQuestionListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mainActivityVMStrUserAnswer = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> mainActivityVMQuestionList = null;
        java.lang.Boolean mainActivityVMShowLoaderGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMainActivityVMShowLoaderGetValue = false;
        com.trivia.ui.activity.view_model.MainActivityViewModel mainActivityVM = mMainActivityVM;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (mainActivityVM != null) {
                        // read mainActivityVM.showLoader
                        mainActivityVMShowLoader = mainActivityVM.getShowLoader();
                    }
                    updateLiveDataRegistration(0, mainActivityVMShowLoader);


                    if (mainActivityVMShowLoader != null) {
                        // read mainActivityVM.showLoader.getValue()
                        mainActivityVMShowLoaderGetValue = mainActivityVMShowLoader.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mainActivityVM.showLoader.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMainActivityVMShowLoaderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mainActivityVMShowLoaderGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMainActivityVMShowLoaderGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mainActivityVM.showLoader.getValue()) ? View.VISIBLE : View.GONE
                    mainActivityVMShowLoaderViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMainActivityVMShowLoaderGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (mainActivityVM != null) {
                        // read mainActivityVM.strUserAnswer
                        mainActivityVMStrUserAnswer = mainActivityVM.getStrUserAnswer();
                    }
                    updateLiveDataRegistration(1, mainActivityVMStrUserAnswer);


                    if (mainActivityVMStrUserAnswer != null) {
                        // read mainActivityVM.strUserAnswer.getValue()
                        mainActivityVMStrUserAnswerGetValue = mainActivityVMStrUserAnswer.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (mainActivityVM != null) {
                        // read mainActivityVM.questionList
                        mainActivityVMQuestionList = mainActivityVM.getQuestionList();
                    }
                    updateLiveDataRegistration(2, mainActivityVMQuestionList);


                    if (mainActivityVMQuestionList != null) {
                        // read mainActivityVM.questionList.getValue()
                        mainActivityVMQuestionListGetValue = mainActivityVMQuestionList.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtAnswer, mainActivityVMStrUserAnswerGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtAnswer, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtAnswerandroidTextAttrChanged);
            this.mbtnSubmit.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.llLoader.setVisibility(mainActivityVMShowLoaderViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtQuestion, mainActivityVMQuestionListGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mainActivityVM
        com.trivia.ui.activity.view_model.MainActivityViewModel mainActivityVM = mMainActivityVM;
        // mainActivityVM != null
        boolean mainActivityVMJavaLangObjectNull = false;



        mainActivityVMJavaLangObjectNull = (mainActivityVM) != (null);
        if (mainActivityVMJavaLangObjectNull) {



            mainActivityVM.clickOnSubmitButton(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainActivityVM.showLoader
        flag 1 (0x2L): mainActivityVM.strUserAnswer
        flag 2 (0x3L): mainActivityVM.questionList
        flag 3 (0x4L): mainActivityVM
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(mainActivityVM.showLoader.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(mainActivityVM.showLoader.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}