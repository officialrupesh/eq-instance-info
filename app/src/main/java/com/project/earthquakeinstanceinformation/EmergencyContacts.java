package com.project.earthquakeinstanceinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class EmergencyContacts extends AppCompatActivity {

    private Button b_callH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec);

        //Call POlice
        Button b_police =( Button) findViewById(R.id.callP);
        b_police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:100"));
                startActivity(intent);
            }
        });

        //Call Brigade
        Button b_brig =(Button) findViewById(R.id.callB);
        b_brig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:101"));
                startActivity(intent);
            }
        });

        //Open Dialer Button
        Button b_call = (Button) findViewById(R.id.callD);

        b_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"));
                startActivity(intent);
            }


        });


        //open Call Hospital
        b_callH=(Button) findViewById(R.id.callH);
        b_callH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in_lu=new Intent(EmergencyContacts.this, Hospital.class);
                startActivity(in_lu);
            }
        });//latest updates



    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
