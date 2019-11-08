public class Main {
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

    int x = 7;
    float f = 42.3f;
    double d = 42.3;

    // execute the function called "loopTo" and pass 10 as a parameter
    loopTo(10);

    int four = 4;
    int result = multiplyByTwo(four);
    System.out.println(four + " doubled is " + result);

    int dogCount = 1;

System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }

  // Functions that return nothing have a return type of "void"
  public static void loopTo(int max) {
    for (int i = 0; i < max; i++) {
      System.out.println("Loop #" + i);
    }
  }

  // This function has a return type of "int"
  public static int multiplyByTwo(int n) {
    return n * 2;
  }


  public static String pluralize( String singular, int count)
{
    // return singular.concat("s");
    return pluralize( singular, count, singular.concat("s"));
}

public static String pluralize( String singular, int count, String plural)
{
  return (count == 1 ? singular : plural);
}
}
