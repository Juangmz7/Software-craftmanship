package com.juangomez.gameController;

public class SquareAction implements Action {
    @Override
    public void execute() {
        System.out.println("Using weapon!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo using weapon!!");
    }
}
