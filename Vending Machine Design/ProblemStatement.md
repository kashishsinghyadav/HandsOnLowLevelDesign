# Vending Machine System Design

## Problem Statement

Design a vending machine system that allows users to purchase products by inserting coins and selecting items. The system should support the following functionalities:

- **Product Selection**: Users can choose from a list of available products.
- **Payment Processing**: The machine accepts coins of denominations 1, 5, 10, and 25 cents.
- **Transaction Handling**:
  - Dispenses the selected product upon receiving the correct amount.
  - Returns change if the inserted amount exceeds the product price.
  - Allows users to cancel the transaction and refunds the inserted money.
- **Inventory Management**: Keeps track of product stock levels and prevents transactions if a product is out of stock.
- **Admin Operations**: Enables restocking of products and resetting the machine's inventory.

## Requirements

- Each product has a unique identifier, name, price, and quantity in stock.
- The system should handle scenarios where the machine cannot provide change.
- Ensure that the user interface is intuitive for both customers and administrators.

## Additional Considerations
 
- Implement appropriate error handling for invalid inputs and system failures.
- Design the system to be extensible for future enhancements, such as adding new product categories or payment methods.

 
