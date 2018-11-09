package com.rkosistemas.meseroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.rkosistemas.meseroapp.connectiondb.ConnectionClass;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ConnectionClass cncl = new ConnectionClass();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
}
