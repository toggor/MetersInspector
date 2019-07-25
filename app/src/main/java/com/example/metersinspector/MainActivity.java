package com.example.metersinspector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {   // here we list EventReports

    ArrayList<EventReport> eventReports = new ArrayList<EventReport>();

    @Override
    protected void onCreate(Bundle savedInstanceState) { //we should list all the EventReports that are present
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //TODO: - create a new EventReport button
    //      - timestamp for the new EventReport automatically
    //      - look inside old EventReport button
    //      - track down all the changes




}
