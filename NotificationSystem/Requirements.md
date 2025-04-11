 # Notification System
Design a notification system supporting Email, SMS, and Push Notification using the Composite design pattern.

## Requirements
- Support multiple notification types.
- Easy addition of new channels (e.g., WhatsApp).
- Reuse code via polymorphism.

## Approach
- `INotification`: Interface for all notification types.
- `NotificationContext`: Composite class managing a list of notifications.
- Concrete classes (EmailNotification, SmsNotification, PushNotification): Leaf nodes.

## UML Diagram
![image](https://github.com/user-attachments/assets/015d4fbf-4fe0-4263-980d-561ee053ef97)


## Code
See `NotificationMain.java` for implementation.
