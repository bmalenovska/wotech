public class Main {
  public static void main(String[] args) {

    double temperature = -15.0;

    if (temperature <= 5) {
      System.out.println("Wear super warm");
    }
    else if (temperature <= 15) {
      System.out.println("Wear warm");
    }
    else if (temperature <= 30) {
      System.out.println("Wear normal!");
    }
    else (temperature >= 30) {
      System.out.println("You need cooling!");
    }
    }


}
