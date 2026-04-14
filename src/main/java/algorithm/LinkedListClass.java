package algorithm;

public class LinkedListClass {
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

class Node {
  private int value;
  private Node next;

  public Node(int value) {
    this.next = null;
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}

class LinkedList {
  private Node start;
  private Node end;
  private int size;

  public void display() {
    Node temp = start;
    System.out.print(temp.getValue() + " --> ");
    while (temp.getNext() != null) {
      temp = temp.getNext();
      System.out.print(temp.getValue() + " --> ");
    }
    System.out.print("null [Size: "+ size +"]");
    System.out.println();
  }

  public void addNodeAtStart(int value) {
    Node node = new Node(value);
    if (start == null) {
      start = node;
      end = node;
    } else {
      node.setNext(start);
      start = node;
    }
    size++;
  }

  public void addNodeAtEnd(int value) {
    Node node = new Node(value);
    if (start == null) {
      start = node;
      end = node;
    } else {
      end.setNext(node);
      end = node;
    }
    size++;
  }

  public void addAtPos(int value, int position) {
    if(position >= size) {
      System.out.println("~~~ INSERT NOT POSSIBLE ~~~");
      return;
    }
    Node node = new Node(value);
    if(position == 0) {
      addNodeAtStart(value);
    }else{
      Node temp = start;
      for(int i = 0; i < position - 1; i++) {
        temp = temp.getNext();
      }
      node.setNext(temp.getNext());
      temp.setNext(node);
    }
    size++;
  }
}
