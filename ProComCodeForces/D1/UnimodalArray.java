import java.util.*;

public class UnimodalArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		int c = 0;
		boolean flag = true;
		nums[0] = sc.nextInt();

		for(int i = 1; i<nums.length; i++) {
			nums[i] = sc.nextInt();

			if( c == 0) {
				if(nums[i-1] == nums [i]){
						c = 1;
					} else {
						if(nums[i-1] > nums[i]){
							c = 2;
						}
					}
				} else {
					if( c == 1 ) {
						if(nums[i-1] > nums[i]){
								c = 2;
						} else {
							if(nums[i-1] < nums[i]){
								System.out.println("NO");
								flag = false;
								break;
							}
						}
					} else {
						if(c == 2) {
							if(nums[i-1] <= nums[i]){
								System.out.println("NO");
								flag = false;
								break;
							}
						}
					}
				}
		}

		if(flag) {
			System.out.println("YES");
		}

	}
}