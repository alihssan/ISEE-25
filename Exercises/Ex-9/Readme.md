# Car Dealership Management System - UML Specification

This repository outlines the UML class design for a Car Dealership Management System, including entities such as `Filiale`, `Employee`, `Customer`, `Seller`, `Mechanic`, and `Car`.

---

## 📦 Class Definitions

### 1. **Filiale**
Represents a car dealership branch.

| Field          | Type        | Description                      |
|----------------|-------------|----------------------------------|
| id             | Integer     | Unique identifier for the branch |
| name           | String      | Name of the branch               |
| location       | String      | Address or location of the branch|
| phoneNumber    | String      | Contact number                   |

**Relationships**:
- Aggregates multiple `Employee` and `Customer` entities.

---

### 2. **Employee** (Abstract)
Represents general employee information.

| Field          | Type        | Description                      |
|----------------|-------------|----------------------------------|
| employeeId     | Integer     | Unique identifier                |
| name           | String      | Full name                        |
| hireDate       | Date        | Date of joining                  |
| salary         | Double      | Monthly salary                   |

**Inheritance**:
- Parent of `Seller` and `Mechanic`.

---

### 3. **Seller** (Extends Employee)
Handles car sales and interacts with customers.

| Field          | Type        | Description                      |
|----------------|-------------|----------------------------------|
| salesTarget    | Integer     | Monthly sales target             |
| bonus          | Double      | Performance-based bonus          |

**Relationships**:
- Associated with `Customer` (manages customer sales).

---

### 4. **Mechanic** (Extends Employee)
Responsible for repairing and maintaining vehicles.

| Field           | Type        | Description                      |
|-----------------|-------------|----------------------------------|
| specialization  | String      | Area of expertise (e.g. engines) |
| certifications  | String[]    | List of mechanic certifications  |

**Relationships**:
- Associated with `Car` (repairs cars).

---

### 5. **Customer**
Represents clients who buy or service vehicles.

| Field          | Type        | Description                      |
|----------------|-------------|----------------------------------|
| customerId     | Integer     | Unique identifier                |
| name           | String      | Full name                        |
| email          | String      | Contact email                    |
| phoneNumber    | String      | Contact number                   |

**Relationships**:
- Linked to `Filiale`
- Associated with `Seller`

---

### 6. **Car**
Represents vehicles being sold or serviced.

| Field          | Type        | Description                      |
|----------------|-------------|----------------------------------|
| vin            | String      | Vehicle Identification Number    |
| make           | String      | Manufacturer (e.g., Toyota)      |
| model          | String      | Model name                       |
| year           | Integer     | Year of manufacture              |
| status         | String      | e.g., "available", "sold", "in service" |

**Relationships**:
- Linked to `Mechanic` (for servicing)

---

## 🔗 Relationship Summary

- `Filiale` ↔ `Employee` (Aggregation)
- `Filiale` ↔ `Customer` (Aggregation)
- `Employee` → `Seller`, `Mechanic` (Inheritance)
- `Seller` ↔ `Customer` (Association)
- `Mechanic` ↔ `Car` (Association)

---

## 🛠 Technologies (for Implementation Suggestion)
- UML Tool: Lucidchart, StarUML, or PlantUML
- Languages: Java, Python, or C#
- Database: PostgreSQL or MySQL

---

## 🚀 Future Extensions
- Add `Appointment` or `ServiceRecord` for detailed mechanic tasks.
- Integrate CRM features for customer follow-ups.
- Track sales history and car maintenance logs.

---

