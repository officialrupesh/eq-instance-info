package com.project.earthquakeinstanceinformation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class main1Activity extends AppCompatActivity {

    private Button b_lu; // latest updates
    private Button b_ec; //emergency contacts
    private Button b_sm; //safety measures
    private Button b_hin; //history in nepal
    private Button b_memo; //memo
    Button exit;    //exit

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        //latest updates
            b_lu=(Button) findViewById(R.id.lu);
            b_lu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in_lu=new Intent(main1Activity.this, LatestUpdates.class);
                    startActivity(in_lu);
                }
            });//latest updates

            //emergency contacts
            b_ec=(Button) findViewById(R.id.ec);
            b_ec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in_ec=new Intent(main1Activity.this, EmergencyContacts.class);
                    startActivity(in_ec);
                }
            });//emergency contacts

        //safety measures
       b_sm=(Button) findViewById(R.id.sm);
            b_sm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in_sm =new Intent(main1Activity.this, SafetyMeasures.class);
                    startActivity(in_sm);
                }
            }); //safety measures

            //History in Nepal
            b_hin=(Button) findViewById(R.id.hin);
            b_hin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in_hin =new Intent(main1Activity.this, HistoryinNepal.class);
                    startActivity(in_hin);
                }
            }); //History in Nepal

            //Link to USGS Earthquake Page
            b_memo=(Button) findViewById(R.id.memo);
            b_memo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://earthquake.usgs.gov"));
                    startActivity(browserIntent);
                }
            }); //MUSGS

            //exit
        exit = (Button) findViewById(R.id.exit);        //exit
        exit.setOnClickListener(new View.OnClickListener() {        //exit
            @Override                                   //exit
            public void onClick(View view) {                //exit
                moveTaskToBack(true);           //exit
                android.os.Process.killProcess(android.os.Process.myPid()); //exit
                System.exit(1);//exit
            }
        }); //exit


    }
    }