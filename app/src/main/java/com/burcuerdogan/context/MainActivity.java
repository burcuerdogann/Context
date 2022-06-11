 package com.burcuerdogan.context;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Activity Context
        //this
        Toast.makeText(this,"Toast Message", Toast.LENGTH_LONG).show();
    }

    public void save(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Alert Message");
        alert.setMessage("Are You Sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Activity Context
                //MainActivity.this
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //App Context
                //getApplicationContext()
                Toast.makeText(getApplicationContext(),"Not Saved", Toast.LENGTH_LONG).show();
            }
        });
        alert.show();

    }


}