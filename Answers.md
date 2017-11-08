the=33278, of=18013, and=12845, to=12450, a=12449, in=9386, was=7788, that=6601, he=6202, his=5529

Treemap vs hashmap
based on what I have seen in the lab the answer stayed the same and was unable to notice any difference this might be because of how I sort the arraylist but cant be sure.
Overall i think it is the same, however treemap did take a bit longer to complete the tests.

what happens if you invoke `countWords` multiple times for different String iterators?
Each string iterator will go to the exact same map.
What crucial role does the Iterator abstraction play in making `WordCounter` testable?
The iterator is crucial because it lets you add to the map. Otherwise the map will be empty.