package com.example.dubhacks2019.ui.community;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CommunityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CommunityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("View your friends!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}