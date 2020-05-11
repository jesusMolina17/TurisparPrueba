package com.example.turisaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public Button boton1,boton2;
    public ImageView imagen1;


    public void AccionIngresar(View view){
        Intent i = new Intent(this, Home.class );
        startActivity(i);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1=(Button)findViewById(R.id.boton_ingresar);
        boton2=(Button)findViewById(R.id.botonsiguiente_insignia);
        imagen1=(ImageView)findViewById(R.id.imageView);
    }
}
