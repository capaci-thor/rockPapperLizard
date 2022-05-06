package com.rotjeot.lizardspock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button playButton;
    //Imagenes, juego de la computadora
    public ImageView rockImg;
    public ImageView papperImg;
    public ImageView scissorsImg;
    public ImageView lizardImg;
    public ImageView spockImg;
    //Botones, juego usuario
    public ImageButton rockBtn;
    public ImageButton papperBtn;
    public ImageButton scissorsBtn;
    public ImageButton lizardBtn;
    public ImageButton spockBtn;
    //Texto
    public TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.playButton);
        //Imagenes, juego de la computadora
        rockImg = (ImageView) findViewById(R.id.rockImage);
        papperImg = (ImageView) findViewById(R.id.papperImage);
        scissorsImg = (ImageView) findViewById(R.id.scissorsImage);
        lizardImg = (ImageView) findViewById(R.id.lizardImage);
        spockImg = (ImageView) findViewById(R.id.spockImage);
        //Botones, juego usuario
        rockBtn = (ImageButton) findViewById(R.id.rockButton);
        papperBtn = (ImageButton) findViewById(R.id.papperButton);
        scissorsBtn = (ImageButton) findViewById(R.id.scissorsButton);
        lizardBtn = (ImageButton) findViewById(R.id.lizardButton);
        spockBtn = (ImageButton) findViewById(R.id.spockButton);
        //Texto
        mensaje = (TextView) findViewById(R.id.mensaje);


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

        rockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Juego(0);
            }
        });

        papperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Juego(1);

            }
        });

        scissorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Juego(2);
            }
        });

        lizardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Juego(3);
            }
        });

        spockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Juego(4);
            }
        });

    }

    void Juego(int opcion)
    {
        Random rand = new Random();
        int random = rand.nextInt(5);
        /*
        Piedra -> 0
        papel -> 1
        Tijera -> 2
        Lagarto -> 3
        spock -> 4
        */

        if(opcion == 0)//Piedra
        {
            rockBtn.setBackgroundColor(getResources().getColor(R.color.select));
            switch (random)
            {
                case 0:
                {
                    //Neutro
                    rockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    empate();
                    break;
                }
                case 1:
                {
                    //pierdes
                    papperImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 2:
                {
                    //Ganas
                    scissorsImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 3:
                {
                    //Ganas
                    lizardImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 4:
                {
                    //Pierdes
                    spockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
            }
        }
        if(opcion == 1)//Papel
        {
            papperBtn.setBackgroundColor(getResources().getColor(R.color.select));
            switch (random)
            {
                case 0:
                {
                    //ganas
                    rockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 1:
                {
                    //Empate
                    papperImg.setBackgroundColor(getResources().getColor(R.color.select));
                    empate();
                    break;
                }
                case 2:
                {
                    //Pierdes
                    scissorsImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 3:
                {
                    //Pierdes
                    lizardImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 4:
                {
                    //Ganas
                    spockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
            }
        }
        if(opcion == 2)//Tijeras
        {
            scissorsBtn.setBackgroundColor(getResources().getColor(R.color.select));
            switch (random)
            {
                case 0:
                {
                    //Pierdes
                    rockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 1:
                {
                    //Ganas
                    papperImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 2:
                {
                    //Empata
                    scissorsImg.setBackgroundColor(getResources().getColor(R.color.select));
                    empate();
                    break;
                }
                case 3:
                {
                    //Ganas
                    lizardImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 4:
                {
                    //Pierdes
                    spockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
            }
        }
        if(opcion == 3)//Lagarto
        {
            lizardBtn.setBackgroundColor(getResources().getColor(R.color.select));
            switch (random)
            {
                case 0:
                {
                    //Pierdes
                    rockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 1:
                {
                    //Ganas
                    papperImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 2:
                {
                    //Pierdes
                    scissorsImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 3:
                {
                    //Empatas
                    lizardImg.setBackgroundColor(getResources().getColor(R.color.select));
                    empate();
                    break;
                }
                case 4:
                {
                    //Ganas
                    spockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
            }
        }
        if(opcion == 4)//Spock
        {
            rockBtn.setBackgroundColor(getResources().getColor(R.color.select));
            switch (random)
            {
                case 0:
                {
                    //Ganas
                    rockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 1:
                {
                    //Pierdes
                    papperImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 2:
                {
                    //Ganas
                    scissorsImg.setBackgroundColor(getResources().getColor(R.color.select));
                    ganaste();
                    break;
                }
                case 3:
                {
                    //Pierdes
                    lizardImg.setBackgroundColor(getResources().getColor(R.color.select));
                    perdiste();
                    break;
                }
                case 4:
                {
                    //Empate
                    spockImg.setBackgroundColor(getResources().getColor(R.color.select));
                    empate();
                    break;
                }
            }
        }
    }

    void ganaste()
    {
        mensaje.setVisibility(View.VISIBLE);
        mensaje.setText("Ganaste");
    }

    void perdiste()
    {
        mensaje.setVisibility(View.VISIBLE);
        mensaje.setText("Perdiste");
    }

    void empate()
    {
        mensaje.setVisibility(View.VISIBLE);
        mensaje.setText("Empate");
    }

}