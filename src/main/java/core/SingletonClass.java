package core;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class SingletonClass {
  public static void main(String[] args) throws Exception {
    Runnable runnable =
        () ->
            System.out.println(
                Thread.currentThread().getName()
                    + ": "
                    + MySingletonClass.getInstance().toString());

    Thread thread1 = new Thread(runnable, "t1");
    Thread thread2 = new Thread(runnable, "t2");

    thread1.start();
    thread2.start();

    // This still can be broken using Reflection
    Constructor<MySingletonClass> c = MySingletonClass.class.getDeclaredConstructor(String.class);
    c.setAccessible(true);
    MySingletonClass instance2 = c.newInstance("val2");
    System.out.println(Thread.currentThread().getName() + ": " + instance2);

    HashMap<String, String> s = new HashMap<>();
    s.put("s", "ss");
  }
}

class MySingletonClass {
  private static volatile MySingletonClass INSTANCE;

  private final String value;

  private MySingletonClass(String value) {
    this.value = value;
  }

  public static MySingletonClass getInstance() {
    if (INSTANCE == null) {
      synchronized (MySingletonClass.class) {
        if (INSTANCE == null) {
          INSTANCE = new MySingletonClass("val1");
        }
      }
    }
    return INSTANCE;
  }

  public String toString() {
    return "Value: " + value + " | Hash: " + this.hashCode();
  }
}
