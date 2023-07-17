package com.vitaniapermatasari_202102334.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity
{
    private Button _tampilkMahasiswaButton, _tampilForexButton, _tampilCuacaButton;
    private Intent _tampilMahasisawaIntent, _tampilForexIntent, _tampilCuacaIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaButton();
    }

    private void initTampilForexButton()
    {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);
        _tampilForexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });
    }
    private void initTampilMahasiswaButton()
    {
        _tampilkMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);

        _tampilkMahasiswaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                _tampilMahasisawaIntent = new Intent(getApplicationContext(),TampilMahasiswaActivity.class);
                startActivity(_tampilMahasisawaIntent);
            }
        });
    }

    private void initTampilCuacaButton()
    {
        _tampilCuacaButton = findViewById(R.id.tampilCuacaButton);

        _tampilCuacaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _tampilCuacaIntent = new Intent(getApplicationContext(),CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }
}
