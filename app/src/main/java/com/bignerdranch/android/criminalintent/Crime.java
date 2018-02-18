package com.bignerdranch.android.criminalintent;

import android.text.format.DateFormat;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private String mFormattedDate;
    private boolean mSolved;

    Crime() {

        mId = UUID.randomUUID();

        //date stuff for the challenge
        mFormattedDate = DateFormat.format("EEE, MMM dd, yyyy", new Date()).toString();

    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    String getDate() {

        return mFormattedDate;

    }

    boolean isSolved() {
        return mSolved;
    }

    void setSolved(boolean solved) {
        mSolved = solved;
    }
}
