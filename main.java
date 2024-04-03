public class Main {
  public static void main(String[] args) {
  

  //untill +5 wear super warm
  /////+5 to 15 warm
  /// 15 to 30 normal
  /// 30 + cooling


    var temperature = -15;
    
    if (temperature < -5) {
        System.out.println("Wear extremely warm clothing");
    } else if (temperature >= -5 && temperature < 5) {
        System.out.println("Wear super warm clothing");
    } else if (temperature >= 5 && temperature < 15) {
        System.out.println("Wear warm clothing");
    } else if (temperature >= 15 && temperature < 30) {
        System.out.println("Wear normal clothing");
    } else if (temperature >= 30) {
        System.out.println("Wear cooling clothing");
    } else {
        System.out.println("Invalid temperature");
    }
  }
}
