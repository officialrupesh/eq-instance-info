package com.project.earthquakeinstanceinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        //Call Bir Hospital
        Button b_birH =( Button) findViewById(R.id.BirHosp);
        b_birH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01 4223807"));
                startActivity(intent);
            }
        });

        //Call Teaching Hospital
        Button b_teachingH =( Button) findViewById(R.id.TeachingHosp);
        b_teachingH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01 4412404"));
                startActivity(intent);
            }
        });


        //Call Patan Hospital
        Button b_patanH =( Button) findViewById(R.id.PatanHosp);
        b_patanH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01 5522278"));
                startActivity(intent);
            }
        });

        //Call Bhaktapur Hospital
        Button b_bktH =( Button) findViewById(R.id.BhaktapurHosp);
        b_bktH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01 6610676"));
                startActivity(intent);
            }
        });

        //Call B&B Hospital
        Button b_bnbH =( Button) findViewById(R.id.BnBHosp);
        b_bnbH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01 5533206"));
                startActivity(intent);
            }
        });

        //Call Medicare Hospital
        Button b_medH =( Button) findViewById(R.id.MedicareHosp);
        b_medH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01 4467167"));
                startActivity(intent);
            }
        });

    }
}
