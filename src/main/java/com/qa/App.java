package com.qa;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        App app = new App();
        app.divisible(5, 101);
    }

    public Boolean divisible(int arg1, int arg2) {
        if (arg1 % 5 == 0 && arg2 % 5 == 0) {
            return true;
        }
        return true;
    }
}