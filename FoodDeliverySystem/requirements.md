# LLD Problem Statement - Food Delivery System

## 💬 Problem Statement

Design a food delivery system similar to Swiggy or Zomato.

## 📌 Requirements

- The system should support multiple restaurants.
- Each restaurant offers a list of dishes.
- A user can select a restaurant and order one dish with a configurable quantity.
- Multiple payment methods should be supported (e.g., UPI, Card, Cash on Delivery).
- Once the user places an order:
  - The order status should change accordingly (e.g., Placed → Preparing → Ready → Delivered).
  - A delivery partner should be automatically assigned once the food is ready.
- The user can cancel the order within 2 minutes of placing it:
  - If paid online, only 90% of the amount is refunded.
  - If Cash on Delivery was selected, cancellation does not apply.
- After 2 minutes, cancellation should not be allowed.

