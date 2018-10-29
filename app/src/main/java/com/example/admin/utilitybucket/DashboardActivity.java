package com.example.admin.utilitybucket;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name,phone,address,exp;
    String service;
    Button add;
    Spinner spinner;
    private DatabaseReference mDatabaseReference;

    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListner;
    FirebaseUser mUser;
    //@SuppressLint("SetTextI18n")
    public static final String TAG="LOGIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        name=(EditText)findViewById(R.id.et1);
        phone=(EditText)findViewById(R.id.et2);
        spinner = (Spinner) findViewById(R.id.spinner);
        address=(EditText)findViewById(R.id.et4);
        exp=(EditText)findViewById(R.id.exp);
        add=(Button)findViewById(R.id.button2);

        mDatabaseReference= FirebaseDatabase.getInstance().getReference();

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ServiceP services ;
                  /* if(service=="Painter") {
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString());
                       mDatabaseReference.child("Painter").push().setValue(services);
                   }*/
                    if(service=="Carpenter"){
                      services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("Carpenter").push().setValue(services);
                   }
                   else if(service=="Education"){
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("Education").push().setValue(services);
                   }
                   else if(service=="Plumber"){
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("Plumber").push().setValue(services);
                   }
                   else if(service=="Electrician"){
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("Electrician").push().setValue(services);
                   }
                   else if(service=="Hospital"){
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("Hospital").push().setValue(services);
                   }
                   else if(service=="Emergency"){
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("Emergency").push().setValue(services);
                   }
                   else if(service=="WaterPurifier"){
                       services = new ServiceP(name.getText().toString(), phone.getText().toString(), service, address.getText().toString(),exp.getText().toString());
                       mDatabaseReference.child("WaterPurifier").push().setValue(services);
                   }

                    Toast.makeText(DashboardActivity.this, "Registered Successfully", Toast.LENGTH_SHORT);
                    Intent intent = new Intent(DashboardActivity.this, Home.class);
                    startActivity(intent);
                }
            });





        // Spinner click listener
       spinner.setOnItemSelectedListener(DashboardActivity.this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();

        categories.add("Carpenter");
        categories.add("Education");
        categories.add("Electrician");
        categories.add("Emergency");
        categories.add("Hospital");
        //categories.add("Painter");
        categories.add("Plumber");
        categories.add("WaterPurifier");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
       // service = spinner.getSelectedItem().toString();

    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
         service = parent.getItemAtPosition(position).toString();
         System.out.print(service);

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + service, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


