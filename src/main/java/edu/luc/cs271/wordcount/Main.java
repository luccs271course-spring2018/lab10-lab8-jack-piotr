package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    Map<String, Integer> userInput = new Hashtable<>();

    List<String> words = new ArrayList<String>();
    while(input.hasNext())
    {
      String word = input.next();
      if(word != null) {
        words.add(word);
        userInput.put(word, 0);
      }
    }
    WordCounter wordCounter = new WordCounter(userInput);
    // 2. use this to count the words in the input
    wordCounter.countWords(words.listIterator());
    // 3. determine the size of the resulting map
    System.out.println(wordCounter.getCounts().size());
    // 4. create an ArrayList of that size and
    List<Map<String,Integer>> arrayList = new ArrayList<>();
    arrayList.add(wordCounter.getCounts());
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    System.out.println(arrayList);
    // 6. sort the ArrayList in descending order by count
    //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

  }
}
