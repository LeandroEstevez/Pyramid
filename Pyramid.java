/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidcalculator;

/**
 * Create a pyramid and manipulate its properties.
 * @author leandroestevez
 */
public class Pyramid {
    
    private double baseWidth;
    private double height;
    
    /**
     * Constructs a default pyramid.
     */
    public Pyramid() {
        
        baseWidth = 50;
        height = 100;
        
    }
    
    /**
     * Constructs a pyramid with a specific width and height.
     * @param baseWidth width of the base.
     * @param height height of the pyramid.
     */
    public Pyramid(double baseWidth, double height) {
        
        this.baseWidth = baseWidth;
        this.height = height;
        
    }
    
    /**
     * Calculates the volume of the pyramid.
     * @return the volume of the pyramid.
     */
    public double volume() {
        
        double volume;
        
        volume = (Math.pow(baseWidth, 2) * height)/3;
        
        return volume;
        
    }
    
    /**
     * Calculates the surface area of the pyramid.
     * @return the surface area of the pyramid.
     */
    public double surfaceArea() {
        
        double surfaceArea;
        
        surfaceArea = 2 * baseWidth * calculateS() + Math.pow(baseWidth, 2);
        
        return surfaceArea;
        
    }
    
    /**
     * Calculates the S of the pyramid.
     * @return the S of the pyramid.
     */
    private double calculateS() {
        
        double s = Math.sqrt(Math.pow(baseWidth/2, 2) + Math.pow(height, 2));
        
        return s;
        
    }
    
    /**
     * Sets the base width of the pyramid.
     * @param baseWidth base width of the pyramid.
     */
    public void setBaseWidth(double baseWidth) {
        
        this.baseWidth = baseWidth;
        
    }
    
    /**
     * Sets the height of the pyramid.
     * @param height height of the pyramid.
     */
    public void setHeight(double height) {
        
        this.height = height;
        
    }
    
    /**
     * Gets the base width of the pyramid.
     * @return the base width of the pyramid
     */
    public double getBaseWidth() {
        
        return baseWidth;
        
    }
    
    /**
     * Gets the height of the pyramid.
     * @return the height of the pyramid
     */
    public double getHeight() {
        
        return height;
        
    }
    
}
