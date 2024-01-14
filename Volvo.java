public class Volvo extends Cars{
  public Volvo(String brand, String fuel, float mileage,int year) {
    super(brand, fuel, mileage);
  }


  @Override
  public void startEngine(){
    super.startEngine();
    System.out.println("Here we go!!!!!!!!!");
  }
}
