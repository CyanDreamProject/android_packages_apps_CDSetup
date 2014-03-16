package com.cyandream.setup;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainSetup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_setup);
    }
    public void next (final View view) {
        PackageManager pm=getPackageManager();
        try {
            PackageInfo info=pm.getPackageInfo("com.google.android.gsf",PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("Google", "No GApps!");
        }
        startActivity(new Intent (this, Intro.class));
    }
}
