package javapackage;

public class Circle {
	
	
    // Data member
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0; // Default radius value
    }

    // Constructor with radius as argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius (optional)
    public double getRadius() {
        return radius;
    }

    // Main method to demonstrate the use of the Circle class
    public static void main(String[] args) {
        // Using the no-argument constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 (default radius):");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Circumference: " + circle1.calculateCircumference());

        // Using the constructor with radius argument
        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 (radius = 5.0):");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
}
