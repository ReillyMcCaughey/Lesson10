SEARCHING THEORY
================

-2 popular ways to search through a list (of Strings, objects, numbers, etc.):

LINEAR SEARCH -> Start at first item, and move down one at a time until a match is found.
If there is no match, it won't know until it goes through the whole list.

BINARY SEARCH -> Start at the middle point of the list. If the item is higher, adjust the left side to midpoint + 1.
If item is lower adjust the right side to midpoint - 1. Search at new midpoint and repeat until eitheritem 
is found OR left and right sides collide with each other.

-Binary Search can only be used if items are sorted in some way (alphabetical, numeric)

OBJECTS AND SEARCHING
=====================
Objects from classes can be searchable if the class implements comparable.

public class Something implements Comparable<Something>{
}

-Then you decide which instance variable (property) will be used for searching / comparing purposes
-Lastly you include a compareTo method that returns a comparison of the property with another same
type of object's same property.
-compareTo returns an 'int' so if you are comparing 2 Strings you can use the String compareTo on that property.
-For ints you can do a calculated difference between the 2 values, or just return +1, -1, or 0, depending
on which is greater.

-Then, the collection of objects you are searching through must be sorted by the compareTo property in order to 
do a binary search.