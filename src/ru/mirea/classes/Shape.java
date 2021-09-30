package ru.mirea.classes;

public abstract class Shape {
  protected String color;
  protected boolean filled;

  /**
   * Конструктор по умолчанию
   */
  public Shape() {
    this.color = "";
    this.filled = false;
  }

  /**
   * Конструктор, инициализирующий все поля
   * @param color         цвет фигуры
   * @param filled        параметр, определяющий, закрашена ли фигура или нет
   */
  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**
   * Геттер для поля color
   * @return        цвет фигуры
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Сеттер для поля color
   * @param color         новый цвет фигуры
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Геттер для поля filled
   * @return        показывает, закращена фигура или нет
   */
  public boolean isFilled() {
    return this.filled;
  }

  /**
   * Сеттер для поля filled
   * @param filled      новое состояние закращенности фигуры
   */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**
   * Вычисляет площадь фигуры
   * @return      площадь фигуры
   */
  public abstract double getArea();

  /**
   * Вычисляет периметр фигуры
   * @return      периметр фигуры
   */
  public abstract double getPerimeter();

  /**
   * Объединяет информацию об объекте в одну строку
   * @return      строка с инфомацией об объекте
   */
  @Override
  public abstract String toString();
}
