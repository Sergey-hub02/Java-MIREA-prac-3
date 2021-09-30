package ru.mirea.interfaces;

public interface Movable {
  /**
   * Перемещает точку вверх по координатной плоскости
   */
  void moveUp();

  /**
   * Перемещает точку вниз по координатной плоскости
   */
  void moveDown();

  /**
   * Перемещает точку влево по координатной плоскости
   */
  void moveLeft();

  /**
   * Перемещает точку вправо по координатной плоскости
   */
  void moveRight();
}
