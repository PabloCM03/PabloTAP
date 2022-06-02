package com.example.practica6;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;


public class AppSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    private AppThread androngThread;
    private TextView statusText;
    private SurfaceHolder holder;
    private Context context;

    public AppSurfaceView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        this.context = context;
        this.holder = getHolder();
        holder.addCallback(this);
        setFocusable(true);
        androngThread = CreateNewAppThread();
    }

    private AppThread CreateNewAppThread() {

        Toast toast = Toast.makeText(context, "Selecciona un tipo de juego", Toast.LENGTH_LONG);
        toast.show();

        return new AppThread(holder, context, new Handler()
        {
            @Override
            public void handleMessage(Message m)
            {
                Bundle bundle = m.getData();
                if (bundle.containsKey("viz"))
                {
                    statusText.setVisibility(m.getData().getInt("viz"));
                    statusText.setText(m.getData().getString("text"));
                }
                else if (bundle.containsKey("toast"))
                {
                    Toast toast = Toast.makeText(context, bundle.getString("toast"), Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }

    public void setTextView(TextView textView)
    {
        statusText = textView;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder)
    {
        androngThread.setRunning(true);
        try
        {
            androngThread.start();
        }
        catch (Exception error)
        {
            androngThread = CreateNewAppThread();
            androngThread.start();
            androngThread.setRunning(true);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int format, int width, int height)
    {
        androngThread.setSurfaceSize(width, height);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder)
    {
        androngThread.setRunning(false);
        boolean retry = true;
        while (retry)
        {
            try
            {
                androngThread.join();
                retry = false;
            }
            catch (InterruptedException e)
            {
            }
        }
    }

    public AppThread getAndroidPongThread()
    {
        return androngThread;
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus)
    {
        if (!hasWindowFocus)
        {
            androngThread.pause();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        float xPosition1 = 0;
        float yPosition1 = 0;
        float xPosition2 = 0;
        float yPosition2 = 0;

        for (int pointerIndex = 0; pointerIndex < event.getPointerCount(); pointerIndex++)
        {
            if (pointerIndex == 0)
            {
                xPosition1 = event.getX(pointerIndex);
                yPosition1 = event.getY(pointerIndex);
            }

            if (pointerIndex == 1)
            {
                xPosition2 = event.getX(pointerIndex);
                yPosition2 = event.getX(pointerIndex);
            }
        }

        switch (event.getAction())
        {
            case MotionEvent.ACTION_MOVE:
                androngThread.setBattPosition(xPosition1, yPosition1, xPosition2, yPosition2);
                break;
        }
        return true;
    }
}
