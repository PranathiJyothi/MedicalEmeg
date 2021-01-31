package com.delaroystudios.alarmreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;

public class Home extends AppCompatActivity {

        private ImageButton bt, bt1,bt2,bt3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_home);

                Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
                setSupportActionBar(myToolbar);
                getSupportActionBar().setTitle("Medical Emergency");

                bt = (ImageButton) findViewById(R.id.knowmedact);
                bt1 = (ImageButton) findViewById(R.id.healthtioact);

                bt2 = (ImageButton) findViewById(R.id.hospitalact);
                bt3 = (ImageButton) findViewById(R.id.ReminderAct);

                bt.setOnClickListener(new Click());
                bt1.setOnClickListener(new Click());
                bt2.setOnClickListener(new Click());
                bt3.setOnClickListener(new Click());

        }
        public class Click implements View.OnClickListener{

                @Override
                public void onClick(View view) {

                        switch (view.getId()){

                                case R.id.knowmedact:

//                                        openKnowurmed();
                                        Intent myIntent1 = new Intent(Home.this, knowurmed.class);
                                        Home.this.startActivity(myIntent1);
                                break;
                                case R.id.healthtioact:

//                                        openhealthtip();
                                        Intent myIntent2 = new Intent(Home.this, healthtips.class);
                                        Home.this.startActivity(myIntent2);
                                break;

                                case R.id.hospitalact:

                                        Intent myIntent3 = new Intent(Home.this, NearbyHosp.class);
                                        Home.this.startActivity(myIntent3);
                                        break;

                                case R.id.ReminderAct:


                                        Intent myIntent4 = new Intent(Home.this, MainActivity.class);
                                        Home.this.startActivity(myIntent4);
                                        break;
                                default:

                        }
                }
        }

//        bt.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        openKnowurmed();
//        }
//        });
//
//        bt1 = (ImageButton) findViewById(R.id.healthtioact);
//        bt1.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        openhealthtip();
//        }
//        });
//
//
//        }
//
public void openKnowurmed(){

        Intent intent = new Intent(this,knowurmed.class);
        startActivity(intent);
        }

public void openhealthtip(){

        Intent intent = new Intent(this,knowurmed.class);
        startActivity(intent);
        }
        }
