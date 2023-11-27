import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.deepu.example.Solution.find;

import org.junit.jupiter.api.Test;

public class SolutionTest {

  @Test
  void demoTestMethod() {
    String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"};

    String note1 = "ctay";
    String result = find(words, note1);
    assertThat(result).isEqualTo("cat");

    String note2 = "bcanihjsrrrferet";
    result = find(words, note2);
    assertThat(result).isEqualTo("cat");

    String note3 = "tbaykkjlga";
    result = find(words, note3);
    assertThat(result).isEqualTo("-");

    String note4 = "bbbblkkjbaby";
    result = find(words, note4);
    assertThat(result).isEqualTo("baby");

    String note5 = "dad";
    result = find(words, note5);
    assertThat(result).isEqualTo("-");

    String note6 = "breadmaking";
    result = find(words, note6);
    assertThat(result).isEqualTo("bird");

    String note7 = "dadaa";
    result = find(words, note7);
    assertThat(result).isEqualTo("dada");
  }
}
