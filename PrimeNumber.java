package la.java;

import java.util.*;

class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count =0;
		List<Integer> list = new ArrayList<Integer>(); 
		
		
		if(a <= 1){
			
		}else {
			for(int i = 2; i < a; i++){
				if(i == 2){
					count++;
					continue;
				}else if (i == 3) {
					count++;
					list.add(i);
					continue;				
				}else if(i % 2 ==0){
					continue;
				}else{
					for(int j =0; j < list.size(); j++){
						if(i % list.get(j) == 0){
							break;
						}else{
							if(j == list.size()-1){
								count++;
								list.add(i);
							}else{
								continue;
							}
						}
					}
				}
			}
		}
		System.out.println(count);		
	}
}
