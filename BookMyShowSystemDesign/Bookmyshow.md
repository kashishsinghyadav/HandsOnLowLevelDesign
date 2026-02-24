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

## ✨ Optional Enhancements
- Notifications on booking confirmation (email/SMS simulation).
- Different pricing for different seat types.
- Admin can remove or modify a show.
- Handle **cancellation** and **refunds**.
- Loyalty points or offers for frequent users.
- Allow seat selection via seat maps.

---



---

# 📈 Example User Journey
> - User opens app → Sees movie list → Picks movie → Picks theater → Picks showtime → Picks seats → Pays → Gets confirmation!

---
