package com.app.getmymac;

import android.annotation.SuppressLint;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView macIdTV;

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        macIdTV = findViewById(R.id.mac_id);

        WifiManager wifiMgr = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiMgr.getConnectionInfo();
        final String MAC_ADDRESS = wifiInfo.getMacAddress();
        macIdTV.setText(MAC_ADDRESS);
        macIdTV.setVisibility(View.VISIBLE);

    }
}