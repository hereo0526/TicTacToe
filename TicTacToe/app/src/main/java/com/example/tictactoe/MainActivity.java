package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MainModel model = new MainModel();

    private ImageView box_1;
    private ImageView box_2;
    private ImageView box_3;
    private ImageView box_4;
    private ImageView box_5;
    private ImageView box_6;
    private ImageView box_7;
    private ImageView box_8;
    private ImageView box_9;

    private ImageView ox_1;
    private ImageView ox_2;
    private ImageView ox_3;
    private ImageView ox_4;
    private ImageView ox_5;
    private ImageView ox_6;
    private ImageView ox_7;
    private ImageView ox_8;
    private ImageView ox_9;

    private void clear(){
        box_1.bringToFront();
        box_2.bringToFront();
        box_3.bringToFront();
        box_4.bringToFront();
        box_5.bringToFront();
        box_6.bringToFront();
        box_7.bringToFront();
        box_8.bringToFront();
        box_9.bringToFront();

        ox_1.setVisibility(View.INVISIBLE);
        ox_2.setVisibility(View.INVISIBLE);
        ox_3.setVisibility(View.INVISIBLE);
        ox_4.setVisibility(View.INVISIBLE);
        ox_5.setVisibility(View.INVISIBLE);
        ox_6.setVisibility(View.INVISIBLE);
        ox_7.setVisibility(View.INVISIBLE);
        ox_8.setVisibility(View.INVISIBLE);
        ox_9.setVisibility(View.INVISIBLE);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box_1 = findViewById(R.id.box_1);
        box_2 = findViewById(R.id.box_2);
        box_3 = findViewById(R.id.box_3);
        box_4 = findViewById(R.id.box_4);
        box_5 = findViewById(R.id.box_5);
        box_6 = findViewById(R.id.box_6);
        box_7 = findViewById(R.id.box_7);
        box_8 = findViewById(R.id.box_8);
        box_9 = findViewById(R.id.box_9);

        ox_1 = findViewById(R.id.ox_1);
        ox_2 = findViewById(R.id.ox_2);
        ox_3 = findViewById(R.id.ox_3);
        ox_4 = findViewById(R.id.ox_4);
        ox_5 = findViewById(R.id.ox_5);
        ox_6 = findViewById(R.id.ox_6);
        ox_7 = findViewById(R.id.ox_7);
        ox_8 = findViewById(R.id.ox_8);
        ox_9 = findViewById(R.id.ox_9);

        String[] id_OX = {"@drawable/o", "@drawable/x"};
        String packName = this.getPackageName();

        int resId_attack = getResources().getIdentifier(id_OX[0], "drawable", packName);
        ox_1.setImageResource(resId_attack);

        box_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}