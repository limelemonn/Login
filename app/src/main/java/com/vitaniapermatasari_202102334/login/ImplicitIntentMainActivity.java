package com.vitaniapermatasari_202102334.login;
import androidx.appcompat.app.AppCompatActivity;


import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

public class ImplicitIntentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent_main);
    }
    public void tampilTelepon (View view) {
        Intent teleponIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(teleponIntent);
    }
    public void tampilSms(View view){
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        startActivity(smsIntent);
    }
    public void tampilKalender(View view){
        Intent kalenderIntent = new Intent(Intent.ACTION_MAIN);
        startActivity(kalenderIntent);
    }
    public void tampilBrowser(View view){
        Intent BrowserIntent = new Intent(Intent.ACTION_MAIN);
        startActivity(BrowserIntent);
    }
    public void tampilKalkulator(View view) {
        try {
            Intent kalkulatorIntent = new Intent(Intent.ACTION_MAIN);
            kalkulatorIntent.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName cn = new ComponentName("com.android.calculator2", "com.android.calculator2.calculator");
            kalkulatorIntent.setComponent(cn);

            startActivity(kalkulatorIntent);
        } catch (ActivityNotFoundException anfe) {
            Toast.makeText(getApplicationContext(), "Aplikasi tidak ditemukan", Toast.LENGTH_LONG).show();
        }
    }
    public void tampilKontak(View view){
        Intent kontakIntent = new Intent(Intent.ACTION_MAIN);
        kontakIntent.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(kontakIntent);
    }
    public void tampilGaleri(View view){
        Intent galeriIntent = new Intent(Intent.ACTION_MAIN);
        galeriIntent.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(galeriIntent);
    }
    public void tampilWiFi(View view){
        Intent wifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(wifiIntent);
    }
    public void tampilSound(View view) {
        Intent soundIntent = new Intent(Settings.ACTION_SOUND_SETTINGS);
        startActivity(soundIntent);
    }
    public void tampilAirplane(View view) {
        Intent airplaneIntent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivity(airplaneIntent);
    }
    public void tampilAplikasi(View view) {
        Intent aplikasiIntent = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        startActivity(aplikasiIntent);
    }
    public void tampilBluetooth(View view) {
        Intent bluetoothIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(bluetoothIntent);
    }
}