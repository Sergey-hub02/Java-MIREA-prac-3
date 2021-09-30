package ru.mirea.classes;

public class Square extends Rectangle {
  /**
   * Конструктор по умолчанию
   */
  public Square() {
    this.width = 0.0;
    this.length = 0.0;
  }

  /**
   * Конструктор, создающий форму квадрата
   * @param side      длина стороны квадрата
   */
  public Square(double side) {
    this.width = side;
    this.length = side;
  }

  /**
   * Конструктор, создающий закращенный квадрат
   * @param side        длина стороны
   * @param color       цвет квадрата
   * @param filled      заливка
   */
  public Square(double side, String color, boolean filled) {
    this.width = side;
    this.length = side;
    this.color = color;
    this.filled = filled;
  }

  /**
   * Геттер для поля width или length
   * @return      длина стороны квадрата
   */
  public double getSide() {
    return this.width;
  }

  /**
   * Сеттер для поля side
   * @param side      новая длина стороны квадрата
   */
  public void setSide(double side) {
    this.width = side;
    this.length = side;
  }

  /**
   * Сеттер для поля width
   * @param width     новая ширина прямоугольника
   */
  @Override
  public void setWidth(double width) {
    this.setSide(width);
  }

  /**
   * Сеттер для поля length
   * @param length    длина прямоугольника
   */
  @Override
  public void setLength(double length) {
    this.setSide(length);
  }

  @Override
  public String toString() {
    return "Square {\n"
         + "\twidth: " + this.width + "\n"
         + "\tlength: " + this.length + "\n"
         + "\tcolor: " + this.color + "\n"
         + "\tfilled: " + this.filled + "\n"
         + "\tarea: " + this.getArea() + "\n"
         + "\tperimeter: " + this.getPerimeter() + "\n"
         + "}";
  }
}
