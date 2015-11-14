package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by edu on 08/11/2015.
 */
public class ThreeTwoImageVIew extends ImageView {

    public ThreeTwoImageVIew(Context context) {
        super(context);
    }

    public ThreeTwoImageVIew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImageVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
