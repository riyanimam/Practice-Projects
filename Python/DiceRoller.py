import random

first = raw_input("Would you like to roll the dice?")

if(first == "no" or first == "n"):
	print "Oh well, we are finished processing!"
while(first == "yes" or first == "y"):
	dice = random.randint(1, 6)
	print dice
	first = raw_input("Would you like to roll the dice again?")
	if(first == "no" or first == "n"):
		print "Finished Processing! Thanks for playing!"


