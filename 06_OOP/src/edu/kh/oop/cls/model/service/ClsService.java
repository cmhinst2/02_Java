package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVO;

// ClsService와 Student는 패키지가 다름
public class ClsService /* extends Student */ {
			//	부모로 Student 클래스를 상속받음
			// Student(부모) -> ClsService(자식)
	
	public void ex1() {
		// 클래스 접근제한자 확인하기
		Student std = new Student();
		// public class인 Student는 import 가능(어디서든 접근가능)
		
		//TestVO test = new TestVO();
		// (default) class인 TestVO는 import 불가능(다른패키지라 불가)
	
	
		// 필드 접근제한자 확인하기
		System.out.println( std.v1 );
		// -> 전체에서 직접 접근 가능한 public인 v1만 에러발생 X
		
		//System.out.println( std.v2 );
		//System.out.println( std.v3 );
		//System.out.println( std.v4 );
		
		
		// 상속 관계에서 직접 접근 가능범위 테스트
		System.out.println( v1 ); // public - 프로그램 전체에서 접근가능
		
		System.out.println( v2 ); 
		// Student 클래스를 상속받았으므로 Student의 protected 변수인
		// v2는 직접 접근 가능
		//System.out.println( v3 ); // (default) 다른패키지 X
		//System.out.println( v4 ); // 해당클래스가 아닌 다른클래스 X
		
		
	
	
	
	
	}

}
