package com.xwc.customcontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * describe:
 * author: xuweichao
 * date: 2019/11/11 16:25
 */
public class BGLinearLayout extends LinearLayout {

    private Context mContext;

    public BGLinearLayout(Context context) {
        super(context);
        mContext = context;
    }

    public BGLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public BGLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    public void setText(String text) {
        for (int i = 0; i < text.length(); i++) {
            String t = text.substring(i, i+1);

            TextView child = new TextView(mContext);
            child.setText(t);
            child.setTextSize(14);
            child.setTextColor(getResources().getColor(R.color.colorAccent));

            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.setMargins(4, 0, 0, 0);

            if (!t.equals(",") && !t.equals(".")) {
                child.setBackgroundResource(R.drawable.bg_gray_stroke);
                lp.width = 24;
            }

            child.setLayoutParams(lp);

            child.setGravity(Gravity.CENTER);

            this.addView(child);
        }
    }
}
