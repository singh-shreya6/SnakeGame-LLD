package models;

import java.util.LinkedList;

public class Snake {

    LinkedList<Cell> snakePartList = new LinkedList<>();
    Cell head;

    public Snake(Cell init) {
        this.head = init;
        snakePartList.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    public void grow() {
        snakePartList.add(head);
    }

    public void move(Cell nextCell) {
        System.out.println("Snake moving to " + nextCell.getRow() + " " + nextCell.getCol());
        Cell last = snakePartList.removeLast();
        last.setCellType(CellType.EMPTY);

        head = nextCell;
        snakePartList.addFirst(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    public boolean checkCrash(Cell nextCell) {
        return snakePartList.contains(nextCell);
    }

    public LinkedList<Cell> getSnakePartList() {
        return snakePartList;
    }

    public void setSnakePartList(LinkedList<Cell> snakePartList) {
        this.snakePartList = snakePartList;
    }

    public Cell getHead() {
        return head;
    }

    public void setHead(Cell head) {
        this.head = head;
    }


}
