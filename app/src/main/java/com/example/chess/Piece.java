package com.example.chess;

public class Piece {
    private boolean isWhite;

    Piece(boolean isWhite){
        this.isWhite = isWhite;
    }

    Piece(){

    }

    public boolean isWhite() {
        return isWhite;
    }
}
