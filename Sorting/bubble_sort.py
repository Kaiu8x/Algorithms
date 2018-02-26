
def bubble_sort(collection):
	sorted = False
	length = len(collection)
	while not sorted:
		sorted = True
		for element in range(0,length-1):
			if collection[element]>collection[element+1]:
				sorted = False
				collection[element], collection[element+1] = collection[element+1], collection[element]
	return collection

if __name__ == '__main__':
	
	raw_input = input

	user_input = raw_input('Enter numbers separated by a comma:\n').strip()
	unsorted = [int(item) for item in user_input.split(',')]
	print(bubble_sort(unsorted))