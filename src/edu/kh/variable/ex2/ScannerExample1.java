package edu.kh.variable.ex2;

import java.util.Scanner; //import --> 안하면 밑에 에러

public class ScannerExample1 {

	public static void main(String[] args) {
		
		// Scanner: 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		// Scanner 생성l
		
	     Scanner sc = new Scanner(System.in);
	     //import를 안해오면 에러뜸
	     //Scanner를 만들어서 쓰고싶은데 설계도가 없음
	     //import 해오라는 에러 발생! == import 해오면 에러 해결
	     /* 
	     System.out.println("값을 입력하시오");
	     int input1 = sc.nextInt(); //입력받은 정수를 input1에 대입
	     // nextInt() : 다음 입력된 정수를 읽어옴(키보드로 입력된 정수를 읽어옴)
	     
	     System.out.println(input1);
	     
	     System.out.println("실수만 입력해!!");
	     double input2 = sc.nextDouble();
	     System.out.println(input2); 
	     
	     */
	     
	     //안녕 반가워! 밥먹을래?
	     /*
	     System.out.print("입력1:   ");
	     String input3 = sc.next(); // 다음 입력된 한 단어를 읽어옴
	     System.out.println(input3);
	     
	     System.out.print("입력2:   ");
	     String input4 = input3 + sc.next(); // 다음 입력된 한 단어를 읽어옴
	     System.out.println(input4);
	    */
	     
	     System.out.print("입력1:   ");
	     String input3 = sc.nextLine();
	     System.out.println(input3);

		

	}

}
