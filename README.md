You are running a classroom and suspect that some of your students are passing around the answer to a multiple-choice question disguised as a random note.

Your task is to write a function that, given a list of words and a note, finds and returns the word in the list that is scrambled inside the note, if any exists. If none exist, it returns the result "-" as a string. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

# Example:  
words = ["baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"]
 
# Test
- note1 = "ctay"
- find(words, note1) => "cat"   (the letters do not have to be in order)

### Test
- note2 = "bcanihjsrrrferet"
- find(words, note2) => "cat"   (the letters do not have to be together)

### Test
* note3 = "tbaykkjlga"
* find(words, note3) => "-"     (the letters cannot be reused)

### Test
* note4 = "bbbblkkjbaby"
* find(words, note4) => "baby"

### Test
* note5 = "dad"
* find(words, note5) => "-"

### Test
* note6 = "breadmaking"
* find(words, note6) => "bird"

### Test
* note7 = "dadaa"
* find(words, note7) => "dada"

### All Test Cases:
* find(words, note1) -> "cat"
* find(words, note2) -> "cat"
* find(words, note3) -> "-"
* find(words, note4) -> "baby"
* find(words, note5) -> "-"
* find(words, note6) -> "bird"
* find(words, note7) -> "dada"

Complexity analysis variables:

W = number of words in `words`  
S = maximal length of each word or of the note
