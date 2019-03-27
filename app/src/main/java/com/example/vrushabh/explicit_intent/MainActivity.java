package com.example.vrushabh.explicit_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //OnClick method
 public void One (View view){

     // This intent codes make action to jump from present activity to another activity
    Intent i = new Intent(this, SecondActivity.class);
    startActivity(i);

     // Toast massage to pop a massage when you click on button
    Toast toast = Toast.makeText(getApplicationContext(), "Welcome to second activity guys",Toast.LENGTH_SHORT);
    toast.show();
}
}