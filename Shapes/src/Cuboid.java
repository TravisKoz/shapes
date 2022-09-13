import javax.swing.*;

// Class that Cuboid objects are derived from.
public class Cuboid extends Shape {

  // Attributes
  private float width = 0;
  private float height = 0;
  private float depth = 0;

  // Constructor
  public Cuboid(float width, float height, float depth) {
    setWidth(width);
    setHeight(height);
    setDepth(depth);
  }

  // Getters and Setters
  public float getWidth() {
    return width;
  }

  private void setWidth(float width) {
    this.width = width;
  }

  public float getHeight() {
    return height;
  }

  private void setHeight(float height) {
    this.height = height;
  }

  public float getDepth() {
    return depth;
  }

  private void setDepth(float depth) {
    this.depth = depth;
  }

  // Method to calculate the surface area of a cuboid.
  @Override
  public float surfaceArea() {
    return (float) (2.0 * ((getDepth() * getWidth()) + (getWidth() * getHeight()) + (getDepth() * getHeight())));
  }

  // Method to calculate the volume of a cuboid.
  @Override
  public float volume() {
    return getHeight() * getWidth() * getDepth();
  }

  // Method that displays a dimensions message.
  @Override
  public void render() {
    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Cuboid Dimensions\n"
        + "___________________________________\n"
        + "Width: " + getWidth() + "\n"
        + "Height: " + getHeight() + "\n"
        + "Depth: " + getDepth() + "\n"
        + "Surface Area: " + surfaceArea() + "\n"
        + "Volume: " + volume() + "\n");
  }
}