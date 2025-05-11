# Exercise 7: Monster Loader

## Overview
This exercise implements a file loader for monster data with error handling capabilities. The program reads monster data from text files and creates Monster objects while handling various error cases.

## Implementation Details

### Files
- `IMonster.java`: Interface defining monster behavior
- `Monster.java`: Implementation of the monster class
- `MonsterLoader.java`: Main class for loading monsters from files
- `monster_ok.txt`: Test file with valid monster data
- `monster_fail.txt`: Test file with invalid monster data

### Key Features
1. **File Reading**
   - Reads monster data line by line
   - Handles file I/O exceptions
   - Returns empty list on any errors

2. **Data Validation**
   - Validates monster format (5 values in correct order)
   - Checks for proper data types
   - Skips invalid monsters

3. **Error Handling**
   - Invalid number formats
   - Missing values
   - Wrong order of values
   - IO exceptions
   - Malformed input

### Monster Format
```
monster
name #name of the monster#
maxHP #maximum value for health points#
attack #initial attack value#
weight #weight in kg#
multi #multiplier for attack#
```

### How to Run
1. Compile the files:
```bash
javac IMonster.java Monster.java MonsterLoader.java
```

2. Run the program:
```bash
java MonsterLoader
```

### Example Output
The program will display successfully loaded monsters from both test files:
- `monster_ok.txt`: Contains valid monster data
- `monster_fail.txt`: Contains both valid and invalid monster data

### Implementation Notes
- Monsters are loaded in the same order as they appear in the file
- Invalid monsters are skipped without affecting the loading of valid ones
- All exceptions are caught and handled appropriately
- The program maintains data integrity by validating all input 