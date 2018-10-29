package com.example.admin.utilitybucket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RetrieveActivity extends AppCompatActivity {

    DatabaseReference rootRef,plumberref , CarpenterRef , electricianRef,waterref , hospitalRef , emergencyRef ,edutionRef ;
    ServiceP service;
    String serv;
    ListView l1;
    ArrayAdapter<String> adapter;
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        service=new ServiceP();

        Bundle extra= getIntent().getExtras();
        serv=extra.getString("serv");

        l1= (ListView)findViewById(R.id.list);
        final List<String> itemList=new ArrayList<>();
        rootRef=FirebaseDatabase.getInstance().getReference();
        plumberref=rootRef.child("Plumber");
        CarpenterRef=rootRef.child("Carpenter");
        electricianRef=rootRef.child("Electrician");
        waterref=rootRef.child("WaterPurifier");
        hospitalRef=rootRef.child("Hospital");
        emergencyRef=rootRef.child("Emergency");
        edutionRef=rootRef.child("Education");


        if(serv.equals("plumber")) {
            plumberref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years"); itemList.add(service.getAddress());
                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });

        }

        else if(serv.equals("carpenter")) {
            CarpenterRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years"); itemList.add(service.getAddress());

                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });
        }
        else if(serv.equals("electrician")) {
            electricianRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years");
                        itemList.add(service.getAddress());
                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });
        }

       else if(serv.equals("water"))
        {
            waterref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years");                       itemList.add(service.getAddress());
                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });
        }

       else if(serv.equals("emergency"))
        {
            emergencyRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years"); itemList.add(service.getAddress());
                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });
        }

        else if(serv.equals("hospital"))
        {
            hospitalRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years"); itemList.add(service.getAddress());
                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });
        }

       else if(serv.equals("education"))
        {
            edutionRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    itemList.clear();
                    for (DataSnapshot items : dataSnapshot.getChildren()) {
                        service = items.getValue(ServiceP.class);

                        itemList.add(i + " " + service.getName().toUpperCase());
                        itemList.add("Call : "+service.getPhone());
                        itemList.add("Exp : "+service.getExp()+" years"); itemList.add(service.getAddress());
                        itemList.add(" ");
                        i++;
                        Log.e("service", "Message");
                    }
                    adapter = new ArrayAdapter<>(RetrieveActivity.this, R.layout.user_info, itemList);
                    l1.setAdapter(adapter);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    Log.e("service", "DatabaseError");
                }
            });
        }
    }
}
