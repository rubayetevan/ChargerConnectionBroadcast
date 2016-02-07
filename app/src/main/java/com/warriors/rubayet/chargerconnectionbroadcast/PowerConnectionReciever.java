package com.warriors.rubayet.chargerconnectionbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerConnectionReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent)
    {
        String action = intent.getAction();
        Toast.makeText(context,action, Toast.LENGTH_LONG).show();
    }
}
