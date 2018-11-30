import java.util.*;

public class KeyRaces{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];

		for(int i = 0; i<5; i++){
			nums[i] = sc.nextInt();
		}

		int a = nums[0]*nums[1]+nums[3]*2;
		int b = nums[0]*nums[2]+nums[4]*2;

		if(a == b){
			System.out.println("Friendship");
		} else {
			if(a<b){
				System.out.println("First");
			} else {
				System.out.println("Second");
			}
		}
	}

}