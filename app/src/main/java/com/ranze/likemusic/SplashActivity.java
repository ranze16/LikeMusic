package com.ranze.likemusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ranze.component.api.ComponentManager;
import com.ranze.componentservice.router.component.ComponentName;
import com.ranze.componentservice.router.component.main.MainComponent;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.start_main_activity).setOnClickListener((view) ->
        {
            try {
                MainComponent mainComponent = (MainComponent) ComponentManager.getInstance().getComponent(ComponentName.MAIN);
                mainComponent.getMainService().startMainActivity();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
