def quick_sort(collection):
	length = len(collection)
	if(length<=1):
		return collection
	else:
		pivot = collection[0]
		greater = [ element for element in collection[1:] if element > pivot]
		lesser = [ element for element in collection[1:] if element <= pivot]
		collection = quick_sort(lesser) + [pivot] + quick_sort(greater)
		#return quick_sort(lesser) + [pivot] + quick_sort(greater)
	return collection

if __name__ == '__main__':

	raw_input = input

	user_input = raw_input('Enter numbers separated by a comma:\n').strip()
	unsorted = [int(item) for item in user_input.split(',')]
	print(quick_sort(unsorted))