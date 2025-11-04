package com.juangomez.gameController;

public class Receiver {

    private Action action;

    private void perform(Action action) {
        this.action = action;
        this.action.execute();
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
