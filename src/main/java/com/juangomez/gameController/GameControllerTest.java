package com.juangomez.gameController;

public class GameControllerTest {
    public static void main(String[] args) {
        var reciever = new Receiver();

        reciever.actionTriangle();
        reciever.actionCircle();
        reciever.actionCross();
        reciever.actionSquare();

    }
}