

# Problem Statement

---

## 💬 Design Rate limiter 

> "Design a rate limiter that supports different algorithms like Token Bucket and Leaky Bucket. It should be able to track users and allow or deny requests accordingly. The system should be extensible, thread-safe, and performant."

---

##  Requirements

- Allow/Deny a request based on a user's activity.
- Track requests per `userId` (or client).
- Implement at least two rate limiting algorithms:
  - Leaky Bucket
  - Token Bucket
- Allow adding new algorithms in the future using **Strategy Pattern**.
- Show simulation/demo for each strategy.



