package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation

    // try {
    // File lesmisrables = new File("LEMIS.txt");
    // BufferedReader reader = new BufferedReader(new FileReader(lesmisrables));
    // final Scanner input = new Scanner(reader).useDelimiter("[^\\p{Alnum}]+");
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    Map<String, Integer> userInput = new HashMap<>();

    List<String> words = new ArrayList<String>();
    while (input.hasNext()) {
      String word = input.next();

      if (word != null) {
        words.add(word);
      }
    }
    WordCounter wordCounter = new WordCounter(userInput);
    // 2. use this to count the words in the input

    wordCounter.countWords(words.listIterator());
    // 3. determine the size of the resulting map

    // 4. create an ArrayList of that size and
    Iterator<Map.Entry<String, Integer>> mapIterator =
        wordCounter.getCounts().entrySet().iterator();
    Iterator<String> testIter = words.listIterator();
    Map.Entry<String, Integer>[] arrayList = new Map.Entry[wordCounter.getCounts().size()];
    int count = 0;
    while (mapIterator.hasNext()) {

      arrayList[count] = mapIterator.next();
      count++;
    }
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    System.out.println(arrayList);
    // 6. sort the ArrayList in descending order by count
    //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
    Arrays.sort(arrayList, new DescendingByCount());
    // 7. print the (up to) ten most frequent words in the text
    for (int i = 0; i < 10 || i < arrayList.length; i++) {
      System.out.println(arrayList[i]);
    }
    // The commented code was the code used to find the 10 most used words
    // } //catch (FileNotFoundException e) {
    // System.out.println("file not found");
    // final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    // }
  }
}
