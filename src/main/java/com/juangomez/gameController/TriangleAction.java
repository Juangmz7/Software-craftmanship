package com.juangomez.gameController;

public class TriangleAction implements Action {
    @Override
    public void execute() {
        System.out.println("Swapping weapon!!");
    }

    @Override
    public void undo() {
        System.out.println("Undo Swapping weapon!!");
    }
}
