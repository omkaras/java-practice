package algorithm;
import java.util.HashMap;
import java.util.Map;

public class LRUDemo {
  public static void main(String[] args) {

    // head <-> tail
    LRU lru = new LRU(5);

    // Add in cache
    // head <-> 3 <-> tail
    lru.add(3, "audi");

    // Add in cache
    // Read from cache
    // Add in cache
    // Read from cache
    // Add in cache
    // Add in cache
  }
}

class LRUNode {
  LRUNode next;
  LRUNode prev;
  int key;
  String value;

  public LRUNode(int key, String value) {
    this.key = key;
    this.value = value;
  }

}

class LRU {
  private final int capacity;
  Map<Integer, LRUNode> map;

  LRUNode head = null;
  LRUNode tail = null;

  public LRU(int capacity) {
    LRUNode head = new LRUNode(0, "");
    LRUNode tail = new LRUNode(0, "");

    head.next = tail;
    tail.prev = head;

    this.capacity = capacity;
    this.map = new HashMap<>();
  }

  public void add(int key, String value) {

    if (map.containsKey(key)) {

    } else {
      // head <-> 2 <-> tail
      LRUNode node = new LRUNode(key, value);
      // 3 -> tail
      node.next = head.next;
      // 3 <- 2 <-> tail
      // 3 <-> 2 <-> tail
      head.next.prev = node;

      // head -> 3 <-> 2 <-> tail
      head.next = node;

      // head <-> 3 <-> 2 <-> tail
      node.prev = head;
    }
  }
}
