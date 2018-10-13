package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by rlima on 12/10/18.
 */

public class ProportionThreeTwoImageView extends android.support.v7.widget.AppCompatImageView {

    public ProportionThreeTwoImageView(Context context) {
        super(context);
    }

    public ProportionThreeTwoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProportionThreeTwoImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
