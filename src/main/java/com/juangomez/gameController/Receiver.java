package com.juangomez.gameController;

public class Receiver {

    private void perform(Action action) {
        action.execute();
    }

    public void actionCross() {
        perform(new CrossAction());
    }

    public void actionTriangle() {
        perform(new TriangleAction());
    }

    public void actionSquare() {
       perform(new SquareAction());
    }

    public void actionCircle() {
       perform(new CircleAction());
    }
}
