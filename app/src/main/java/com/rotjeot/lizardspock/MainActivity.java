package com.rotjeot.lizardspock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = (Button) findViewById(R.id.playButton);
        //Imagenes, juego de la computadora
        ImageView rockImg = (ImageView) findViewById(R.id.rockImage);
        ImageView papperImg = (ImageView) findViewById(R.id.papperImage);
        ImageView scissorsImg = (ImageView) findViewById(R.id.scissorsImage);
        ImageView lizardImg = (ImageView) findViewById(R.id.lizardImage);
        ImageView spockImg = (ImageView) findViewById(R.id.spockImage);
        //Botones, juego usuario
        ImageButton rockBtn = (ImageButton) findViewById(R.id.rockButton);
        ImageButton papperBtn = (ImageButton) findViewById(R.id.papperButton);
        ImageButton scissorsBtn = (ImageButton) findViewById(R.id.scissorsButton);
        ImageButton lizardBtn = (ImageButton) findViewById(R.id.lizardButton);
        ImageButton spockBtn = (ImageButton) findViewById(R.id.spockButton);
        //Texto
        TextView mensaje = (TextView) findViewById(R.id.mensaje);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rockImg.setVisibility(View.VISIBLE);
                papperImg.setVisibility(View.VISIBLE);
                scissorsImg.setVisibility(View.VISIBLE);
                lizardImg.setVisibility(View.VISIBLE);
                spockImg.setVisibility(View.VISIBLE);

                rockBtn.setVisibility(View.VISIBLE);
                papperBtn.setVisibility(View.VISIBLE);
                scissorsBtn.setVisibility(View.VISIBLE);
                lizardBtn.setVisibility(View.VISIBLE);
                spockBtn.setVisibility(View.VISIBLE);

                mensaje.setVisibility(View.INVISIBLE);


            }
        });


    }
}