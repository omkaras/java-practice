package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableClass {

  public static void main(String[] args) {
    List<Friend> friends = new ArrayList<>();
    friends.add(new Friend("Ron"));
    friends.add(new Friend("Tina"));
    MyImmutableClass myImmutableClass = new MyImmutableClass("Tom", 20, friends);
    System.out.println(myImmutableClass);

    friends.add(new Friend("Harry"));
    System.out.println(myImmutableClass);
  }
}

final class MyImmutableClass {
  final private String name;
  final private int age;
  final private List<Friend> friends;

  public MyImmutableClass(String name, int age, List<Friend> friends) {
    this.name = name;
    this.age = age;
    this.friends = Collections.unmodifiableList(new ArrayList<>(friends));
  }

  public String toString() {
    return "Name: " + name + ", age: " + age + ", friends: " + friends;
  }
}

final class Friend {
  private final String name;

  public Friend(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name;
  }
}
