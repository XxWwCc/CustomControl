package com.xwc.customcontrol.ccbg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * describe:
 * author: xuweichao
 * date: 2019/11/11 11:35
 */
public class CCView extends AppCompatTextView {

    private Paint mPaint;
    private Paint textPaint;
    private String text = "0";

    public CCView(Context context) {
        super(context);
        init();
    }

    public CCView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CCView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.parseColor("#cccccc"));
        mPaint.setStyle(Paint.Style.STROKE);

        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(Color.parseColor("#F96165"));
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(16);
    }

    public void setText(String text) {
        this.text = text;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!text.equals(",") && !text.equals(".")) {
            canvas.drawRect(24, 0, 40, 30, mPaint);
            canvas.drawText(text, 28, 20, textPaint);
        } else {
            canvas.drawText(text, 28, 20, textPaint);
        }
    }
}
