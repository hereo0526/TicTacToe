package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MainModel model = new MainModel();

    private Button clear;

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

    private ImageView line_1;
    private ImageView line_2;
    private ImageView line_3;
    private ImageView line_4;
    private ImageView line_5;
    private ImageView line_6;
    private ImageView line_7;
    private ImageView line_8;

    private Button button_restart;
    private ImageView image_clickblock;

    private void restart(){
        button_restart.setVisibility(View.VISIBLE);
        image_clickblock.setVisibility(View.VISIBLE);
    }x
    private void winner_check(){
        if(model.getWinner() == 11 || model.getWinner() == 21){
            line_1.bringToFront();
            line_1.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 12|| model.getWinner() == 22){
            line_2.bringToFront();
            line_2.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 13|| model.getWinner() == 23){
            line_3.bringToFront();
            line_3.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 14|| model.getWinner() == 24){
            line_4.bringToFront();
            line_4.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 15|| model.getWinner() == 25){
            line_5.bringToFront();
            line_5.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 16|| model.getWinner() == 26){
            line_6.bringToFront();
            line_6.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 17|| model.getWinner() == 27){
            line_7.bringToFront();
            line_7.setVisibility(View.VISIBLE);
            restart();
        }else if(model.getWinner() == 18|| model.getWinner() == 28) {
            line_8.bringToFront();
            line_8.setVisibility(View.VISIBLE);
            restart();
        }
        else if(model.getTurnCnt() == 9){
            button_restart.setVisibility(View.VISIBLE);
        }
    }
    private void changeTurn(){
        model.setTurnCnt(model.getTurnCnt()+1);
        winner_check();
        if(model.getTurn() == 0)
            model.setTurn(1);
        else
            model.setTurn(0);
    }
    private void clear(){

        model.clearArr();

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

        line_1.setVisibility(View.INVISIBLE);
        line_2.setVisibility(View.INVISIBLE);
        line_3.setVisibility(View.INVISIBLE);
        line_4.setVisibility(View.INVISIBLE);
        line_5.setVisibility(View.INVISIBLE);
        line_6.setVisibility(View.INVISIBLE);
        line_7.setVisibility(View.INVISIBLE);
        line_8.setVisibility(View.INVISIBLE);

        button_restart.setVisibility(View.INVISIBLE);

        model.setTurn(0);
        model.setWinnerNum(0);
        model.setTurnCnt(0);

        image_clickblock.setVisibility(View.INVISIBLE);
    }
    private View decorView;
    private int uiOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear);

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

        line_1 = findViewById(R.id.line_1);
        line_2 = findViewById(R.id.line_2);
        line_3 = findViewById(R.id.line_3);
        line_4 = findViewById(R.id.line_4);
        line_5 = findViewById(R.id.line_5);
        line_6 = findViewById(R.id.line_6);
        line_7 = findViewById(R.id.line_7);
        line_8 = findViewById(R.id.line_8);

        button_restart = findViewById(R.id.button_restart);

        image_clickblock = findViewById(R.id.image_clickblock);

        String[] id_Turn = {"@drawable/o", "@drawable/x"};
        String packName = this.getPackageName();

        decorView = getWindow().getDecorView();
        uiOption = getWindow().getDecorView().getSystemUiVisibility();
        uiOption |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        uiOption |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        uiOption |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        decorView.setSystemUiVisibility( uiOption );

        clear();

        line_1.setRotation(45);
        line_2.setRotation(135);
        image_clickblock.setClickable(true);
        image_clickblock.bringToFront();

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        box_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(0, 0) == 0){
                    model.setArr(0, 0);
                    ox_1.bringToFront();
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_1.setImageResource(resId);
                    ox_1.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(1, 0) == 0) {
                    model.setArr(1, 0);
                    ox_2.bringToFront();
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_2.setImageResource(resId);
                    ox_2.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(2, 0) == 0) {
                    model.setArr(2, 0);
                    ox_3.bringToFront();
                    ox_3.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_3.setImageResource(resId);
                    ox_3.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(0, 1) == 0) {
                    model.setArr(0, 1);
                    ox_4.bringToFront();
                    ox_4.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_4.setImageResource(resId);
                    ox_4.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(1, 1) == 0) {
                    model.setArr(1, 1);
                    ox_5.bringToFront();
                    ox_5.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_5.setImageResource(resId);
                    ox_5.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(2, 1) == 0) {
                    model.setArr(2, 1);
                    ox_6.bringToFront();
                    ox_6.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_6.setImageResource(resId);
                    ox_6.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(0, 2) == 0) {
                    model.setArr(0, 2);
                    ox_7.bringToFront();
                    ox_7.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_7.setImageResource(resId);
                    ox_7.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(1, 2) == 0) {
                    model.setArr(1, 2);
                    ox_8.bringToFront();
                    ox_8.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_8.setImageResource(resId);
                    ox_8.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        box_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.getArr(2, 2) == 0) {
                    model.setArr(2, 2);
                    ox_9.bringToFront();
                    ox_9.setImageResource(0);
                    int resId = getResources().getIdentifier(id_Turn[model.getTurn()], "drawable", packName);
                    ox_9.setImageResource(resId);
                    ox_9.setVisibility(View.VISIBLE);
                    changeTurn();
                }
            }
        });
        button_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

    }
}