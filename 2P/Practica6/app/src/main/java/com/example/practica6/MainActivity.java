package com.example.practica6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppSurfaceView pongSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        pongSurfaceView = (AppSurfaceView) findViewById(R.id.surfaceView);
        pongSurfaceView.setTextView((TextView) findViewById(R.id.text));

    }

    private static final int MENU_PAUSE = 4;
    private static final int MENU_RESUME = 5;
    private static final int MENU_START_1P = 6;
    private static final int MENU_START_2P = 7;
    private static final int MENU_START_0P = 8;
    private static final int MENU_SOUND_ON = 11;

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(0, MENU_START_1P, 0, R.string.menu_start_1p);
        menu.add(0, MENU_START_2P, 0, R.string.menu_start_2p);
        menu.add(0, MENU_START_0P, 0, R.string.menu_start_0p);
        menu.add(0, MENU_PAUSE, 0, R.string.menu_pause);
        menu.add(0, MENU_RESUME, 0, R.string.menu_resume);
        menu.add(0, MENU_SOUND_ON, 0, R.string.menu_sound);
        return true;
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu)
    {
        AppThread androidPongThread = pongSurfaceView.getAndroidPongThread();
        super.onMenuOpened(featureId, menu);
        androidPongThread.pause();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        AppThread androidPongThread = pongSurfaceView.getAndroidPongThread();
        switch (item.getItemId())
        {
            case MENU_START_1P:
                androidPongThread.doStart1p();
                return true;
            case MENU_START_2P:
                androidPongThread.doStart2p();
                return true;
            case MENU_START_0P:
                androidPongThread.doStart0p();
                return true;
            case MENU_PAUSE:
                androidPongThread.pause();
                return true;
            case MENU_RESUME:
                androidPongThread.unpause();
                return true;
            case MENU_SOUND_ON:
                androidPongThread.toggleSound();
                return true;
        }

        return false;
    }

    /**
     * Invoked when the Activity loses user focus.
     */
    @Override
    protected void onPause()
    {
        super.onPause();
        AppThread androidPongThread = pongSurfaceView.getAndroidPongThread();
        androidPongThread.pause(); // pause game when Activity pauses
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        AppThread androidPongThread = pongSurfaceView.getAndroidPongThread();
        androidPongThread.resumeGame();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        SoundManager.cleanup();
    }
}