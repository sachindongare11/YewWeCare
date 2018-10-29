package com.example.admin.utilitybucket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homeimprovement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeimprovement);


    }

    public void plumber(View view2) {
        Intent paint = new Intent(homeimprovement.this, RetrieveActivity.class);
        paint.putExtra("serv","plumber");
        startActivity(paint);
    }
    public void electrician(View view2) {
        Intent elect = new Intent(homeimprovement.this, RetrieveActivity.class);
        elect.putExtra("serv","electrician");
        startActivity(elect);
    }
    public void carpenter(View view2) {
        Intent carp = new Intent(homeimprovement.this, RetrieveActivity.class);
        carp.putExtra("serv","carpenter");
        startActivity(carp);
    }
    public void waterp(View view2) {
        Intent wp = new Intent(homeimprovement.this, RetrieveActivity.class);
        wp.putExtra("serv","water");
        startActivity(wp);
    }

}