package com.fatacubez.game;

import java.awt.*;
import java.awt.event.KeyEvent;

public interface GameBoardmove {
    void render(Graphics2D g);

    void update();

    boolean move(int row, int col, int horizontalDirection, int verticalDirection, Direction dir);

    void keyPressed(KeyEvent e);
}
