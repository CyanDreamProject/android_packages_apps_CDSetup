package com.cyandream.setup;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class UCSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc_setup);
        //cmaccount();
    }
    private void cmaccount () {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setComponent(new ComponentName("com.cyanogenmod.account","com.cyanogenmod.account.ui.SetupWizardActivity"));
        startActivity(intent);
    }
    public void select (final View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setComponent(new ComponentName("com.cyandream.controlcenter","com.cyandream.controlcenter.updatechecker.Preferences"));
        startActivity(intent);
    }
    public void next (final View view) {
        startActivity(new Intent (this, Goodbye.class));
    }
}
