package ru.mirea.classes;

import ru.mirea.interfaces.*;

public class MovableCircle implements Movable {
  private int radius;
  private MovablePoint center;

  /**
   * Создаёт движущийся круг
   * @param x           координата центра по оси абсцисс
   * @param y           координата центра по оси ординат
   * @param xSpeed      скорость по оси абсцисс
   * @param ySpeed      скорость по оси ординат
   * @param radius      радиус окружности
   */
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.radius = radius;
    this.center = new MovablePoint(x, y, xSpeed, ySpeed);
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return      строка с инфомацией об объекте
   */
  @Override
  public String toString() {
    return "MovableCircle {\n"
         + "\tx: " + this.center.x + "\n"
         + "\ty: " + this.center.y + "\n"
         + "\txSpeed: " + this.center.xSpeed + "\n"
         + "\tySpeed: " + this.center.ySpeed + "\n"
         + "\tradius: " + this.radius + "\n"
         + "}";
  }

  /**
   * Перемещает точку вверх по координатной плоскости
   */
  public void moveUp() {
    this.center.moveUp();
  }

  /**
   * Перемещает точку вниз по координатной плоскости
   */
  public void moveDown() {
    this.center.moveDown();
  }

  /**
   * Перемещает точку влево по координатной плоскости
   */
  public void moveLeft() {
    this.center.moveLeft();
  }

  /**
   * Перемещает точку вправо по координатной плоскости
   */
  public void moveRight() {
    this.center.moveRight();
  }
}
