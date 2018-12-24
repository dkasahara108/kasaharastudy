package la.java;
import java.util.*;

class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean flug = false;
		int count = 0;
		
		for(int x =0; x < a; x++){
			flug = isPrime(x);
			if(flug == true){
				count++;
			}else{
				continue;
			}			
		}
		
		System.out.println(count);
		
	}
	public static boolean isPrime(int num) {
	    if (num < 2) return false;
	    else if (num == 2) return true;
	    else if (num % 2 == 0) return false; 
	    double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2)
	    {
	        if (num % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}

}


