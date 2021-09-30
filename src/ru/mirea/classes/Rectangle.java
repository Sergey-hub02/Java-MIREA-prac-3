package ru.mirea.classes;

public class Rectangle extends Shape {
  protected double width;
  protected double length;

  /**
   * Конструктор по умолчанию
   */
  public Rectangle() {
    this.width = 0.0;
    this.length = 0.0;
  }

  /**
   * Конструктор, создающий форму прямоугольника
   * @param width         ширина
   * @param length        длина
   */
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * Конструктор, создающий цветной прямоугольник
   * @param width       ширина
   * @param length      длина
   * @param color       цвет
   * @param filled      заливка
   */
  public Rectangle(double width, double length, String color, boolean filled) {
    this.width = width;
    this.length = length;
    this.color = color;
    this.filled = filled;
  }

  /**
   * Геттер для поля width
   * @return    ширина прямоугольника
   */
  public double getWidth() {
    return this.width;
  }

  /**
   * Сеттер для поля width
   * @param width     новая ширина прямоугольника
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Геттер для поля length
   * @return    длина прямоугольника
   */
  public double getLength() {
    return this.length;
  }

  /**
   * Сеттер для поля length
   * @param length    длина прямоугольника
   */
  public void setLength(double length) {
    this.length = length;
  }

  /**
   * Вычисляет площадь прямоугольника
   * @return      площадь прямоугольника
   */
  public double getArea() {
    return this.width * this.length;
  }

  /**
   * Вычисляет периметр прямоугольника
   * @return      периметр прямоугольника
   */
  public double getPerimeter() {
    return 2.0 * (this.width + this.length);
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return      строка с инфомацией об объекте
   */
  @Override
  public String toString() {
    return "Rectangle {\n"
         + "\twidth: " + this.width + "\n"
         + "\tlength: " + this.length + "\n"
         + "\tcolor: " + this.color + "\n"
         + "\tfilled: " + this.filled + "\n"
         + "\tarea: " + this.getArea() + "\n"
         + "\tperimeter: " + this.getPerimeter() + "\n"
         + "}";
  }
}
