package com.example.splashandmenuoptionactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.sms:
               Toast.makeText(MainActivity.this,"SMS",Toast.LENGTH_LONG).show();
               Intent intent=new Intent(MainActivity.this,SmsActivity.class);
               startActivity(intent);
               break;

           case R.id.call:
               Toast.makeText(MainActivity.this,"Call",Toast.LENGTH_LONG).show();
               Intent intent1=new Intent(MainActivity.this,CallActivity.class);
               startActivity(intent1);
               break;

           case R.id.email:
               Toast.makeText(MainActivity.this,"Email",Toast.LENGTH_LONG).show();
               Intent intent2=new Intent(MainActivity.this,EmailActivity.class);
               startActivity(intent2);
               break;
       }
       return super.onOptionsItemSelected(item);
    }
}