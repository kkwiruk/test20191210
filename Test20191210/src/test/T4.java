package test;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		
		//띠용 
		
		  Scanner scan = new Scanner(System.in);
		  
		  int num=0,random=0,con=0;
		  boolean run = true;
		  
		  System.out.println("업다운");
		  
		  random = ((int)(Math.random() * 100) + 1);
		  
		  while(run) {
			  System.out.print("1부터 100까지의 숫자를 입력하세요:");
			  num = scan.nextInt();
			  con++;
			  if(random==num) {
				  run=false;
				  System.out.println("맞췄습니다.");
				  System.out.println("시도횟수는"+con+"번 입니다");
			  }else if(random>num) {
				  System.out.println("더 큰 수를 입력하세요.");
			  }else if(random<num) {
				  System.out.println("더 작은 수를 입력하세요.");
			  }
			  
		  }
		  
		  
		  
		
		
		
		
	}
	
}
