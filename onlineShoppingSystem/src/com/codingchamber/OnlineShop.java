package com.codingchamber;

public class OnlineShop { 
  
  // Main class of the program to test the functions
  public static void main(String[] args) {

    // Create products with different values - Used for testing
    Product product1 = new Product("product1", 10);
    Product product2 = new Product("product2", 8);
    Product product3 = new Product("product3", 6);
    Product product4 = new Product("product4", 4);

    Cart cart = new Cart(); // Create a new cart to add products to
    
    // Add initialised products to the cart
    cart.addItem(product1);
    cart.addItem(product2);
    cart.addItem(product3);
    cart.addItem(product4);

    // Remove one product from the cart
    cart.removeItem(product2);
    
    // Print the total price of all of the products
    System.out.println(cart.calculateTotalPrice());
    
    User user = new User("Rakhin Amin"); // Create new user object and assign name
    user.getCart().addItem(product1);
    System.out.println(user.getUsername()); // Print new user name to test if it works
    
  }

}
