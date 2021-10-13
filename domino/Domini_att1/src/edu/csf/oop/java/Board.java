package edu.csf.oop.java;

public class Board {
    private   class LinkedBones {
        public Board board;
        public Board.LinkedBones next;

        public LinkedBones(Board value, Board.LinkedBones next) {
            this.board = value;
            this.next = next;
        }

        public LinkedBones(Board value) {
            this(value, null);
        }

        public LinkedBones() {
            this(null);
        }
    }

    private LinkedBones head = null;
    private LinkedBones tail = null;

 public void AddToTheEnd(LinkedBones head){

 }
}