/* ToDo: import standard java libraries you need e.g. java.io, java.utils, ... */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MonsterLoader {
  // --------------------------------------------------------------- //
  /**
   * Load the monsters from the given file. If something is wrong with a monster, it is not loaded.
   * The loading process continues with the next monster.
   */
  public static List<Monster> loadMonsterFile(String file_path) {
    List<Monster> monsters = new ArrayList<>();
    
    try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
      String line;
      String name = null;
      Integer maxHP = null;
      Integer attack = null;
      Float weight = null;
      Float multi = null;
      boolean isMonster = false;
      int expectedField = 0; // 0: name, 1: maxHP, 2: attack, 3: weight, 4: multi
      
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        
        if (line.equalsIgnoreCase("monster")) {
          // If we have a complete monster, add it to the list
          if (isMonster && name != null && maxHP != null && attack != null && weight != null && multi != null) {
            try {
              monsters.add(new Monster(name, maxHP, weight, attack, multi));
            } catch (Exception e) {
              // Skip invalid monster
            }
          }
          // Reset all values for the new monster
          name = null;
          maxHP = null;
          attack = null;
          weight = null;
          multi = null;
          isMonster = true;
          expectedField = 0;
          continue;
        }
        
        if (!isMonster) continue;
        
        String[] parts = line.split("\\s+", 2);
        if (parts.length != 2) continue;
        
        String key = parts[0].toLowerCase();
        String value = parts[1].trim();
        
        // Check if the field is in the correct order
        boolean isValidField = false;
        switch (expectedField) {
          case 0:
            isValidField = key.equals("name");
            break;
          case 1:
            isValidField = key.equals("maxhp");
            break;
          case 2:
            isValidField = key.equals("attack");
            break;
          case 3:
            isValidField = key.equals("weight");
            break;
          case 4:
            isValidField = key.equals("multi");
            break;
        }
        
        if (!isValidField) continue;
        
        try {
          switch (key) {
            case "name":
              name = value;
              break;
            case "maxhp":
              maxHP = Integer.parseInt(value);
              break;
            case "attack":
              attack = Integer.parseInt(value);
              break;
            case "weight":
              weight = Float.parseFloat(value);
              break;
            case "multi":
              multi = Float.parseFloat(value);
              break;
          }
          expectedField++;
        } catch (NumberFormatException e) {
          // Skip invalid number format
        }
      }
      
      // Check if we have a complete monster at the end of the file
      if (isMonster && name != null && maxHP != null && attack != null && weight != null && multi != null) {
        try {
          monsters.add(new Monster(name, maxHP, weight, attack, multi));
        } catch (Exception e) {
          // Skip invalid monster
        }
      }
      
    } catch (IOException e) {
      // Return empty list on any IO exception
      return new ArrayList<>();
    }
    
    return monsters;
  }

  // --------------------------------------------------------------- //
  public static void main(String[] args) {
    // Test with the provided files
    List<Monster> okMonsters = loadMonsterFile("monster_ok.txt");
    System.out.println("Successfully loaded monsters from monster_ok.txt:");
    for (Monster monster : okMonsters) {
      System.out.println(monster);
    }
    
    List<Monster> failMonsters = loadMonsterFile("monster_fail.txt");
    System.out.println("\nSuccessfully loaded monsters from monster_fail.txt:");
    for (Monster monster : failMonsters) {
      System.out.println(monster);
    }
  }
}