package com.vitaniapermatasari_202102334.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity
{
    private Button _tampilkMahasiswaButton;
    private Intent _tampilMahasisawaIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initTampilMahasiswaButton();
    }

    private void initTampilMahasiswaButton(){
        _tampilkMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);

        _tampilkMahasiswaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view) {
                _tampilMahasisawaIntent = new Intent(getApplicationContext(),TampilMahasiswaActivity.class);
                startActivity(_tampilMahasisawaIntent);

            }
        });
    }
}