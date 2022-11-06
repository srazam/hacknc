package src;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comparer {
  BufferedReader br;
  BufferedReader br2;

  public Comparer(String path, String path2) throws FileNotFoundException {
    br = new BufferedReader(new FileReader(new File(path)));
    br2 = new BufferedReader(new FileReader(new File(path2)));
  }

  public void compare() throws IOException {
    String str;
    String str2;
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    int highest = 0;
    String last = "";

    while (!(str = br.readLine()).equals("-")) {
      list1.add(str);
    }
    while (!(str2 = br.readLine()).equals("-")) {
      list2.add(str2);
    }
    for (String s : list1) {
      for (String s2 : list2) {
        if (s.equals(s2)) {
          if (map.containsKey(s)) {
            Integer integer = map.get(s);
            map.put(s, integer + 1);
          } else {
            map.put(s, 1);
          }
        }
      }
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() >= highest) {
        highest = entry.getValue();
        last = entry.getKey();
      }
    }
    System.out.println("Matched food idea(s): ");
    for  (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == highest) {
        if (entry.getKey().equals(last)) {
          System.out.print("and " + entry.getKey());
        } else {
          System.out.print(entry.getKey() + ", ");
        }
      }
    }
    //activities
    str = "";
    str2 = "";
    list1.clear();
    list2.clear();
    map.clear();
    highest = 0;
    last = "";

    while ((str = br.readLine()) != null) {
      list1.add(str);
    }
    while ((str2 = br.readLine()) != null) {
      list2.add(str2);
    }
    for (String s : list1) {
      for (String s2 : list2) {
        if (s.equals(s2)) {
          if (map.containsKey(s)) {
            Integer integer = map.get(s);
            map.put(s, integer + 1);
          } else {
            map.put(s, 1);
          }
        }
      }
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() >= highest) {
        highest = entry.getValue();
        last = entry.getKey();
      }
    }
    System.out.println("Matched activity idea(s): ");
    for  (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() == highest) {
        if (entry.getKey().equals(last)) {
          System.out.print("and " + entry.getKey());
        } else {
          System.out.print(entry.getKey() + ", ");
        }
      }
    }

  }
}
