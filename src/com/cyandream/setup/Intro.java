package com.cyandream.setup;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_setup);
    }
    public void next (final View view) {
        startActivity(new Intent(this, UCSelect.class));
        finish();
    }
    public void skip (final View view) {
        startActivity(new Intent (this, Goodbye.class));
        finish();
    }
}
