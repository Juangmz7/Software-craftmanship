package com.juangomez.gameController;

public class GameControllerTest {
    public static void main(String[] args) {
        var receiver = new Receiver();

        receiver.actionTriangle();
        receiver.actionCircle();
        receiver.actionCross();
        receiver.actionSquare();

    }
}