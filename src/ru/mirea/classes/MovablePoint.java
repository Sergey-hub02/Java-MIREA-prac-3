package ru.mirea.classes;

import ru.mirea.interfaces.*;

public class MovablePoint implements Movable {
  protected int x;
  protected int y;
  protected int xSpeed;
  protected int ySpeed;

  /**
   * Конструктор, создающий движущуюсю точку
   * @param x             координата по оси абсцисс
   * @param y             координата по оси ординат
   * @param xSpeed        скорость по оси абсцисс
   * @param ySpeed        скорость по оси ординат
   */
  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return      строка с инфомацией об объекте
   */
  @Override
  public String toString() {
    return "MovablePoint {\n"
         + "\tx: " + this.x + "\n"
         + "\ty: " + this.y + "\n"
         + "\txSpeed: " + this.xSpeed + "\n"
         + "\tySpeed: " + this.ySpeed + "\n"
         + "}";
  }

  /**
   * Перемещает точку вверх по координатной плоскости
   */
  public void moveUp() {
    this.y += this.ySpeed;
  }

  /**
   * Перемещает точку вниз по координатной плоскости
   */
  public void moveDown() {
    this.y -= this.ySpeed;
  }

  /**
   * Перемещает точку влево по координатной плоскости
   */
  public void moveLeft() {
    this.x -= this.xSpeed;
  }

  /**
   * Перемещает точку вправо по координатной плоскости
   */
  public void moveRight() {
    this.x += this.xSpeed;
  }
}
