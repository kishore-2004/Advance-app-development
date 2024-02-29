// package com.partyplanner.partyplanner.Entity;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;

// import java.util.Date;

// @Entity
// public class PaymentHistory {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @ManyToOne
//     @JoinColumn(name = "user_id", nullable = false)
//     private UserLogin user;

//     @Column(nullable = false)
//     private double amount;

//     @Column(nullable = false)
//     private Date paymentDate;
   
//     @Column(nullable = false)
//     private Date paymentTime;

//     // Constructors, getters, and setters
//     public PaymentHistory() {
//     }

//     public PaymentHistory(UserLogin user, double amount, Date paymentDate , Time paymentTime) {
//         this.user = user;
//         this.amount = amount;
//         this.paymentDate = paymentDate;
//         this.paymentTime = paymentTime;
//     }

//     // Getters and Setters
//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public UserLogin getUser() {
//         return user;
//     }

//     public void setUser(UserLogin user) {
//         this.user = user;
//     }

//     public double getAmount() {
//         return amount;
//     }

//     public void setAmount(double amount) {
//         this.amount = amount;
//     }

//     public Date getPaymentDate() {
//         return paymentDate;
//     }

//     public void setPaymentDate(Date paymentDate) {
//         this.paymentDate = paymentDate;
//     }
//     public Date getPaymentTime() {
//         return paymentTime;
//     }

//     public void setPaymentTIme(Time paymentDate) {
//         this.paymentTime = paymentTime;
//     }

//     // toString method
//     @Override
//     public String toString() {
//         return "PaymentHistory{" +
//                 "id=" + id +
//                 ", user=" + user +
//                 ", amount=" + amount +
//                 ", paymentDate=" + paymentDate +
//                 ", paymentTime=" + paymentTime +
//                 '}';
//     }
// }
