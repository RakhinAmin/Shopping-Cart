package com.codingchamber;

public class User {
  
  private String username; // Name of the user - String used to represent characters and words
  private Cart cart; // User associated shopping cart - composed from cart class
  
  public User(String username) {
    this.username = username;
    this.cart = new Cart(); // Composed from another class
  }
  
  public String getUsername() { // Fetch user-name - Getter
    return username;
  }

  public Cart getCart() { // Fetch Cart method - Getter
    return cart;
  }
}
