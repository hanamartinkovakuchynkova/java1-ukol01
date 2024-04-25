package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class MainProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new MainProgram().start();
    }

    public void start() {
        zofka = new Turtle();

    /*zofka.turnRight(30); // draw equal-sided triangle
    zofka.penDown();
    drawEqualSidedTriangle(100);*/

        drawRowOfHouses();

        zofka.turnRight(180);
        zofka.move(250);
        zofka.turnLeft(180);

        drawHouse(); // 1st house in 2nd row

        zofka.turnRight(90);
        zofka.move(380);
        zofka.turnLeft(90);

        drawHouse(); // 2nd house in 2nd row

        zofka.turnLeft(90);
        zofka.move(140);
        zofka.turnRight(90);

        drawPig();

        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(160);
        zofka.turnRight(180);

        drawSignature();

        zofka.turnLeft(90);
        zofka.move(230);
        zofka.turnRight(90);
        zofka.move(620);

        drawSun();

    /*
    drawPig();

    zofka.turnLeft(90);
    zofka.move(190);

    drawOctagon();

    zofka.move(200);

    drawCircle();

    zofka.turnRight(180);
    zofka.move(700);

    drawSun();
    */
    }

    private void drawSignature() {
        drawLetterH(); // signature
        drawLetterA();
        drawLetterN();
        drawLetterA();
    }

    private void drawRowOfHouses() {
        for (int i = 0; i < 4; i++) { // 4 house in a row
            drawHouse();
            moveToLeft();
        }
        drawHouse(); // 5th house
    }

    private void moveToLeft() {
        zofka.turnLeft(90);
        zofka.move(95);
        zofka.turnRight(90);
    }

    private void drawEqualSidedTriangle(int sideLength) {
        for (int i = 0; i < 3; i++) {
            zofka.move(sideLength);
            zofka.turnRight(120);
        }
    }

    private void drawLetterN() {
        zofka.penDown();
        zofka.move(80);
        zofka.turnRight(155);
        zofka.move(89);
        zofka.turnLeft(155);
        zofka.move(80);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void drawLetterA() {
        zofka.penDown();
        zofka.turnRight(20);
        zofka.move(90);
        zofka.turnRight(140);
        zofka.move(90);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(70);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnRight(70);
        zofka.move(40);
        zofka.turnLeft(70);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void drawLetterH() {
        zofka.penDown();
        zofka.move(80);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.penDown();
        zofka.move(40);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private void drawHouse() {
        drawSquare();

        zofka.move(75);

        drawSmallRoof();
        goBackToStart();
    }

    private void goBackToStart() {
        zofka.penUp();
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(90);
    }

    private void drawSmallRoof() {
        zofka.penDown();
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
        zofka.penUp();
    }

    private void drawSquare() {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(75);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    private void drawSun() {
        zofka.penDown();
        for (int i = 0; i < 24; i++) {
            drawPartOfSun();
        }
        zofka.penUp();
    }

    private void drawPartOfSun() {
        zofka.move(10);

        zofka.turnRight(90);
        zofka.move(10);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(10);
        zofka.turnRight(90);
        zofka.penDown();

        zofka.turnLeft(15);
    }

    private void drawCircle() {
        zofka.penDown();
        for (int i = 0; i < 48; i++) {
            zofka.move(10);
            zofka.turnRight(7.5);
        }
        zofka.penUp();
    }

    private void drawOctagon() {
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
        zofka.penUp();
    }

    private void drawPig() {
        zofka.penDown();
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(100);

        drawRoof();

        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(75);

        drawLegs();

        zofka.turnRight(130);
        zofka.move(100);
        zofka.turnRight(90);

        drawLegs();

        zofka.turnLeft(50);
        zofka.move(100);
        zofka.turnRight(90);
    }

    private void drawLegs() {
        zofka.penDown();
        zofka.turnRight(40);
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnRight(100);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(25);
    }
    private void drawRoof() {
        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);
    }
}