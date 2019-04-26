package com.example.chess;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.AlertDialog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //pretty much the design of the chessboard (black,white tiles)
    public TextView[][] DisplayBoardBackground = new TextView[8][8];
    public TextView[][] DisplayBoard = new TextView[8][8];
    public boolean[][] DisplayBoard2 = new boolean[8][8];
    public boolean weramzug = true; // true = w; false = b
    public String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeBoard();

    }
    public void spielRegeln()
    {
        for(int i = 0; i<8; i++)
        {

        }


    {

    }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.R26:
               int c = view.getId();
                char[] x = new char[1];

                for(int i = 0; i<2; i++)
                {
                   x[i] = (char)c;

                }


                if(!DisplayBoard[2][6].getBackground().equals(null))
                {

                 if(DisplayBoard[2][6].getBackground().getConstantState().equals(R.drawable.blackpawn)) {
                    Pawn(true,2,6);
                   if(  DisplayBoard[2][6].getBackground().getConstantState().equals(R.drawable.whitepawn))
                   {
                       Pawn(true,2,6);
                   }
                }
                }
                break;
            case R.id.R01:
                System.out.println("R01 pressed");
                break;
        }
    }

    private void Pawn(boolean color,int x,int y )
    {

        if(DisplayBoard[x][y-1].getBackground()== null)
        {
            DisplayBoard[x][y-1].setBackgroundResource(R.drawable.move);
            if(DisplayBoard2[x][y-1]!=true)
            {
                DisplayBoard[x][y-2].setBackgroundResource(R.drawable.move);
            }
        }
        if(DisplayBoard[x-1][y-1].getBackground()!=null)
        {
            DisplayBoard[x-1][y-1].setBackgroundResource(R.drawable.move);
        }
        if(DisplayBoard[x+1][y-1].getBackground()!=null)
        {
            DisplayBoard[x-1][y-1].setBackgroundResource(R.drawable.move);
        }
    }

    private void initializeBoard(){

        DisplayBoard[0][0] = (TextView) findViewById(R.id.R00);
        DisplayBoard[0][0].setBackgroundResource(R.drawable.blackrook);
        DisplayBoardBackground[0][0] = (TextView) findViewById(R.id.A1);
        DisplayBoard[1][0] = (TextView) findViewById(R.id.R10);
        DisplayBoard[1][0].setBackgroundResource(R.drawable.blackknight);
        DisplayBoardBackground[1][0] = (TextView) findViewById(R.id.A2);
        DisplayBoard[2][0] = (TextView) findViewById(R.id.R20);
        DisplayBoard[2][0].setBackgroundResource(R.drawable.blackbishop);
        DisplayBoardBackground[2][0] = (TextView) findViewById(R.id.A3);
        DisplayBoard[3][0] = (TextView) findViewById(R.id.R30);
        DisplayBoard[3][0].setBackgroundResource(R.drawable.blackqueen);
        DisplayBoardBackground[3][0] = (TextView) findViewById(R.id.A4);
        DisplayBoard[4][0] = (TextView) findViewById(R.id.R40);
        DisplayBoard[4][0].setBackgroundResource(R.drawable.blackking);
        DisplayBoardBackground[4][0] = (TextView) findViewById(R.id.A5);
        DisplayBoard[5][0] = (TextView) findViewById(R.id.R50);
        DisplayBoard[5][0].setBackgroundResource(R.drawable.blackbishop);
        DisplayBoardBackground[5][0] = (TextView) findViewById(R.id.A6);
        DisplayBoard[6][0] = (TextView) findViewById(R.id.R60);
        DisplayBoard[6][0].setBackgroundResource(R.drawable.blackknight);
        DisplayBoardBackground[6][0] = (TextView) findViewById(R.id.A7);
        DisplayBoard[7][0] = (TextView) findViewById(R.id.R70);
        DisplayBoard[7][0].setBackgroundResource(R.drawable.blackrook);
        DisplayBoardBackground[7][0] = (TextView) findViewById(R.id.A8);


        DisplayBoard[0][1] = (TextView) findViewById(R.id.R01);
        DisplayBoardBackground[0][1] = (TextView) findViewById(R.id.B1);
        DisplayBoard[1][1] = (TextView) findViewById(R.id.R11);
        DisplayBoardBackground[1][1] = (TextView) findViewById(R.id.B2);
        DisplayBoard[2][1] = (TextView) findViewById(R.id.R21);
        DisplayBoardBackground[2][1] = (TextView) findViewById(R.id.B3);
        DisplayBoard[3][1] = (TextView) findViewById(R.id.R31);
        DisplayBoardBackground[3][1] = (TextView) findViewById(R.id.B4);
        DisplayBoard[4][1] = (TextView) findViewById(R.id.R41);
        DisplayBoardBackground[4][1] = (TextView) findViewById(R.id.B5);
        DisplayBoard[5][1] = (TextView) findViewById(R.id.R51);
        DisplayBoardBackground[5][1] = (TextView) findViewById(R.id.B6);
        DisplayBoard[6][1] = (TextView) findViewById(R.id.R61);
        DisplayBoardBackground[6][1] = (TextView) findViewById(R.id.B7);
        DisplayBoard[7][1] = (TextView) findViewById(R.id.R71);
        DisplayBoardBackground[7][1] = (TextView) findViewById(R.id.B8);
        for(int i = 0; i<8; i++)
        {
            DisplayBoard[i][1].setBackgroundResource(R.drawable.blackpawn);

        }
        for(int i = 0; i<8; i++)
        {
            DisplayBoard2[i][0]=true;
        }
        for(int i = 0; i<8; i++)
        {
            DisplayBoard2[i][1]=true;
        }


        DisplayBoard[0][2] = (TextView) findViewById(R.id.R02);
        DisplayBoardBackground[0][2] = (TextView) findViewById(R.id.C1);
        DisplayBoard[1][2] = (TextView) findViewById(R.id.R12);
        DisplayBoardBackground[1][2] = (TextView) findViewById(R.id.C2);
        DisplayBoard[2][2] = (TextView) findViewById(R.id.R22);
        DisplayBoardBackground[2][2] = (TextView) findViewById(R.id.C3);
        DisplayBoard[3][2] = (TextView) findViewById(R.id.R32);
        DisplayBoardBackground[3][2] = (TextView) findViewById(R.id.C4);
        DisplayBoard[4][2] = (TextView) findViewById(R.id.R42);
        DisplayBoardBackground[4][2] = (TextView) findViewById(R.id.C5);
        DisplayBoard[5][2] = (TextView) findViewById(R.id.R52);
        DisplayBoardBackground[5][2] = (TextView) findViewById(R.id.C6);
        DisplayBoard[6][2] = (TextView) findViewById(R.id.R62);
        DisplayBoardBackground[6][2] = (TextView) findViewById(R.id.C7);
        DisplayBoard[7][2] = (TextView) findViewById(R.id.R72);
        DisplayBoardBackground[7][2] = (TextView) findViewById(R.id.C8);

        DisplayBoard[0][3] = (TextView) findViewById(R.id.R03);
        DisplayBoardBackground[0][3] = (TextView) findViewById(R.id.D1);
        DisplayBoard[1][3] = (TextView) findViewById(R.id.R13);
        DisplayBoardBackground[1][3] = (TextView) findViewById(R.id.D2);
        DisplayBoard[2][3] = (TextView) findViewById(R.id.R23);
        DisplayBoardBackground[2][3] = (TextView) findViewById(R.id.D3);
        DisplayBoard[3][3] = (TextView) findViewById(R.id.R33);
        DisplayBoardBackground[3][3] = (TextView) findViewById(R.id.D4);
        DisplayBoard[4][3] = (TextView) findViewById(R.id.R43);
        DisplayBoardBackground[4][3] = (TextView) findViewById(R.id.D5);
        DisplayBoard[5][3] = (TextView) findViewById(R.id.R53);
        DisplayBoardBackground[5][3] = (TextView) findViewById(R.id.D6);
        DisplayBoard[6][3] = (TextView) findViewById(R.id.R63);
        DisplayBoardBackground[6][3] = (TextView) findViewById(R.id.D7);
        DisplayBoard[7][3] = (TextView) findViewById(R.id.R73);
        DisplayBoardBackground[7][3] = (TextView) findViewById(R.id.D8);

        DisplayBoard[0][4] = (TextView) findViewById(R.id.R04);
        DisplayBoardBackground[0][4] = (TextView) findViewById(R.id.E1);
        DisplayBoard[1][4] = (TextView) findViewById(R.id.R14);
        DisplayBoardBackground[1][4] = (TextView) findViewById(R.id.E2);
        DisplayBoard[2][4] = (TextView) findViewById(R.id.R24);
        DisplayBoardBackground[2][4] = (TextView) findViewById(R.id.E3);
        DisplayBoard[3][4] = (TextView) findViewById(R.id.R34);
        DisplayBoardBackground[3][4] = (TextView) findViewById(R.id.E4);
        DisplayBoard[4][4] = (TextView) findViewById(R.id.R44);
        DisplayBoardBackground[4][4] = (TextView) findViewById(R.id.E5);
        DisplayBoard[5][4] = (TextView) findViewById(R.id.R54);
        DisplayBoardBackground[5][4] = (TextView) findViewById(R.id.E6);
        DisplayBoard[6][4] = (TextView) findViewById(R.id.R64);
        DisplayBoardBackground[6][4] = (TextView) findViewById(R.id.E7);
        DisplayBoard[7][4] = (TextView) findViewById(R.id.R74);
        DisplayBoardBackground[7][4] = (TextView) findViewById(R.id.E8);

        DisplayBoard[0][5] = (TextView) findViewById(R.id.R05);
        DisplayBoardBackground[0][5] = (TextView) findViewById(R.id.F1);
        DisplayBoard[1][5] = (TextView) findViewById(R.id.R15);
        DisplayBoardBackground[1][5] = (TextView) findViewById(R.id.F2);
        DisplayBoard[2][5] = (TextView) findViewById(R.id.R25);
        DisplayBoardBackground[2][5] = (TextView) findViewById(R.id.F3);
        DisplayBoard[3][5] = (TextView) findViewById(R.id.R35);
        DisplayBoardBackground[3][5] = (TextView) findViewById(R.id.F4);
        DisplayBoard[4][5] = (TextView) findViewById(R.id.R45);
        DisplayBoardBackground[4][5] = (TextView) findViewById(R.id.F5);
        DisplayBoard[5][5] = (TextView) findViewById(R.id.R55);
        DisplayBoardBackground[5][5] = (TextView) findViewById(R.id.F6);
        DisplayBoard[6][5] = (TextView) findViewById(R.id.R65);
        DisplayBoardBackground[6][5] = (TextView) findViewById(R.id.F7);
        DisplayBoard[7][5] = (TextView) findViewById(R.id.R75);
        DisplayBoardBackground[7][5] = (TextView) findViewById(R.id.F8);

        DisplayBoard[0][6] = (TextView) findViewById(R.id.R06);
        DisplayBoardBackground[0][6] = (TextView) findViewById(R.id.G1);
        DisplayBoard[1][6] = (TextView) findViewById(R.id.R16);
        DisplayBoardBackground[1][6] = (TextView) findViewById(R.id.G2);
        DisplayBoard[2][6] = (TextView) findViewById(R.id.R26);
        DisplayBoardBackground[2][6] = (TextView) findViewById(R.id.G3);
        DisplayBoard[3][6] = (TextView) findViewById(R.id.R36);
        DisplayBoardBackground[3][6] = (TextView) findViewById(R.id.G4);
        DisplayBoard[4][6] = (TextView) findViewById(R.id.R46);
        DisplayBoardBackground[4][6] = (TextView) findViewById(R.id.G5);
        DisplayBoard[5][6] = (TextView) findViewById(R.id.R56);
        DisplayBoardBackground[5][6] = (TextView) findViewById(R.id.G6);
        DisplayBoard[6][6] = (TextView) findViewById(R.id.R66);
        DisplayBoardBackground[6][6] = (TextView) findViewById(R.id.G7);
        DisplayBoard[7][6] = (TextView) findViewById(R.id.R76);
        DisplayBoardBackground[7][6] = (TextView) findViewById(R.id.G8);
        for(int i = 0; i<8; i++)
        {
            DisplayBoard[i][6].setBackgroundResource(R.drawable.whitepawn);
        }


        DisplayBoard[0][7] = (TextView) findViewById(R.id.R07);
        DisplayBoard[0][7].setBackgroundResource(R.drawable.whiterook);
        DisplayBoardBackground[0][7] = (TextView) findViewById(R.id.H1);
        DisplayBoard[1][7] = (TextView) findViewById(R.id.R17);
        DisplayBoard[1][7].setBackgroundResource(R.drawable.whiteknight);
        DisplayBoardBackground[1][7] = (TextView) findViewById(R.id.H2);
        DisplayBoard[2][7] = (TextView) findViewById(R.id.R27);
        DisplayBoard[2][7].setBackgroundResource(R.drawable.whitebishop);
        DisplayBoardBackground[2][7] = (TextView) findViewById(R.id.H3);
        DisplayBoard[3][7] = (TextView) findViewById(R.id.R37);
        DisplayBoard[3][7].setBackgroundResource(R.drawable.whitequeen);
        DisplayBoardBackground[3][7] = (TextView) findViewById(R.id.H4);
        DisplayBoard[4][7] = (TextView) findViewById(R.id.R47);
        DisplayBoard[4][7].setBackgroundResource(R.drawable.whiteking);
        DisplayBoardBackground[4][7] = (TextView) findViewById(R.id.H5);
        DisplayBoard[5][7] = (TextView) findViewById(R.id.R57);
        DisplayBoard[5][7].setBackgroundResource(R.drawable.whitebishop);
        DisplayBoardBackground[5][7] = (TextView) findViewById(R.id.H6);
        DisplayBoard[6][7] = (TextView) findViewById(R.id.R67);
        DisplayBoard[6][7].setBackgroundResource(R.drawable.whiteknight);
        DisplayBoardBackground[6][7] = (TextView) findViewById(R.id.H7);
        DisplayBoard[7][7] = (TextView) findViewById(R.id.R77);
        DisplayBoard[7][7].setBackgroundResource(R.drawable.whiterook);
        DisplayBoardBackground[7][7] = (TextView) findViewById(R.id.H8);
        for(int i = 0; i<8; i++)
        {
            DisplayBoard2[i][6]=true;
        }
        for(int i = 0; i<8; i++)
        {
            DisplayBoard2[i][7]=true;
        }
    }
}