package com.example.ing.myapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ING on 22-05-2018.
 */

public class autostart extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent arg1)
    {
        //Intent intent = new Intent(context,MainActivity.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //context.startActivity(intent);
        Log.i("AAAAA", "aquiesta");

        AlarmManager am =( AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
        Intent i = new Intent(context, AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(context, 1, i, PendingIntent.FLAG_UPDATE_CURRENT);
        am.setRepeating(AlarmManager.RTC, System.currentTimeMillis(), 1000*60*30, pi);
    }
}