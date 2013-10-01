package com.uofu.palettepaint;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Andres on 9/19/13.
 */
public class OvalLayout extends ViewGroup {

    public OvalLayout(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (int childIndex = 0; childIndex < getChildCount(); childIndex++){
            View child = getChildAt(childIndex);
            RectF rectF = new RectF();
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float)getWidth();
            rectF.bottom = (float)getHeight();
        }
    }
}
