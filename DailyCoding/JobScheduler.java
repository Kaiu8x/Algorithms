/*

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.

https://www.careercup.com/question?id=4710256117547008
func execute(after time: Int, f: @escaping () -> Void) {
	DispatchQueue.main.async(deadline: .now() + .milliseconds(time), execute: f)
}

// Usage:
execute(after: 250) { [weak self] in
	self?.title = "Example"
}

*/

public class JobScheduler{
	public static void main(String[] args) {
		
	}
}