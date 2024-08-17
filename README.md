# E-Waste_Management_System
### E-Waste Monitoring System

---

#### **Overview**
This project is a simple Java-based E-Waste Monitoring System that tracks and categorizes electronic waste (e-waste). It helps in identifying recyclable items and promotes responsible e-waste management, aligning with sustainable development goals.

---

#### **Features**
- Add electronic waste items with details like item name, category, and recyclability.
- Display all added e-waste items.
- Filter and display only recyclable e-waste items.
- User input option to add more e-waste items interactively.

---

#### **How to Run**
1. Clone or download the project to your local environment.
2. Compile the code:
   ```
   javac Main.java
   ```
3. Run the compiled code:
   ```
   java Main
   ```

4. The system will automatically display some pre-added e-waste items. You will then be prompted to add additional items interactively.

---

#### **Project Structure**
- **EWaste Class**: Represents individual e-waste items with attributes such as name, category, and recyclability.
- **EWasteMonitoringSystem Class**: Handles the management of e-waste items, including adding, displaying, and filtering.
- **Main Class**: Contains the core logic and user interaction for running the system.

---

#### **Usage**
1. The program begins by displaying pre-added e-waste items and whether they are recyclable.
2. The system then asks if the user wants to add more items.
3. The user can enter the item name, category, and whether the item is recyclable.
4. The updated list of e-waste items is displayed once user input is complete.

---

#### **Example Output**
```
E-Waste Items:
Item: Old Laptop | Category: Electronics | Recyclable: Yes
Item: CRT Monitor | Category: Electronics | Recyclable: No
Item: Smartphone | Category: Electronics | Recyclable: Yes

Recyclable E-Waste Items:
Item: Old Laptop | Category: Electronics | Recyclable: Yes
Item: Smartphone | Category: Electronics | Recyclable: Yes

Do you want to add more e-waste items? (yes/no)
```

---

#### **Future Enhancements**
- Integrate a database to store e-waste data permanently.
- Add more detailed categorization and attributes like brand, year of purchase, etc.
- Implement a graphical user interface (GUI) for easier interaction.

---

#### **Requirements**
- Java Development Kit (JDK) 8 or above.

---

Enjoy tracking and managing your e-waste responsibly!
