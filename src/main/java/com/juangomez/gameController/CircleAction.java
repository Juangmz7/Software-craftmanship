package com.juangomez.gameController;

public class CircleAction implements Action {
    @Override
    public void execute() {
        System.out.println("Crouching!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo Crouching!!");
    }
}
