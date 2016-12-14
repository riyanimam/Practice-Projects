import random

num = int(input("What do you think is the number? "))

picked = random.randint(1, 100)

while(num != picked):
	if num - picked < 0:
		print "The difference between your number and the picked number is less than 0."
		num = int(input("What do you think is the number now? "))
		if num == picked:
			print "You guessed it! It was", num,"!"
	elif num + picked > 100:
		print "The summation of both your number and the picked number is more than 100!"
		num = int(input("What do you think is the number now? "))
		if num == picked:
			print "You guessed it! It was", num,"!"
	elif num - picked > 0 and num - picked < picked:
		print "Add more to your number!"
		num = int(input("What do you think is the number now? "))
		if num == picked:
			print "You guessed it! It was", num,"!"
	elif num + picked < 100 and num + picked > picked:
		print "Subtract from your number!"
		num = int(input("What do you think is the number now? "))
		if num == picked:
			print "You guessed it! It was", num,"!"

