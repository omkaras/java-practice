package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorClass {
  public static void main(String[] args) {
    Land land1 = new Land(2, "garden", "Baner", List.of("p1, p2, p3"),
      List.of(new Owner("Tom"), new Owner("Harry")));

    Land land2 = new Land(1, "tuk", "Balewadi", List.of("p2, p3"),
      List.of(new Owner("Rob"), new Owner("Pam")));

    Land land3 = new Land(1, "btuk", "Baner", List.of("p2, p3"),
      List.of(new Owner("Rob"), new Owner("Pam")));

    Land land4 = new Land(3, "teak", "Aundh", List.of("p3"),
      List.of(new Owner("Rob")));

    List<Land> lands = new ArrayList<>(List.of(land1, land2, land3, land4));

    System.out.println(lands);

    Collections.sort(lands);
    System.out.println(lands);

    lands.sort(new AreaComparator());
    System.out.println(lands);
  }
}

class AreaComparator implements Comparator<Land> {
  @Override
  public int compare(Land o1, Land o2) {
    return o1.getArea().compareTo(o2.getArea());
  }
}

class Land implements Comparable<Land> {
  private final int id;
  private final String name;
  private final String area;
  private final List<String> zones;
  private final List<Owner> owners;

  @Override
  public String toString() {
    return "Land{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", area='" + area + '\'' +
      ", zones=" + zones +
      ", owners=" + owners +
      '}' +
      '\n';
  }

  public Land(int id, String name, String area, List<String> zones, List<Owner> owners) {
    this.id = id;
    this.name = name;
    this.area = area;
    this.zones = zones;
    this.owners = owners;
  }

  @Override
  public int compareTo(Land o) {
   /* int cmp = Integer.compare(this.id, o.getId());
    if (cmp != 0) return cmp;

    return this.name.compareTo(o.getName());*/

    return Comparator.comparingInt(Land::getId)
      .thenComparing(Land::getName).compare(this, o);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getArea() {
    return area;
  }
}

record Owner(String name) {

  @Override
  public String toString() {
    return "Owner{" +
      "name='" + name + '\'' +
      '}';
  }
}
