# 🎬 BookMyShow LLD - Problem Statement

## 🎯 Objective
Design a simplified **BookMyShow-like system** that allows users to:
- Browse movies
- Select theaters
- Check available seats
- Book and pay for tickets
- Admins can manage movies, theaters, screens, and shows.

---

## 🧩 Requirements

### 1. User functionalities
- Users can **browse** all available movies.
- Users can **select** a movie and **choose** a theater.
- Users can **view show timings** for a movie in a theater.
- Users can **see available seats** for a particular show.
- Users can **book one or more seats**.
- Users **must pay** after selecting seats.
- After successful payment, users receive a **booking confirmation**.

---

### 2. Admin functionalities
- Admins can **add new movies**.
- Admins can **add new theaters**.
- Admins can **add screens** to theaters.
- Admins can **add shows** to a screen (movie, time, seats).

---

### 3. System features
- **Theaters** can have **multiple screens**.
- **Each screen** can have **multiple shows** per day.
- **Each show** has:
  - A movie
  - Start time
  - A set of seats
- **Seat categories**:
  - Regular
  - Premium
  - VIP
- **Real-time seat locking**:
  - Lock seats temporarily during the payment process.
  - If payment fails or times out, **unlock seats**.
- **Payment handling**:
  - Simulate basic payment success/failure.
- **Basic concurrency** handling:
  - Two users trying to book the same seat should be handled correctly.

---

## 🛠️ Design Constraints
- Focus mainly on **core movie booking flow**.
- Implement using **clean OOP design** principles.
- Use design patterns like **Factory**, **Facade**, or **Observer** where suitable.
- Assume **in-memory storage** (no need for real databases).
- Skip complex authentication (assume users are logged in).

---

## ✨ Optional Enhancements
- Notifications on booking confirmation (email/SMS simulation).
- Different pricing for different seat types.
- Admin can remove or modify a show.
- Handle **cancellation** and **refunds**.
- Loyalty points or offers for frequent users.
- Allow seat selection via seat maps.

---

## 📦 Suggested Core Classes

| Class | Responsibility |
|:------|:----------------|
| User | Browse, select, book, and pay for tickets |
| Admin | Add movies, theaters, screens, and shows |
| Movie | Holds movie details (name, duration, etc.) |
| Theater | Location, list of screens |
| Screen | Physical screen in a theater |
| Show | Represents a movie playing on a screen at a specific time |
| Seat | Details about a single seat (type, status) |
| Booking | Represents the booking made by a user |
| Payment | Handles payment simulation |

---

## 🔥 Deliverables
- Class Diagram (UML)
- Full Code (OOP structure)
- Basic flow for movie selection → seat booking → payment → booking confirmation
- (Optional) Advanced features like notifications and cancellation

---

## 🧠 Design Patterns Suggestions
- **Factory Pattern**: Create different types of Seats or Movies.
- **Facade Pattern**: Provide a simple interface to users for browsing, booking, paying.
- **Observer Pattern**: Notify users on booking confirmation or upcoming shows.
- **Strategy Pattern**: If supporting multiple payment methods dynamically.

---

## 📑 Important Notes
- Keep code **modular and clean**.
- Focus on **extensibility** (easy to add new features).
- Handle basic **edge cases** (seat already booked, payment failure).

---

# 📈 Example User Journey
> - User opens app → Sees movie list → Picks movie → Picks theater → Picks showtime → Picks seats → Pays → Gets confirmation!

---
