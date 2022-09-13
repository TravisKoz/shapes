import java.util.Scanner;

public class ShapesTest {

  public static void main(String[] args) {

    // Declare Variables
    float cylinderRadius;
    float cylinderHeight;
    float sphereRadius;
    float cuboidWidth;
    float cuboidHeight;
    float cuboidDepth;

    // Create a Scanner Object
    Scanner keyboard = new Scanner(System.in);

    // Enter Cylinder Dimensions and validate negative values aren't entered.
    System.out.println("Enter the radius for the cylinder:");
    cylinderRadius = Float.parseFloat(keyboard.nextLine());

    while (cylinderRadius <= 0) {
      System.out.println("Invalid number entered, you must enter a number greater than 0.");
      System.out.println("Enter the radius for the cylinder:");
      cylinderRadius = Float.parseFloat(keyboard.nextLine());
    }

    System.out.println("Enter the height for the cylinder:");
    cylinderHeight = Float.parseFloat(keyboard.nextLine());

    while (cylinderHeight <= 0) {
      System.out.println("Invalid number entered, you must enter a number greater than 0.");
      System.out.println("Enter the height for the cylinder:");
      cylinderHeight = Float.parseFloat(keyboard.nextLine());
    }

    // Enter Sphere Dimensions and validate negative values aren't entered.
    System.out.println("Enter the radius for the sphere:");
    sphereRadius = Float.parseFloat(keyboard.nextLine());

    while (sphereRadius <= 0) {
      System.out.println("Invalid number entered, you must enter a number greater than 0.");
      System.out.println("Enter the radius for the sphere:");
      sphereRadius = Float.parseFloat(keyboard.nextLine());
    }

    // Enter Cuboid Dimensions and validate negative values aren't entered.
    System.out.println("Enter the width for the cuboid:");
    cuboidWidth = Float.parseFloat(keyboard.nextLine());

    while (cuboidWidth <= 0) {
      System.out.println("Invalid number entered, you must enter a number greater than 0.");
      System.out.println("Enter the width for the cuboid:");
      cuboidWidth = Float.parseFloat(keyboard.nextLine());
    }

    System.out.println("Enter the width for the cuboid:");
    cuboidHeight = Float.parseFloat(keyboard.nextLine());

    while (cuboidHeight <= 0) {
      System.out.println("Invalid number entered, you must enter a number greater than 0.");
      System.out.println("Enter the height for the cuboid:");
      cuboidHeight = Float.parseFloat(keyboard.nextLine());
    }

    System.out.println("Enter the depth for the cuboid:");
    cuboidDepth = Float.parseFloat(keyboard.nextLine());

    while (cuboidDepth <= 0) {
      System.out.println("Invalid number entered, you must enter a number greater than 0.");
      System.out.println("Enter the depth for the cuboid:");
      cuboidDepth = Float.parseFloat(keyboard.nextLine());
    }

    // Closes the scanner object.
    keyboard.close();

    // Create an instance of each Shape Object.
    Cylinder cylinder1 = new Cylinder(cylinderRadius, cylinderHeight);
    Sphere sphere1 = new Sphere(sphereRadius);
    Cuboid cuboid1 = new Cuboid(cuboidWidth, cuboidHeight, cuboidDepth);

    // Calls the render() from each Shape object to display
    // a dimensions message.
    cylinder1.render();
    sphere1.render();
    cuboid1.render();
  }
}