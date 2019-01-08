import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		boolean flag = false;
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 2; i < input; i++){
			flag = isPrime(i, list);
			if(flag == true){
				count++;
				list.add(i);
			}
		}
		System.out.println(count);
	}

	public static boolean isPrime(int i, List<Integer> list) {
		boolean isPrimeFlag = false;

		if(i == 2){
			isPrimeFlag = true;
		}else if (i == 3) {
			isPrimeFlag = true;
		}else if(i % 2 ==0){
			isPrimeFlag = false;
		}else{
			for(int j =0; j < list.size(); j++){
				if(i % list.get(j) == 0){
					break;
				}else if(j == list.size()-1){
					isPrimeFlag = true;
				}
			}
		}
		return isPrimeFlag;
	}
}

