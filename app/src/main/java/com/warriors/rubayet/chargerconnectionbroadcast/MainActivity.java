package com.warriors.rubayet.chargerconnectionbroadcast;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on (View view)
    {
        ComponentName receive = new ComponentName(this,PowerConnectionReciever.class);
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(
                receive,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
    }
    public void off (View view)
    {
        ComponentName receive = new ComponentName(this,PowerConnectionReciever.class);
        PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(
                receive,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
    }



}
