package com.example.button_listen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );



// Code starts here

//        Button button = (Button) findViewById(R.id.button_id);
//        button.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//                // Do something in response to button click
//
//        Log.i("my test log", "button clicked");

//Toast message sample
//                Context context = getApplicationContext();
//                CharSequence text = "Hello toast!";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();
//
//
//
//
//
//            }
//        });




 // image view click events

        findViewById(R.id.cardlist).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


//                Context context = getApplicationContext();
//                CharSequence text = "Hello toast!";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(context, text, duration);
//                    toast.show();

                Intent myIntent = new Intent(MainActivity.this, product.class);
                MainActivity.this.startActivity(myIntent);




            }
        });



//code finish here
    }

}