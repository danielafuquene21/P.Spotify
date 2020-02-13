package com.spotify.sdk.android.auth.sample;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.spotify.sdk.android.authentication.sample.R;

public class Principal extends AppCompatActivity {

    private EditText nombresEditText, emailtext, typetxt;
    public String nombre, email, type;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);



        initUI();

        getExtras();


    }


    private void initUI()
    {
        nombresEditText = findViewById(R.id.txtUser);
        emailtext = findViewById(R.id.txtEmail);
        typetxt = findViewById(R.id.txtType);



    }

    private void getExtras() {
        nombre =  getIntent().getExtras().getString("name");
        email =  getIntent().getExtras().getString("email");
        type =  getIntent().getExtras().getString("type");

        nombresEditText.setText(nombre);
        emailtext.setText(email);
        typetxt.setText(type);
    }


}
