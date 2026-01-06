class Cylinder {
    private double radius;
    private double height;

    // --- Question 3 ka Solution (Constructor) ---
    // Constructor jo radius aur height ko initialize karta hai
    public Cylinder(double r, double h) {
        // Parameter se aayi value (r) ko class ke variable (this.radius) mein set kiya
        this.radius = r; 
        // Parameter se aayi value (h) ko class ke variable (this.height) mein set kiya
        this.height = h;
    }

    // --- Getters (Question 1 se) ---
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
    
    // --- Calculation Methods (Question 2 se) ---
    public double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class ps3 {
    public static void main(String[] args) {
        
        // 1. Constructor ko call kiya aur values (10, 20) pass ki
        Cylinder p = new Cylinder(20, 30); // r=10, h=20 set ho gaye
        
        // 2. Private variables ko Getters se access kiya
        System.out.println("Radius is: " + p.getRadius());
        System.out.println("Height is: " + p.getHeight());

        // 3. Calculation check ki
        System.out.println("Surface Area is: " + p.getSurfaceArea());
        System.out.println("Volume is: " + p.getVolume());
    }
}