package org.deepu.example;

import java.util.Arrays;

public class Solution {
  public static String find(String[] words, String note) {
    return Arrays.stream(words).filter(word -> isWordPresent(word, note)).findFirst().orElse("-");
  }

  private static boolean isWordPresent(String word, String note) {
    int[] wordMap = new int[256];
    word.chars().forEach(c -> wordMap[c]++);
    return note.chars().filter(c -> wordMap[c] > 0 && wordMap[c]-- > 0).count() == word.length();
  }
}
