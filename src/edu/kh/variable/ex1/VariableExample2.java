package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지
		 * 논리형: boolean(1byte)
		 * 정수형: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형: float(4byte), double(8byte)
		 * 문자형: char(2byte, 유니코드) 	 
		 */
		
		//변수선언: 메모리에 값을 저장할 공간을 할당한다는 것 
		//변수 값 대입: 변수의 값을 집어 넣는 것
		
		boolean booleanData;
		//메모리에 논리 값(t/f) 저장할 공간 1byte 할당하고
		//할당된 공간을 booleanData라고 부르겠다.
		
		booleanData = true;
		System.out.println("booleanData:" + booleanData);
		
		//자료형은 byte 변수명 byteNumber 값 127대입
		
		byte byteNumber = 127;
		
		/* 메모리에 정수값을 저장할 공간 1byte 할당하고
		 * 할당된 공간을 byteNumber라고 부르겠다.
		 * 선언된 byteNumber 변수에 처음으로 127을 넣음 --> '초기화'라고 함
		 */
		
		System.out.println("byteNumber: " + byteNumber);
									
		short shortNumber = 32767; //변수 선언 및 초기화
		int intNumber = 21474; //정수 자료형의 기본형!(short, byte 잘 안씀, 옛날 코드의 잔재)
		// 자료형(int) 변수명(intNumber) = 리터럴(2147483648)
		// **리터럴: 변수에 대입되거나 작성되는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름
		
		long longNumber = 10000000000L; // L 소문자 대문자 상관없이 long 쓸때는 L쓰기!
		//The literal 10000000000 of type int is out of range 
		// L 안쓰면 나타나는 에러(100억이라는 값은 범위를 벗어남, 뒤에 L을 붙여 long 자료형인 것을 나타냄)
		
		float floatNumber = 1.2345f; //f 안 붙이면 double로 인식해서 에러
		double doubleNuber = 3.141592653589793; // d를 뒤에 쓸 수는 있다.
		                                        //실수형은 float 또는 double 두개 밖에 없기 때문에
		                                        //자바는 double에 리터럴 안붙이고 쓴느애로 정함
		
		//문자형 리터럴 표기법: '' (홑따옴표)--> 문자하나
		char ch = 'A'; //65
		char ch2 = 66; // 결과값 B
		String str = "kim jeong yoon"; // String 은 "" (쌍따옴표)
		
		System.out.println("ch:" + ch);
		System.out.println("ch2:" + ch2);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		 * 컴퓨터에는 문자표가 존재하고 있는데 숫자에 따라 지정된 문자 모양이 매핑되어있고
		 * 'B'문자 그대로가 대입되면 변수에 숫자 66으로 변화되서 저장.
		 * --> 반대로 생각하면 변수에 66이라는 숫자를 저장하는 것도 가능하다.
		 */
		
		//변수 명명 규칙
		//1. 대소문자 구분해야함
		//2. 길이제한 없다.
		//3. 예약어 사용X (ex: float, double 같은)
		//4. 숫자로 시작X (ex: char 1abc (X) , char abc1 (O))
		//5. 특수문자는 $랑 _(언더바) 만 사용가능, 하지만 안쓴다
		
		int int_number; //사용가능하지만 자바는 카멜표기법 사용 --> intNumber
		
		//6. 카멜표기법, 여러 단어를 이어서 작성하는 경우 띄어쓰기 대신 대문자로 --> intNumber
		//7. 변수명은 언어를 가리지X 한글로도 쓸 수 있지만 안쓴다
		
		int number = 10;
		System.out.println("number:" + number); // 10
		
		number = 20;
		System.out.println("number:" + number); // 20
		
		/* 상수(항상 같은 수) 
		 * -변수의 한 종류
		 * -한번 값이 대입되면 다른 값 대입X
		 * -자료형 앞에 final 키워드를 작성(마지막 대입되는 값이라는 뜻) 
		 * -상수 명명 규칙: 모두 대문자, 여러 단어 작성 시 _(언더바) 사용함
		 * -상수를 사용하는경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 		
		 */
		final double PI_VALUE = 3.14;
		//PI_VALUE = 2.3; // 에러 대입불가
		
		
	}
}
