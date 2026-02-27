# 🔐 Password Generator & Manager
A robust Java-based password generator that creates secure, customizable passwords and manages them locally in memory. Take control of your password security! 🛡️

## ✨ Features
🔑 Password Generation
Customizable character sets:

🔠 Uppercase letters (A-Z)

🔡 Lowercase letters (a-z)

🔢 Digits (0-9)

💫 Special symbols (!@#$%^&*()-_=+[]{}|;:,.<>?)

Flexible length: Generate passwords between 6-80 characters

Strong randomization: Uses SecureRandom for cryptographically secure generation

## 📊 Password Strength Checker
Automatically evaluates generated passwords

Three strength levels:

 Weak - Needs improvement

 Moderate - Decent but could be stronger

 Strong - Excellent security!

## 💾 Password Management
📝 Save passwords with associated application names

👀 View all saved passwords

🔄 Update existing passwords

🗑️ Delete passwords by application name

⚡ In-memory storage using HashMap

## 🚀 How to Use
Run the application

Choose from the menu:

1️⃣ Generate a new password

2️⃣ View all saved passwords

3️⃣ Delete a saved password

4️⃣ Exit

📋 Generating a Password

Enter desired password length (6-80 characters)

Specify character types (e.g., "ULDS" for all types)

View your generated password and its strength

Choose to save or discard

If saving, provide an application name


## 📁 Code Structure

📦 Password Generator

├── 🎮 App.java   # Main program loop & user interface

├── ⚙️ Generator.java   # Password generation & strength checking

└── 💿 Saved.java       # Password storage management

## 🛠️ Technical Details

 Language: Java ☕

Security: SecureRandom for cryptographic strength

Storage: HashMap (in-memory, temporary)
 
 
