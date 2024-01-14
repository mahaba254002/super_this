/*
 * SUPER
 * It is used to call method in the super/parent class tha you override in child class
 * call parent class constructor to avoid repeatition
 * 
 * THIS
 * Refer to current object that the method your currently in was called on
 * Used insider a constructor to call other constructors
 */
class Cars {
  String brand="tyt";//NOTE this has been initiated to show how (this) works
  String fuel;
  float mileage;
  String color;

  public Cars(String brand, String fuel, float mileage) {
    this.brand = brand;
    this.fuel = fuel;
    this.mileage = mileage;
  }

  public void startEngine() {
    System.out.println("Grrrrrrrrrrrrrshhhhh");
  }

  public String toString() {
    return "Cars{" +
        "brand='" + brand + '\'' +
        ", fuel='" + fuel + '\'' +
        ", mmileage=" + mileage +
        '}';
  }
}
