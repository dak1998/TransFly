package com.example.myapplication.utils;

/**
 * Created by Owner on 16-Mar-18.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;

import android.util.AttributeSet;
import android.view.View;


/**
 * Created by Owner on 06-Dec-17.
 */

public class MyTextViewBold extends android.support.v7.widget.AppCompatTextView {

    public MyTextViewBold(Context context, AttributeSet attributeSet, int defStyle){
        super(context,attributeSet,defStyle);
        init();
    }

    public MyTextViewBold(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        init();
    }

    public MyTextViewBold(Context context){
        super(context);
        init();
    }

    public void init()
    {
        Typeface tf=Typeface.createFromAsset(getContext().getAssets(),"fonts/roboto.ttf");
        setTypeface(tf, Typeface.BOLD);
    }
}

