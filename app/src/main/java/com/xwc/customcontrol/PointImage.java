package com.xwc.customcontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

/**
 * describe:
 * author: xuweichao
 * date: 2019/12/5 11:44
 */
public class PointImage extends AppCompatImageView {

    private Paint mPaint;
//    private float[] points = {150,100,400,150,300,350,400,500};

    public PointImage(Context context) {
        super(context);
        init();
    }

    public PointImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PointImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.parseColor("#88880000"));
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(20);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPoint(100, 100, mPaint);
        canvas.save();
        mPaint.setStrokeWidth(40);
        canvas.drawPoint(200, 100, mPaint);
        canvas.save();
        canvas.drawPoint(120, 200, mPaint);
        canvas.save();
        mPaint.setStrokeWidth(60);
        canvas.drawPoint(200, 250, mPaint);
        canvas.save();

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(20);
        canvas.drawText("珠海海露智能物联有限公司", 50, 50, mPaint);
    }
}
