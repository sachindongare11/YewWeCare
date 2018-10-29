package com.example.admin.utilitybucket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void u1(View view) {
        Intent i=new Intent(Select.this,Home.class);
        startActivity(i);
    }

    public void s1(View view) {
        Intent i1=new Intent(Select.this,DashboardActivity.class);
        startActivity(i1);
    }
}
