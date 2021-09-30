package ru.mirea;

import java.util.Scanner;
import ru.mirea.classes.*;

public class App {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    /*======== КРУГ ========*/
    System.out.print("Введите радиус окружности: ");
    double circleRadius = IN.nextDouble();

    System.out.print("Введите цвет круга: ");
    String circleColor = IN.next();

    Shape circle = new Circle(circleRadius, circleColor, false);
    /*======== КРУГ ========*/

    System.out.println();

    /*======== ПРЯМОУГОЛЬНИК ========*/
    System.out.print("Введите ширину прямоугольника: ");
    double recWidth = IN.nextDouble();

    System.out.print("Введите длину прямоугольника: ");
    double recLength = IN.nextDouble();

    System.out.print("Введите цвет прямоугольника: ");
    String recColor = IN.next();

    Rectangle rec = new Rectangle(recWidth, recLength, recColor, true);
    /*======== ПРЯМОУГОЛЬНИК ========*/

    System.out.println();

    /*======== КВАДРАТ ========*/
    System.out.print("Введите длину стороны квадрата: ");
    double squareSide = IN.nextDouble();

    System.out.print("Введите цвет квадрата: ");
    String squareColor = IN.next();

    Square square = new Square(squareSide, squareColor, true);
    /*======== КВАДРАТ ========*/

    System.out.println();
    System.out.println(circle);
    System.out.println(rec);
    System.out.println(square);
  }
}
