#!/bin/bash

#This is the comment

echo "Enter your name"
read name
echo "Hello $name"

echo "Do you want to continue"
read answer

if [ $answer -eq 'Y' ]
then

	echo "What is going on?"
	read result

	echo "OK Bye!"
	fi

