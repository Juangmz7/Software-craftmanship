package com.juangomez.gameController;

public class CrossAction implements Action {
    @Override
    public void execute() {
        System.out.println("Jumping!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo Jumping!!");
    }
}
