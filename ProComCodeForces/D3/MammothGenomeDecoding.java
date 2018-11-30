import java.util.*;
public class MammothGenomeDecoding{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		char[] result;
		long[] nums = new long[5];
		long[] numsmis = new long[4];

		int flag = 0;
		long max = 0;

		String str = sc.next();

		result = str.toCharArray();

		for(int i = 0; i<result.length; i++) {
			switch(result[i]) {
				case 'A':
					nums[0]++;
					break;
				case 'G':
					nums[1]++;
					break;
				case 'C':
					nums[2]++;
					break;
				case 'T':
					nums[3]++;
					break;
				case '?':
					nums[4]++;
					break;
				default:
					break;
			}
		}

		for(int i = 0; i<4; i++) {
			if(nums[i]>max) {
				max = nums[i];
			}
		}

		int sum = 0;

		for(int i = 0; i<4; i++) {
			sum += max-nums[i];
			numsmis[i] = max-nums[i];
		}

		if(sum == 0 && nums[4] % 4 == 0) {
			flag = 1;
			for(int i = 0; i< result.length; i++) {
				if(i%4 == 0){
					result[i] = 'A';
				}
				if(i%4 == 1){
					result[i] = 'G';
				}
				if(i%4 == 2){
					result[i] = 'C';
				}
				if(i%4 == 3){
					result[i] = 'T';
				}
			}
			String s = new String(result);
			System.out.println(result);
		}
		int count = 0;
		if(flag == 0) {
			if((nums[4]-sum)%4 == 0 && sum<num) {
				for(int i = 0; i< result.length; i++) {
					if(result[i] == '?') {
						if(numsmis[0]!=0) {
							result[i] = 'A';
							numsmis[0]--;
						} else {
							if(numsmis[1] != 0) {
								result[i] = 'G';
								numsmis[1]--;
							} else {
								if(numsmis[2] != 0) {
									result[i] = 'C';
									numsmis[2]--;
								} else {
									if(numsmis[3] != 0) {
										result[i] = 'T';
										numsmis[3]--;
									} else {
										if(count%4 == 0){
											result[i] = 'A';
										}
										if(count%4 == 1){
											result[i] = 'G';
										}
										if(count%4 == 2){
											result[i] = 'C';
										}
										if(count%4 == 3){
											result[i] = 'T';
										}
										count++;
									}
								}
							}
						}
					}
				}
				String s = new String(result);
				System.out.println(result);
			} else {
				System.out.println("===");
			}
		}
	}

}