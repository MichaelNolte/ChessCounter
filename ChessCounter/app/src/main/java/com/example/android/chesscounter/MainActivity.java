package com.example.android.chesscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static com.example.android.chesscounter.R.id.player_a_vs_b_b;
import static com.example.android.chesscounter.R.id.player_b_vs_a_b;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Variables
     */

    int white_king = 1;
    int black_king = 1;
    int white_queen = 1;
    int black_queen = 1;
    int white_knight = 2;
    int black_knight = 2;
    int white_bishop = 2;
    int black_bishop = 2;
    int white_rook = 2;
    int black_rook = 2;
    int white_pawn = 10;
    int black_pawn = 10;
    float score_a = white_queen * 9 + white_knight * 3 + white_bishop * 3 + white_rook * 5 + white_pawn;
    float score_b = black_queen * 9 + black_knight * 3 + black_bishop * 3 + black_rook * 5 + black_pawn;

    /**
     * Button functions for Player A
     */

    public void minusWhiteKing(View view) {
        white_king=0;
        white_queen=0;
        white_knight=0;
        white_bishop=0;
        white_rook=0;
        white_pawn=0;
        displayWhiteKing(white_king);
        displayWhiteQueen(white_king);
        displayWhiteKnight(white_knight);
        displayWhiteBishop(white_bishop);
        displayWhiteRook(white_rook);
        displayWhitePawn(white_pawn);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusWhiteKing(View view) {
        white_king=1;
        white_queen=1;
        white_knight=2;
        white_bishop=2;
        white_rook=2;
        white_pawn=10;
        displayWhiteKing(white_king);
        displayWhiteQueen(white_queen);
        displayWhiteKnight(white_knight);
        displayWhiteBishop(white_bishop);
        displayWhiteRook(white_rook);
        displayWhitePawn(white_pawn);
        calculateScoreA();
        calculateScoreB();

    }

    public void minusWhiteQueen(View view) {
        if(white_queen<1){
            white_queen=0;
        }
        else {
            white_queen = white_queen - 1;
        }
        displayWhiteQueen(white_queen);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusWhiteQueen(View view) {
        if(white_queen>2){
            white_queen=3;
        }
        else {
            white_queen = white_queen + 1;
        }
        displayWhiteQueen(white_queen);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusWhiteKnight(View view) {
        if(white_knight<1){
            white_knight=0;
        }
        else {
            white_knight = white_knight - 1;
        }
        displayWhiteKnight(white_knight);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusWhiteKnight(View view) {
        if(white_knight>1){
            white_knight=2;
        }
        else {
            white_knight = white_knight + 1;
        }
        displayWhiteKnight(white_knight);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusWhiteBishop(View view) {
        if(white_bishop<1){
            white_bishop=0;
        }
        else {
            white_bishop = white_bishop - 1;
        }
        displayWhiteBishop(white_bishop);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusWhiteBishop(View view) {
        if(white_bishop>1){
            white_bishop=2;
        }
        else {
            white_bishop = white_bishop + 1;
        }
        displayWhiteBishop(white_bishop);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusWhiteRook(View view) {
        if(white_rook<1){
            white_rook = 0;
        }
        else {
            white_rook = white_rook - 1;
        }
        displayWhiteRook(white_rook);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusWhiteRook(View view) {
        if(white_rook>1){
            white_rook = 2;
        }
        else {
            white_rook = white_rook + 1;
        }
        displayWhiteRook(white_rook);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusWhitePawn(View view) {
        if(white_pawn<1){
            white_pawn = 0;
        }
        else {
            white_pawn = white_pawn - 1;
        }
        displayWhitePawn(white_pawn);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusWhitePawn(View view) {
        if(white_pawn>9) {
            white_pawn = 10;
        }
        else {
            white_pawn = white_pawn + 1;
        }
        displayWhitePawn(white_pawn);
        calculateScoreA();
        calculateScoreB();
    }

    /**
     * Button functions for Player B
     */

    public void minusBlackKing(View view) {
        black_king=0;
        black_queen=0;
        black_knight=0;
        black_bishop=0;
        black_rook=0;
        black_pawn=0;
        displayBlackKing(black_king);
        displayBlackQueen(black_king);
        displayBlackKnight(black_knight);
        displayBlackBishop(black_bishop);
        displayBlackRook(black_rook);
        displayBlackPawn(black_pawn);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusBlackKing(View view) {
        black_king=1;
        black_queen=1;
        black_knight=2;
        black_bishop=2;
        black_rook=2;
        black_pawn=10;
        displayBlackKing(black_king);
        displayBlackQueen(black_queen);
        displayBlackKnight(black_knight);
        displayBlackBishop(black_bishop);
        displayBlackRook(black_rook);
        displayBlackPawn(black_pawn);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusBlackQueen(View view) {
        if(black_queen<1){
            black_queen=0;
        }
        else {
            black_queen = black_queen - 1;
        }
        displayBlackQueen(black_queen);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusBlackQueen(View view) {
        if(black_queen>2){
            black_queen=3;
        }
        else {
            black_queen = black_queen + 1;
        }
        displayBlackQueen(black_queen);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusBlackKnight(View view) {
        if(black_knight<1){
            black_knight=0;
        }
        else {
            black_knight = black_knight - 1;
        }
        displayBlackKnight(black_knight);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusBlackKnight(View view) {
        if(black_knight>1){
            black_knight=2;
        }
        else {
            black_knight = black_knight + 1;
        }
        displayBlackKnight(black_knight);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusBlackBishop(View view) {
        if(black_bishop<1){
            black_bishop=0;
        }
        else {
            black_bishop = black_bishop - 1;
        }
        displayBlackBishop(black_bishop);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusBlackBishop(View view) {
        if(black_bishop>1){
            black_bishop=2;
        }
        else {
            black_bishop = black_bishop + 1;
        }
        displayBlackBishop(black_bishop);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusBlackRook(View view) {

        if(black_rook<1){
            black_rook = 0;
        }
        else {
            black_rook = black_rook - 1;
        }
        displayBlackRook(black_rook);
        calculateScoreA();
    }

    public void plusBlackRook(View view) {
        if(black_rook>1){
            black_rook = 2;
        }
        else {
            black_rook = black_rook + 1;
        }
        displayBlackRook(black_rook);
        calculateScoreA();
        calculateScoreB();
    }

    public void minusBlackPawn(View view) {

        if(black_pawn<1){
            black_pawn = 0;
        }
        else {
            black_pawn = black_pawn - 1;
        }
        displayBlackPawn(black_pawn);
        calculateScoreA();
        calculateScoreB();
    }

    public void plusBlackPawn(View view) {

        if(black_pawn>9) {
            black_pawn = 10;
        }
        else {
            black_pawn = black_pawn + 1;
        }
        displayBlackPawn(black_pawn);
        calculateScoreA();
        calculateScoreB();
    }


    /**
     * Display number of white figures
     */

    public void displayWhiteKing(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kings_player_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhiteQueen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.queens_player_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhiteKnight(int score) {
        TextView scoreView = (TextView) findViewById(R.id.knights_player_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhiteBishop(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bishops_player_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhiteRook(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rooks_player_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhitePawn(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pawns_player_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display number of black figures
     */

    public void displayBlackKing(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kings_player_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackQueen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.queens_player_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackKnight(int score) {
        TextView scoreView = (TextView) findViewById(R.id.knights_player_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackBishop(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bishops_player_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackRook(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rooks_player_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackPawn(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pawns_player_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Calculate score
     */

    public void calculateScoreA() {
        score_a = white_queen * 9 + white_knight * 3 + white_bishop * 3 + white_rook * 5 + white_pawn;
        score_b = black_queen * 9 + black_knight * 3 + black_bishop * 3 + black_rook * 5 + black_pawn;
        float player_a_vs_b = score_b / score_a;
        displayScoreAB(player_a_vs_b);

    }

    public void calculateScoreB() {
        score_a = white_queen * 9 + white_knight * 3 + white_bishop * 3 + white_rook * 5 + white_pawn;
        score_b = black_queen * 9 + black_knight * 3 + black_bishop * 3 + black_rook * 5 + black_pawn;
        float player_b_vs_a = score_a / score_b;
        displayScoreBA(player_b_vs_a);

    }

    /**
     * Display score
     */


    public void displayScoreAB(float score) {
        TextView scoreView = (TextView) findViewById(player_a_vs_b_b);
        scoreView.setText(transformScore(score));
    }

    public void displayScoreBA(float score) {
        TextView scoreView = (TextView) findViewById(player_b_vs_a_b);
        scoreView.setText(transformScore(score));
    }

    public String transformScore(float score) {
        String score_string = String.valueOf(score);
        int i;
        if(score_string.length() < 4) {
            i = score_string.length();
        }
        else {
            i = 4;
        }
        return score_string.substring(0, i);
    }

}

