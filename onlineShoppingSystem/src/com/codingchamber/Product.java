package com.codingchamber;

// Define a class named "Product" which other classes inherit/take from
public class Product{

  // Private variables used to restrict access of product attributes
  private String name; // Name of the Product - string to accommodate characters and words
  private double price; // Price of the Product - double to accommodate integers with decimals
  
  // Constructs the value of each variable in one method - constructors 
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }
  
  // A method to fetch the name - getter
  public String getName() {
    return name;
  }
  public void setName(String name) { // A method to set the name - setter
    this.name = name;
  }
  
  public void setPrice (double price) { // A method to set the price - setter
    this.price = price;
  }

  // A method to fetch the price - getter
  public double getPrice() {
    return price;
  }
  
  public static void main (String [] args) {
    Product product = new Product("John", 2.15);
    product.getName();
    product.setName("Joanne");
  }
}
