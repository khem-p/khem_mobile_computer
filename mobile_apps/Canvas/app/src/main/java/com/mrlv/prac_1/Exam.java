package com.mrlv.prac_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.view.View;

public class Exam extends View {
    Paint paint;
    String userName;

    public Exam(Context context) {
        super(context);
        paint = new Paint();
        userName = context.getString(R.string.user_name);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw Line
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(25);
        canvas.drawLine(200, 200, 800, 200, paint);

        // Draw Rectangle
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(25);
        canvas.drawRect(200, 400, 400, 600, paint);

        // Draw Circle
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(800, 600, 100, paint);

        // Draw Oval
        paint.setColor(Color.MAGENTA);
        canvas.drawOval(200, 800, 500, 1150, paint);

        // Draw Text
        paint.setColor(Color.GRAY);
        paint.setTextSize(75);
        canvas.drawText(userName, 225, 2100, paint);
    }
}
