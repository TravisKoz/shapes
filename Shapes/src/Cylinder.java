import javax.swing.*;

// Class that Cylinder objects are derived from.
public class Cylinder extends Shape {

  // Attributes
  private float radius = 0;
  private float height = 0;

  // Constructor
  public Cylinder(float radius, float height) {
    setRadius(radius);
    setHeight(height);
  }

  // Getters and Setters.
  public double getRadius() {
    return radius;
  }

  private void setRadius(float radius) {
    this.radius = radius;
  }

  public float getHeight() {
    return height;
  }

  private void setHeight(float height) {
    this.height = height;
  }

  // Method to calculate the surface area of a cylinder.
  @Override
  public float surfaceArea() {
    return (float) (2.0 * Math.PI * getRadius() * getHeight() + 2.0 * Math.PI * (Math.pow(getRadius(), 2)));
  }

  // Method to calculate the Volume of a cylinder.
  @Override
  public float volume() {
    return (float) (Math.PI * (Math.pow(getRadius(), 2) * getHeight()));
  }

  // Method to display a dimensions message.
  @Override
  public void render() {
    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Cylinder Dimensions\n"
        + "___________________________________\n"
        + "Radius: " + getRadius() + "\n"
        + "Height: " + getHeight() + "\n"
        + "Surface Area: " + surfaceArea() + "\n"
        + "Volume: " + volume() + "\n");
  }
}