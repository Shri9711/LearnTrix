#!/bin/bash

myArray=(11 2 3 4 5)

# echo $myArray[3] This gives error

#The following statement gives write answer

echo "Printing the element at position 3"
echo "${myArray[3]}"

#Printing all the elements in the array

echo "Printing all the elements in the array"
echo "${myArray[@]}"

#Printing all indices of the array elements

echo "Printing all the indices of the elements"
echo "${!myArray[@]}"

#Printing size of the array

echo "Printing size of the array"
echo "${#myArray[@]}"

#Printing elements from index 1 to 4

echo "Printing elements from the index 1 to 44"
echo "${myArray[@]:1:4}"

#Overriding an element at index 1 to 44"

echo "Oberriding an element at index 1 to 44"
myArray[1]=44

echo "${myArray[@]}"

#Adding a new element of value 55 at index 5

echo "Adding a new element of value 55 at index 5"
myArray[5]=55
echo "${myArray[@]}"

