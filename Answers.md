the=33278
of=18012
and=12845
a=12449
to=12449
in=9386
was=7788
that=6601
he=6202
his=5529


Try using a TreeMap instead of a HashMap. Does this make any difference?
a treemap takes longer than HashMap
What happens if you invoke countWords multiple times for different String iterators?
If you invoke countwords multiple times, it will add the strings to the map
What crucial role does the Iterator abstraction play in making WordCounter testable?
The iterator abstraction allows entries to be added if it wasn't for the iterator nothing will be testable