package ru.mirea.classes;

import ru.mirea.interfaces.*;

public class MovableRectangle implements Movable {
  private MovablePoint topLeft;
  private MovablePoint bottomRight;

  /**
   * Создаёт движущийся прямоугольник
   * @param x1          координата левой верхней точки по оси X
   * @param y1          координата левой верхней точки по оси Y
   * @param x2          координата правой нижней точки по оси X
   * @param y2          координата правой нижней точки по оси Y
   * @param xSpeed      скорость по оси X
   * @param ySpeed      скорость по оси Y
   */
  public MovableRectangle(
    int x1,
    int y1,
    int x2,
    int y2,
    int xSpeed,
    int ySpeed
  ) {
    this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
  }

  /**
   * Объединяет информацию об объекте в одну строку
   * @return      строка с инфомацией об объекте
   */
  @Override
  public String toString() {
    return "MovableRectangle {\n"
         + "\tx1: " + this.topLeft.x + "\n"
         + "\ty1: " + this.topLeft.y + "\n"
         + "\tx2: " + this.bottomRight.x + "\n"
         + "\ty2: " + this.bottomRight.y + "\n"
         + "\txSpeed: " + this.topLeft.xSpeed + "\n"
         + "\tySpeed: " + this.bottomRight.ySpeed + "\n"
         + "}";
  }

  /**
   * Перемещает точку вверх по координатной плоскости
   */
  public void moveUp() {
    this.topLeft.moveUp();
    this.bottomRight.moveUp();
  }

  /**
   * Перемещает точку вниз по координатной плоскости
   */
  public void moveDown() {
    this.topLeft.moveDown();
    this.bottomRight.moveDown();
  }

  /**
   * Перемещает точку влево по координатной плоскости
   */
  public void moveLeft() {
    this.topLeft.moveLeft();
    this.bottomRight.moveLeft();
  }

  /**
   * Перемещает точку вправо по координатной плоскости
   */
  public void moveRight() {
    this.topLeft.moveRight();
    this.bottomRight.moveRight();
  }

  /**
   * Проверяет, одинаковы ли скорости точек
   */
  public boolean checkTheSameSpeed() {
    return (this.topLeft.xSpeed == this.bottomRight.xSpeed)
        && (this.topLeft.ySpeed == this.bottomRight.ySpeed);
  }
}
