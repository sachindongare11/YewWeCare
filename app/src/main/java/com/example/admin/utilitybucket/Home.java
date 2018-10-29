package com.example.admin.utilitybucket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


public class Home extends AppCompatActivity  {

    Button LogOUT,painter,carpenter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        LogOUT=(Button)findViewById(R.id.button1);
        Intent intent = getIntent();
    }



    public void logout(View view) {
        finish();

        Toast.makeText(Home.this,"Log Out Successfull", Toast.LENGTH_LONG).show();
    }



  /*  public void click1(View view) {
        Intent i2=new Intent(Home.this,RetrieveActivity.class);
        startActivity(i2);
    }


    public void click2(View view) {
        Intent i3=new Intent(Home.this,RetrieveActivity.class);
        startActivity(i3);
    }*/
    public void click3(View view) {
        Intent i4 = new Intent(Home.this, homeimprovement.class);
        startActivity(i4);
            }
    public void clickhospital(View view) {
        Intent i5 = new Intent(Home.this, RetrieveActivity.class);
        i5.putExtra("serv","hospital");
        startActivity(i5);
    }
    public void clickeducation(View view) {
        Intent i6 = new Intent(Home.this, RetrieveActivity.class);
        i6.putExtra("serv","education");
        startActivity(i6);
    }
    public void clickemergency(View view) {
        Intent i7 = new Intent(Home.this, RetrieveActivity.class);
        i7.putExtra("serv","emergency");
        startActivity(i7);
    }



}
