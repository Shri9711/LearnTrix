#!/bin/bash

# We can write function keyword before the function name

hello() {
	    echo "Hello"
    }

hello

# Passing parameters to the functions
# Here we are not abel to pass parameters directly

function hello1() {
	    echo "Hello $1, How are you?"
    }

hello1 Ankush

# Returning the value from the function
function returnVal() {
	    echo "This is the test"
    }

data=$(returnVal)
echo "$data"

echo $returnVal

function out() {
	    return 1
    }

echo $out

#This will returns 0
echo $?

i=$?
echo $i

# Creating one function and initializing a value to it

function variables() {
	    result="Test variable"
    }

variables

echo $result

# We can change the scope of the variable by writing the local keyword before it

function variable2() {
	    local number="Test variable"
    }

variable2

echo $number

#

function compare() {
	    local var1=$1
	        local var2=$2

		    eval ${var1}=${var2}
	    }

    compare Ankush Ankush

    echo $?

    # Eval checks whether the value of the variable is equal to the assigned value

    function cmp() {
	        local res1=$1
		    local res2="Some value"

		        eval $res1="'$res2'"
		}

	# Initializing the result key
	init result #This points to the "Some value"

	echo $result

