package problems;

public class StringCompression {
  public static void main(String[] args) {
    String input = "aaabbbbbccddddwwwwwffff";
    String expected = "a3b5c2d4w5f4";
    String computedString = compressString(input);
    System.out.println(computedString);
    System.out.println(computedString.equals(expected) ? "Pass": "Fail");
  }

  public static String compressString(String s) {
    if(s.isBlank()) {
      return null;
    }

    StringBuilder sb = new StringBuilder();

    int count = 1;
    for(int i = 0; i < s.length();i++) {
      if((i+1) < s.length() && s.charAt(i) == s.charAt(i+1)) {
        count++;
      } else {
        sb.append(s.charAt(i)).append(count);
        count = 1;
      }
    }
    return sb.toString();
  }

  /*public static String compressString(String s) {
    StringBuilder sb = new StringBuilder();
    Map<Character, Integer> freq = new LinkedHashMap<>();
    for(char c: s.toCharArray()){
      if(freq.containsKey(c)){
        freq.put(c, freq.get(c)+1);
      }else {
        freq.put(c, 1);
      }
    }
    freq.entrySet().stream().forEach(e -> sb.append(e.getKey().toString()+e.getValue()));
    return sb.toString();
  }*/
}
