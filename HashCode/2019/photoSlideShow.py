def main():

	fr = open('a_example.txt', 'r')

	num_photos = int(fr.readline())
	print(num_photos)

	for i in range(num_photos):
		 print(i)


	fw = open('a_example_results.txt', 'w')


if __name__ == "__main__":
		main()


