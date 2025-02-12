

# 📱 Mobile SIM Management Using Reflection API

## 📌 Project Overview

This Java-based project simulates a **mobile device** that can dynamically switch between different **SIM cards** (Airtel, Jio, VI) using **Reflection API**. It provides functionalities such as **recharge, checking balance, making calls, and sending SMS**, all handled dynamically at runtime.

## 🛠️ Features

- **Dynamically Load SIM Classes**: Uses **Reflection API** to instantiate SIM objects based on user input.
- **Multiple SIM Support**: Works with **Airtel, Jio, and VI**.
- **Essential Mobile Features**:
  - Recharge balance
  - Check current balance
  - Make calls
  - Send SMS
- **Loose Coupling**: `Mobile` class does not directly depend on specific SIM implementations, improving flexibility.

## 📂 Project Structure

| File Name              | Description |
|------------------------|-------------|
| **Sim.java**           | Interface defining methods for SIM operations. |
| **Airtel.java**        | Implementation of `Sim` interface for Airtel. |
| **Jio.java**           | Implementation of `Sim` interface for Jio. |
| **VI.java**            | Implementation of `Sim` interface for VI. |
| **Mobile.java**        | Handles SIM insertion, recharges, calls, and SMS. |
| **Mobile_Screen.java** | Main program that takes user input and manages SIM operations. |

## 🚀 How to Run

1. **Compile all Java files**:
   ```sh
   javac *.java
   ```
2. **Run the main class**:
   ```sh
   java Mobile_Screen
   ```
3. **Follow the on-screen instructions** to insert a SIM and perform actions like recharge, call, or SMS.

## 🎯 Example Interaction

```
Insert Sim: Jio
Sim activated

Choose your Option
1. Recharge
2. Current Balance
3. Call
4. SMS
5. Close

Enter amount to Recharge: 100
Jio recharge successful

Your balance is: 100.0

Enter number to call: 9876543210
Your call is busy.

Enter number and message: 9876543210 "Hello!"
Jio: SMS sent.
```

## 🏗️ Technologies Used

- **Java**
- **Reflection API**
- **Object-Oriented Programming (OOP)**

---

Would you like any modifications or enhancements to this? 🚀
