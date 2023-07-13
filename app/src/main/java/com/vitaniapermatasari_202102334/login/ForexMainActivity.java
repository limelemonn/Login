package com.vitaniapermatasari_202102334.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.text.DecimalFormat;

import cz.msebera.android.httpclient.Header;

public class ForexMainActivity extends AppCompatActivity {
    private ProgressBar loadingProgresBar;

    private SwipeRefreshLayout swipeRefreshLayout;

    private TextView  bobTextView,brlTextView, bsdTextView, btcTextView, btnTextView, bwpTextView, bynTextView, bzdTextView, cadTextView, cdfTextView, idrTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forex_main);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout1);
        bobTextView = (TextView) findViewById(R.id.bobTextView);
        brlTextView = (TextView) findViewById(R.id.brlTextView);
        bsdTextView = (TextView) findViewById(R.id.bsdTextView);
        btcTextView = (TextView) findViewById(R.id.btcTextView);
        btnTextView = (TextView) findViewById(R.id.btnTextView);
        bwpTextView = (TextView) findViewById(R.id.bwpTextView);
        bynTextView = (TextView) findViewById(R.id.bynTextView);
        bzdTextView = (TextView) findViewById(R.id.bzdTextView);
        cadTextView = (TextView) findViewById(R.id.cadTextView);
        cdfTextView = (TextView) findViewById(R.id.cdfTextView);
        idrTextView = (TextView) findViewById(R.id.idrTextView);
        loadingProgresBar = (ProgressBar)findViewById(R.id.loadingProgressBar);

        initSwipeRefreshLoyout();
        initForex();
    }

    private void initSwipeRefreshLoyout() {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                initForex();
            }
        });}

    public String formatNumber(double number,String format){
        DecimalFormat decimalFormat = new DecimalFormat((format));
        return decimalFormat.format(number);
    }

    private void initForex() {
        loadingProgresBar.setVisibility(TextView.VISIBLE);

        String url = "https://openexchangerates.org/api/latest.json?app_id=938e736120644d3c9f2145f686a108ad";

        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.d("*vps*",new String(responseBody));
                Gson gson = new Gson();
                ForexRootModel rootModel= gson.fromJson(new String(responseBody),ForexRootModel.class);
                ForexRatesModel ratesModel = rootModel.getForexRatesModel();

                double bob = ratesModel.getIDR()/ ratesModel.getBOB();
                double brl = ratesModel.getIDR()/ ratesModel.getBRL();
                double bsd = ratesModel.getIDR()/ ratesModel.getBSD();
                double btn = ratesModel.getIDR()/ ratesModel.getBTN();
                double bwp = ratesModel.getIDR()/ ratesModel.getBWP();
                double byn = ratesModel.getIDR()/ ratesModel.getBYN();
                double bzd = ratesModel.getIDR()/ ratesModel.getBZD();
                double cad = ratesModel.getIDR()/ ratesModel.getCAD();
                double cdf = ratesModel.getIDR()/ ratesModel.getCDF();
                double idr = ratesModel.getIDR()/ ratesModel.getIDR();
                double btc = ratesModel.getIDR();


                bobTextView.setText(formatNumber(bob,"###,##0.##"));
                brlTextView.setText(formatNumber(brl,"###,##0.##"));
                bsdTextView.setText(formatNumber(bsd,"###,##0.##"));
                btcTextView.setText(formatNumber(btc,"###,##0.##"));
                btnTextView.setText(formatNumber(btn,"###,##0.##"));
                bwpTextView.setText(formatNumber(bwp,"###,##0.##"));
                bynTextView.setText(formatNumber(byn,"###,##0.##"));
                bzdTextView.setText(formatNumber(bzd,"###,##0.##"));
                cadTextView.setText(formatNumber(cad,"###,##0.##"));
                cdfTextView.setText(formatNumber(cdf,"###,##0.##"));
                idrTextView.setText(formatNumber(idr,"###,##0.##"));
                loadingProgresBar.setVisibility(TextView.INVISIBLE);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();

                loadingProgresBar.setVisibility(TextView.INVISIBLE);
            }
        });
    }
}