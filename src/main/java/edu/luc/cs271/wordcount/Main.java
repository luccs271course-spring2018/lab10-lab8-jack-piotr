package edu.luc.cs271.wordcount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URL;
import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation

    try {
      File lesmisrables = new File("C:\\Users\\Vector\\IdeaProjects\\lab10-lab8-jack-piotr\\src\\main\\java\\edu\\luc\\cs271\\wordcount\\LEMIS.txt");
      BufferedReader reader = new BufferedReader(new FileReader(lesmisrables));
      final Scanner input = new Scanner(reader).useDelimiter("[^\\p{Alnum}]+");


      // TODO complete this main program
      // 1. create a WordCounter instance
      Map<String, Integer> userInput = new HashMap<>();

      List<String> words = new ArrayList<String>();
      while (input.hasNext()) {
        String word = input.next();

        if (word != null) {
          words.add(word);
          userInput.put(word,0);
        }
      }
      WordCounter wordCounter = new WordCounter(userInput);
      // 2. use this to count the words in the input

      wordCounter.countWords(words.listIterator());
      // 3. determine the size of the resulting map

      // 4. create an ArrayList of that size and
      int size = wordCounter.getCounts().size();
      List<Map.Entry<String,Integer>> arrayList = new ArrayList<>(size);
      for (Map.Entry<String, Integer> add : userInput.entrySet()) {
        arrayList.add(add);
      }
      // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
      System.out.println(arrayList);
      // 6. sort the ArrayList in descending order by count
      //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
      Collections.sort(arrayList, new DescendingByCount());
      // 7. print the (up to) ten most frequent words in the text
      System.out.println(arrayList.subList(0,10));
    }catch (FileNotFoundException e){
        System.out.println("file not found");
        final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
      }
  }
}
