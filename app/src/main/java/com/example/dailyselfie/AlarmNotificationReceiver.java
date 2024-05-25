package com.example.dailyselfie;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class AlarmNotificationReceiver extends BroadcastReceiver {
    private static final int MY_NOTIFICATION_ID = 1;

    private final CharSequence tickerText = "Do you know what time is?!";
    private final CharSequence contentTitle = "Daily Selfie";
    private final CharSequence contentText = "Time to get your daily selfie! :)";

    private Intent mNotificationIntent;
    private PendingIntent mContentIntent;

    RemoteViews mContentView = new RemoteViews("com.example.dailyselfie", R.layout.custom_notification);

    @Override
    public void onReceive(Context context, Intent intent) {
        mNotificationIntent = new Intent(context, MainActivity.class);

        mContentIntent = PendingIntent.getActivity(context, 0, mNotificationIntent, Intent.FLAG_ACTIVITY_NEW_TASK);

        mContentView.setTextViewText(R.id.content_title, contentTitle);
        mContentView.setTextViewText(R.id.content_text, contentText);

        Notification.Builder notificationBuilder = new Notification.Builder(context)
                .setTicker(tickerText)
                .setSmallIcon(R.mipmap.ic_camera)
                .setAutoCancel(true)
                .setContentIntent(mContentIntent)
                .setContent(mContentView);

        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        mNotificationManager.notify(MY_NOTIFICATION_ID, notificationBuilder.build());
    }
}
