public abstract class Vehicle {
  // Méthode abstraite
  public abstract String doStuff();

  // attributs
  private String brand;
  private int kilometers;

  // constructeurs
  public Vehicle(String brand) {
    this.brand = brand;
    this.kilometers = kilometers;
  }

  // accesseurs et mutateurs
  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) { this.brand = brand; }

  public int getKilometers() {
    return this.kilometers;
  }

  public void setKilometers(int kilometers) {
    this.kilometers = kilometers;
  }
}
