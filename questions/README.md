# JAVA_BEGINNER_2


## Goals

1 -4 p. 63 in the book.

1. if statement
2. switch statement
3. for loop
4. while loop/ do-while loop
5. arrays, how to init and perform basic operations as adding a new item, updating an existing and deleting  etc.


## MVP 

1. Set an integer array consisting of elements 0 and 1. for Example: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Use the loop and condition to replace 0 with 1, 1 with 0;
2. Set an empty integer array of size 8. use the loop to fill it with the values 0 3 6 9 12 15 18 21;
3. Set an array [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] go through it in a loop, and multiply numbers less than 6 by 2;
4. Create a square two-dimensional integer array (the number of rows and columns is the same), and use the loop (s) to fill its diagonal elements with units/1;

## Stretch Goals

5. Set a one-dimensional array and find the minimum and maximum elements in it (without the help of the Internet);
6. Write a method that takes as a parameter a non-empty one-dimensional integer array. the method should return true if there is a place in the array where the sum of the left and right parts of the array is equal. 
> Examples: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, the border is shown with | | characters, these characters are not included in the array.
7. Write a method that is fed a one-dimensional array and the number n (can be positive or negative), and the method must shift all the elements of the array by n positions. You can't use auxiliary arrays to complicate the task.


## Specification

1) Version 1:
public static void invertArray() {
 int[] arr = { 1, 0, 1, 0, 0, 1 };
 for (int i = 0; i < arr.length; i++) {
 …
 }
}

Version 2:
public static void invertArray() {
 int[] arr = { 1, 0, 1, 0, 0, 1 };
 for (int i = 0; i < arr.length; i++) {
 if (…) {
 ...
 } else {
 ...
 }
 }
}

2) Version 1:
public static void fillArray() {
 int[] arr = new int[8];
 for (int i = 0; i < arr.length; i++) {
 ...
 }
}

Version 2:
public static void fillArray() {
 int[] arr = new int[8];
 arr[0] = 0;
 for (int i = 1; i < arr.length; i++) {
 ...
 }
}

Version 3:
public static void fillArray() {
 int[] arr = new int[8];
 for (int i = 0, ...; i < arr.length; i++, ...) {
 ...
 }
}

3) public static void changeArray() {
 int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
 for (int i = 0; i < w.length; i++) {
 if (...) {
 ...
 }
 }
}

4) Version 1:
public static void fillDiagonal() {
 int[][] arr = new int[4][4];
 for (int i = 0; i < 4; i++) {
 ...
 }
}

Version 2:
public static void fillDiagonal() {
 int[][] arr = new int[4][4];
 for (int i = 0; i < 4; i++) {
 for (int j = 0; j < 4; j++) {
 ...
 }
 }
}
