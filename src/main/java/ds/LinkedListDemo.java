package ds;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.addNodeAtStart(2);
    list.display();
    list.addNodeAtStart(1);
    list.display();
    list.addNodeAtEnd(3);
    list.display();
    list.addNodeAtStart(5);
    list.display();
    list.addNodeAtEnd(6);
    list.display();
    list.addAtPos(7, 0);
    list.display();
    list.addAtPos(8, 2);
    list.display();
    list.addAtPos(9, 1);
    list.display();
    list.addAtPos(10, 10);
    list.display();
  }
}
