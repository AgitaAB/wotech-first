// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {    
    //System.out.println("Hello world!");
    
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat
    // all code with if - spending computers resources
    // if - else if, do not check all if conditions, as soon as True - stop checking
        
    String season = "spring";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    }
    else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    }
    else {
      System.out.println("Invalid season!");
    }

    // +5 wear super warm
    // +5 to 15 warm
    // 15 to 30 normal
    // 30+ cooling
    // var use when do not specify data type, it is detected from value and type will be automatically type
    // var do not allow null value - it can not assign type
    
    
    double temperature = 30;

    if (temperature <= 5) {
      System.out.println("It is super warm!");
    }
    else if (temperature <= 15) {
      System.out.println("It is warm!");
    }
    else if (temperature <= 30) {
      System.out.println("It is normal!");
    }
    else if (temperature < 30) {
      System.out.println("You need a cooling!");
    }
    else {
      System.out.println("Can not comment!");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
