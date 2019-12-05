#!/bin/bash

echo "Hashes"
echo

# Declaring a hash
declare -A arr

# Adding elements as key and value to the associative array
arr[0]="This is the first element"
arr[second]="This is the second element"
arr["third"]="Its a third element"
arr[4]="Wow fourth element"

echo "All elements are:"
echo "${arr[*]}"

echo "Indices of all the elements are"
echo "${!arr[*]}"

echo "Total number of elements are"
echo "${#arr[*]}"

echo "Length of first element"
echo "${#arr[0]}"
                      
