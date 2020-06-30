/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidcalculator;

/**
 *
 * @author leandroestevez
 */
public class PyramidTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pyramid p = new Pyramid();
        
        p.setBaseWidth(10);
        System.out.println(p.getBaseWidth());
        System.out.println("Expect: 10");
        
        p.setHeight(10);
        System.out.println(p.getHeight());
        System.out.println("Expect: 10");
        
        System.out.println(p.volume());
        System.out.println("Expect: 333.3333");
        
        System.out.println(p.surfaceArea());
        System.out.println("Expect: 323.6067");
        
    }
    
}
