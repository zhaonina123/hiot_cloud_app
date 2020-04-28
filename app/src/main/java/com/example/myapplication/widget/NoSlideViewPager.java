package com.example.myapplication.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class NoSlideViewPager extends ViewPager{
    public NoSlideViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context,attrs);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
       // return super.onTrackballEvent(event);
        return false;
    }
}
