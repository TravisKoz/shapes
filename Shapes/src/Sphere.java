import javax.swing.*;

// Class that Sphere objects are derived from.
public class Sphere extends Shape {

  // Attributes
  private float radius = 0;

  // Constructor
  public Sphere(float radius) {
    setRadius(radius);
  }

  // Getters and setters
  public float getRadius() {
    return radius;
  }

  private void setRadius(float radius) {
    this.radius = radius;
  }

  // Method to calculate the surface area of a sphere.
  @Override
  public float surfaceArea() {
    return (float) (4.0 * Math.PI * Math.pow(getRadius(), 2.0));
  }

  // Method to calculate the volume of a sphere.
  @Override
  public float volume() {
    return (float) ((4.0 / 3.0) * Math.PI * (getRadius() * getRadius() * getRadius()));
  }

  // Method that displays a dimensions message.
  @Override
  public void render() {
    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Sphere Dimensions\n"
        + "___________________________________\n"
        + "Radius: " + getRadius() + "\n"
        + "Surface Area: " + surfaceArea() + "\n"
        + "Volume: " + volume() + "\n");
  }
}
