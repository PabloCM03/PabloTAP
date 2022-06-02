package com.example.practica5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class formLogin extends AppCompatActivity {

    private EditText txtUsr, txtps;
    private Button btnIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        txtUsr = findViewById(R.id.txtUsuario);
        txtps = findViewById(R.id.txtContraseña);
        btnIS = findViewById(R.id.btnIngresar);

        btnIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validarUsuario();
            }
        });
    }

    private void validarUsuario() {

        if(txtUsr.getText().toString().isEmpty() && txtps.getText().toString().isEmpty()){

            Toast.makeText(formLogin.this, "No hay datos", Toast.LENGTH_SHORT).show();
        }
        else if(txtUsr.getText().toString().equals("7267") && txtps.getText().toString().equals("12345")){

                Intent intent = new Intent(this, formLoginOk.class);
                startActivity(intent);

        }
        else{

            Intent intent2 = new Intent(this, formLoginError.class);
            startActivity(intent2);
        }
    }
}