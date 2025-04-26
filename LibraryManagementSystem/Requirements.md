# Library Management System (LLD)

## 🚀 Problem Statement

Design and implement a **Library Management System** with the following requirements:

### Core Functional Requirements

1. Students can **issue** and **return** books.
2. A `LibraryManager` is responsible for managing:
   - Book issuing and returning
   - Fine calculation if books are returned late
3. If a book is **returned after 3 days**, a fine is calculated (e.g., ₹10 per extra day).
4. Track:
   - Which **student** issued which **book**
   - When the book was issued
   - The quantity of books currently available


- Track **individual copies** of books by unique copy IDs.
- Helps in issuing the same book title to multiple users simultaneously. 
- Limit the number of books a student can issue (e.g., max 3 books).
- Block new issues until the student returns at least one book.
- Notify students when the book is nearing the due date.
- Use the **Observer Pattern** or a Scheduler system to simulate this.
- Store history of all transactions: who issued what and when.
- Calculate total fine accumulated by a student over time.



##  Sample Use Cases

1. Student `A` tries to issue a book `B101`:
   - If available, issue is successful.
   - Quantity of book is decreased by 1.
   - Time of issue is recorded.
2. Student returns book after 5 days:
   - Fine of ₹20 is applied (2 extra days * ₹10).
   - Book quantity increases by 1.
3. Another student tries to issue the same book:
   - If copies are available, it's allowed.

---

## 📉 UML Diagram (Core Design)

![image](https://github.com/user-attachments/assets/8ed3f9ee-9df4-4a61-a3fc-bfe37817dff5)


---




