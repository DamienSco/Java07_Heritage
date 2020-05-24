public class Hangar {
  public static void main(String[] args) {
    // Reference to a new instance of class Car
    Car clio = new Car("Clio");
    // setter usage
    clio.setKilometers(200);
    // getters usage
    System.out.println("Je suis " + clio.getBrand() +" et je fais vroum vroum !");


    // Reference to a new instance of class Boat
    Boat titanic = new Boat("Titanic");
    // setter usage
    titanic.setKilometers(4000);
    // getters usage
    System.out.println("Je suis " + titanic.getBrand() + " et je fais glou glou !");


  }

  private static void doStuff() {
  }
}
