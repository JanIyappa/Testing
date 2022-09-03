package org.com;


public class VinoCountPgm {

	public static void main(String[] args) {
		int num= 8152565;
		int result =0;
		int count=0;
		while(num>0) {
			int sum = num%10;
			result= result+sum;
			num=num/10;
			
			count++;
		}
		System.out.println(count);
		
		
		
		
		
	}

}
