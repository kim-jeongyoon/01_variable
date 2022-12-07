package edu.kh.variable.ex1;

public class VariableExample1 {
	public static void main(String[] args) {
		//메인메소드: 꼭 있어야 실행가능!!
		
		//Notice: 문장끝에 ;(세미콜론) 찍어줘야 문장의 끝이라고 인식함
		//명령어 끝에 ; 없으면 에러 
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793* 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		
		//변수사용
		double pi= 3.141592653589793; //소수점을 나타내려면 double 이라는 변수 사용
		int r= 10; // 반지름
		int h= 20;// 높이
		
		System.out.println("=========================================");
		System.out.println(2 * pi * r);//원의둘레
		System.out.println(pi * r * r);//원의 넓이
		System.out.println(pi * r * r * h);//원기둥의 부피
		System.out.println(4 * pi * r * r);//구의겉넓이
		
		/* 변수(Variable)
		 * - 메모리(RAM)에 값을 기록하는 구간
		 * -공간에 기록되는 값(data)이 변할 수 있어서 변수라고 한다.
		 * - 변수는 여러 종류 존재(저장되는 값의 형태, 크기가 다름)
		 * - 변수 사용의 장점
		 *  1.가독성 증가
		 *  2.재사용성 증가
		 *  3.코드길이의 감소
		 *  4.유지보수성 증가(수정간단)
		 *  */
					
	}
}
