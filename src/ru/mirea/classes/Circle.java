package ru.mirea.classes;

public class Circle extends Shape {
  protected double radius;

  /**
   * Конструктор по умолчанию
   */
  public Circle() {
    this.radius = 0.0;
  }

  /**
   * Конструктор, создающий окружность
   * @param radius      радиус окружности
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * Конструктор, создающий закрашенный круг
   * @param radius        радиус окружности
   * @param color         цвет линии окружности
   * @param filled        закрашенность
   */
  public Circle(double radius, String color, boolean filled) {
    this.radius = radius;
    this.color = color;
    this.filled = filled;
  }

  /**
   * Геттер для поля radius
   * @return        радиус окружности
   */
  public double getRadius() {
    return this.radius;
  }

  /**
   * Сеттер для поля radius
   * @param radius      новый радиус окружности
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Вычисляет площадь круга
   * @return      площадь круга
   */
  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  /**
   * Вычисляет длину окружности
   * @return      длина окружности
   */
  public double getPerimeter() {
    return 2.0 * Math.PI * this.radius;
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return      строка с инфомацией об объекте
   */
  @Override
  public String toString() {
    return "Circle {\n"
         + "  radius: " + this.radius + "\n"
         + "  color: " + this.color + "\n"
         + "  filled: " + this.filled + "\n"
         + "  area: " + this.getArea() + "\n"
         + "  perimeter: " + this.getPerimeter() + "\n"
         + "}";
  }
}
