package core;

import java.util.List;
import java.util.Objects;

public class EqualsAndHashCode {
  public static void main(String[] args) {
    Car car1 = new Car("Audi", 3453, 100000, List.of(new Variant("premium")));
    String carName = "Audi";
    Car car2 = new Car(carName, 3453, 100000, List.of(new Variant("premium")));

    System.out.println(car1.equals(car2));
    System.out.println(car1.hashCode());
    System.out.println(car2.hashCode());
  }
}

record Car(String name, int chassis, int price, List<Variant> variants) {
  public boolean equals(Object c1) {
    if (this == c1) return true;
    if (c1 == null || c1.getClass() != this.getClass()) return false;

    Car car = (Car) c1;

    return Objects.equals(this.name, car.name())
        && this.price == car.price()
        && this.chassis == car.chassis()
        && Objects.equals(this.variants, car.variants());
  }
}

record Variant(String variantName) {
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;

    Variant variant = (Variant) obj;
    return Objects.equals(this.variantName, variant.variantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.variantName);
  }
}

/*class Car {
  private final String name;
  private final int chassis;
  private final int price;
  private final List<Variant> variants;

  public Car(String name, int chassis, int price, List<Variant> variants) {
    this.name = name;
    this.chassis = chassis;
    this.price = price;
    this.variants = variants;
  }

  public String toString() {
    return name + "- price: " + price + ", chassis: " + chassis + ", variants: " + variants.toString();
  }

  public boolean equals(Object c1) {
    if(this == c1 ) return true;
    if(c1 == null || c1.getClass() != this.getClass()) return false;

    Car car = (Car) c1;

    return Objects.equals(this.name, car.getName()) &&
      this.price == car.getPrice() &&
      this.chassis == car.getChassis() &&
      Objects.equals(this.variants, car.getVariants());
  }

  public int hashCode() {
    return Objects.hash(this.name, this.price , this.chassis, this.variants);
  }

  public String getName() {
    return this.name;
  }

  public int getChassis() {
    return this.chassis;
  }

  public int getPrice() {
    return this.price;
  }

  public List<Variant> getVariants() {
    return this.variants;
  }
}

class Variant {
  private final String variantName;

  public Variant(String variant) {
    this.variantName = variant;
  }

  public String toString() {
    return this.variantName;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || obj.getClass() != this.getClass()) return false;

    Variant variant = (Variant) obj;
    return Objects.equals(this.variantName, variant.variantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.variantName);
  }
}*/
