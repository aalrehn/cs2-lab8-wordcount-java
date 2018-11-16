package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
     WordCounter wordCounter = new WordCounter(new HashMap<>());
    // 2. use this to count the words in the input
     wordCounter.countWords(input);
    // 3. determine the size of the resulting map
    int size = wordCounter.getCounts().size();
    // 4. create an ArrayList of that size and
    ArrayList<Map.Entry<String, Integer>> arrayList = new ArrayList<>(size);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    arrayList.addAll(wordCounter.getCounts().entrySet());
    // 6. sort the ArrayList in descending order by count
    
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
     Collections.sort(arrayList, new DescendingByCount());
    // 7. print the (up to) ten most frequent words in the text
     Map.Entry<String, Integer> entry;
    for(int i = 0;i<10 && i<arrayList.size();i++){
      entry = arrayList.get(i);
      System.out.println(entry.getKey()+"="+entry.getValue());

  }
}
}