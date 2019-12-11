package test;

import java.util.Scanner;

public class T3 {
	
	public static void main(String[] args) {
		
     // 1-2+3-4+ ...... 합계가 100이 넘는 순간의 숫자출력.
		
		
		int i=0,num=0,sum=0,sum2=0;
		
		
//		for(i=1;sum>100;i++) {
//			
//			if(i%2==0) {
//				sum-=i;
//				
//			}else {
//				sum+=i;
//			}
//		
//		}
//		
//		System.out.println(sum);
		
		
//		for(i=1;sum>100;i++) {
//			
//			if(i%2!=0) {
//			sum+=i;
//			
//		}else {
//			sum2-=i;
//		}
//	
//		}
//		
//		System.out.println(sum+sum2);
//		
		
		
//		boolean run = true;
//		
//		while(run) {
//			
//			if(num%2==0) {
//				num++;
//				sum-=num;
//				if(sum>100) {
//					 System.out.println(sum);
//					 run = false;
//			}else{
//				num++;
//				sum+=num;
//				if(sum>100) {
//					 System.out.println(sum);
//					 run = false;
//			
//			}
////			}
//			}
//		}
//		
		

		while(sum<100) {
			num++;
			if(num%2==0) {
				sum-=num; 
			}else{
				sum+=num;
			}
			}
		System.out.println("합이 100 넘는 순간의 숫자:"+num);
		
		// 순차적 숫자 증가 증감 연산자  .
		// 부호변경 a=-a 1.
		//합계용 변수 
		//카운트용 변수 1
		
		//브레이크 사용
		// sum += num
		// 순차적 ++1 / 부호면병 해주고 / 넘에다가 숫자랑 카운트 곱 / 반복 하다가 100 넘으면 브레이크 
		// 지금말고 오늘 해보기 ㅎㅎ 
		
		
		
		


		
     }
}
