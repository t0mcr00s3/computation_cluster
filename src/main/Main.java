package main;

import starter.Starter;

public class Main {
    public static void main(String[]args){
        String expression = "2 + 4 * 2";
        Starter starter = new Starter(expression);
        starter.start();
    }
}
