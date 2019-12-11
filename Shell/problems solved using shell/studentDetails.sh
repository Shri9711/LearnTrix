#!/bin/bash

# Creating the array

# Declaring a hash
declare -A arr

# Reading number of records from user
read no
# Reading records from user
for a in `seq 1 $no`
    do
    read name
    read rollNo

    arr[$rollNo]=$name
done

echo
# Displaying all the students names
echo "Displaying students names"
echo "${arr[*]}"

# by Ankush Chavan