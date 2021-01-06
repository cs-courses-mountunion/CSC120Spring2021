/*
 * Product.java
 */

import java.awt.*;

public class Product {
    
    private int stockNumber;
    private String name;
    private boolean taxable;
    private double price;
    private Color productColor;
    private int over;
    private int down;
    
    public Product(int sn, String n, boolean t, double p, Color prodColor) {
        stockNumber = sn;
        name = n;
        taxable = t;
        price = p;
        productColor = prodColor;
        setRandomOverAndDown();
    } // end of constructor
    
    public Product(String n) {
        stockNumber = (int) (500 * Math.random()) + 100;
        name = n;
        taxable = true;
        price = 4.44;
        productColor = Color.ORANGE;
        setRandomOverAndDown();
    } // end of constructor
    
    public Product() {
        stockNumber = (int) (500 * Math.random()) + 100;
        name = "Something";
        taxable = false;
        price = 9.50;
        productColor = Color.BLUE;
        setRandomOverAndDown();
    } // end of constructor

    public void setRandomOverAndDown() {
        over = (int) (200 * Math.random());
        down = (int) (380 * Math.random());
    } // end of setRandomOverAndDown()
    
    public int getStockNumber() {
        return stockNumber;
    } // end of getStockNumber()
    
    public String getName() {
        return name;
    } // end of getName()
    
    public boolean getTaxable() {
        return taxable;
    } // end of getTaxable()
    
    public double getPrice() {
        return price;
    } // end of getPrice()
    
    public Color getProductColor() {
        return productColor;
    } // end of getProductColor()
    
    public void setName(String n) {
        name = n;
    } // end of setName()
    
    public void setProductColor(Color prodColor) {
        productColor = prodColor;
    } // end of setProductColor()
    
    public void draw(Graphics g) {
        g.drawString(toString(), over, down);
    } // end of draw()
    
    public String toString() {
        String temp;
        temp = "sku=" + stockNumber + " name=" + name;
        temp = temp + " taxable=" + taxable + " price: " + price;
        temp = temp + " color=" + productColor;
        return temp;
    } // end of toString()
    
} // end of class Product
