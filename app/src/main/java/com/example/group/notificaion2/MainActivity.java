package com.example.group.notificaion2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bg,bf,bi,bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       bg=(Button) findViewById(R.id.buttong);
        bf=(Button) findViewById(R.id.buttonf);
        bi=(Button) findViewById(R.id.buttoni);
        bt=(Button) findViewById(R.id.buttont);

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder notificationBuilder= (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.google)
                         .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.google))
                        .setContentTitle("Google")

                        .setContentText("Goto Google page");
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,01,i,0);
                notificationBuilder.setContentIntent(pendingIntent);
                notificationBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
                NotificationManagerCompat notificationManager=NotificationManagerCompat.from(MainActivity.this);
                notificationManager.notify(1,notificationBuilder.build());

            }
        });
        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder notificationBuilder= (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.facebookicon))
                        .setContentTitle("Facebook")

                        .setContentText("Goto Facebook page");
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,01,i,0);
                notificationBuilder.setContentIntent(pendingIntent);
                notificationBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
                NotificationManagerCompat notificationManager=NotificationManagerCompat.from(MainActivity.this);
                notificationManager.notify(1,notificationBuilder.build());

            }
        });
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder notificationBuilder= (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.instagram))
                        .setContentTitle("Instagram")

                        .setContentText("Goto Instagram page");
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com"));
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,01,i,0);
                notificationBuilder.setContentIntent(pendingIntent);
                notificationBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
                NotificationManagerCompat notificationManager=NotificationManagerCompat.from(MainActivity.this);
                notificationManager.notify(1,notificationBuilder.build());

            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder notificationBuilder= (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher_round)
                         .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.twitter))
                        .setContentTitle("Twitter")

                        .setContentText("Goto Twitter page");
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,01,i,0);
                notificationBuilder.setContentIntent(pendingIntent);
                notificationBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
                NotificationManagerCompat notificationManager=NotificationManagerCompat.from(MainActivity.this);
                notificationManager.notify(1,notificationBuilder.build());

            }
        });
    }
}
