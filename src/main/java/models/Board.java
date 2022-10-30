package models;

public class Board {

    int rows, cols;
    Cell[][] cells;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void generateFood() {
        int row, col;
        while (true) {
            row = (int) (Math.random() * rows);
            col = (int) (Math.random() * cols);
            if(cells[row][col].getCellType() != CellType.SNAKE_NODE) {
                break;
            }
        }
        cells[row][col].setCellType(CellType.FOOD);
        System.out.println("Food generated at " + row + " " + col);
    }
}
