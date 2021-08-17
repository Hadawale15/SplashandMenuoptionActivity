package com.example.splashandmenuoptionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
     Button but_obj;
     EditText username_obj,pass_obj;
     TextView s_obj;

     public static final String user_name="admin";
    public static final String user_password="password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        but_obj=findViewById(R.id.button1);
        username_obj=findViewById(R.id.username_id);
        pass_obj=findViewById(R.id.pass_id);
        s_obj=findViewById(R.id.sign);

        but_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String new_username=username_obj.getText().toString();
                String new_password=pass_obj.getText().toString();


                if (TextUtils.equals(user_name,new_username)&&TextUtils.equals(user_password,new_password))
                {
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Please enter valid details", Toast.LENGTH_LONG).show();
                }

            }


        });
        s_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,SignUp_activity.class);
                startActivity(intent);
            }
        });

    }

}