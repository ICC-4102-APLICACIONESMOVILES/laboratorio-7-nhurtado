package com.example.ing.myapplication;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import java.util.Random;

/**
 * Created by ING on 22-05-2018.
 */

public class AlarmReceiver extends BroadcastReceiver
{
    private int id;
    @Override
    public void onReceive(Context context, Intent arg1)
    {
        Log.i("AAAAA", "Aralmaquiesta");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Notification")
                .setContentText("Text!!");

        PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
                new Intent(context, MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);


        mBuilder.setContentIntent(contentIntent);
        
        Random rand = new Random();
        int id = rand.nextInt();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(id,mBuilder.build());;
    }
}