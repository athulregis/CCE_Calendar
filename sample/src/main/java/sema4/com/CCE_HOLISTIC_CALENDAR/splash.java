package sema4.com.CCE_HOLISTIC_CALENDAR;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
/**
Shows the splash screen with the icon on app startup
**/
public class splash extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);

    }
}