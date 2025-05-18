# Monster Loader
## Exercise 7

---

## Overview
- File loader for monster data
- Robust error handling capabilities
- Reads and processes monster data from text files
- Creates Monster objects with validation

---

## Project Structure
- `IMonster.java` - Interface defining monster behavior
- `Monster.java` - Monster class implementation
- `MonsterLoader.java` - Main loader class
- Test files:
  - `monster_ok.txt` - Valid data
  - `monster_fail.txt` - Invalid data

---

## Key Features

### 1. File Reading
- Line-by-line processing
- Robust I/O exception handling
- Graceful error recovery

### 2. Data Validation
- Format verification (5 values)
- Type checking
- Invalid data skipping

### 3. Error Handling
- Number format validation
- Missing value detection
- Order verification
- I/O exception management
- Input format validation

---

## Monster Data Format
```
monster
name #name of the monster#
maxHP #maximum value for health points#
attack #initial attack value#
weight #weight in kg#
multi #multiplier for attack#
```

---

## Implementation Highlights
- Sequential monster loading
- Graceful error handling
- Data integrity preservation
- Comprehensive input validation

---

## Running the Program
1. Compile:
```bash
javac IMonster.java Monster.java MonsterLoader.java
```

2. Execute:
```bash
java MonsterLoader
```

---

## Thank You!
Questions? 