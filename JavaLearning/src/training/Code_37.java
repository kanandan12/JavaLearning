package training;

import java.util.HashMap;
import java.util.Map;

public class Code_37 {
  private Map<String,Integer> map;

  public Code_37() {
    map = new HashMap<>();
    map.put("foo", 1);
    map.put("bar", 3);
  }

  public int getValue(String input, int numRetries) throws Exception {
    try {
      return map.get(input);
    }
    catch (Exception e) {
      if (numRetries > 3) {
        throw e;
      }
      return getValue(input, numRetries + 1);
    }
  }
}
