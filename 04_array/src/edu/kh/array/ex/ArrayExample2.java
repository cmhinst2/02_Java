package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {

	// 얕은 복사 (shallow copy)
	// -> 주소를 복사하여 서로 다른 두 변수가
	//	  하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	public void shallowCopy() {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// 얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr : " + Arrays.toString(arr) );
		System.out.println("copyArr : " + Arrays.toString(copyArr) );
		
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr) );
		System.out.println("copyArr : " + Arrays.toString(copyArr) );
		
		System.out.println(arr);
		System.out.println(copyArr);
		
		
	}
	
	// 깊은 복사 (deep copy)
	// -> 같은 자료형의 새로운 배열을 만들어서
	//		기존 배열의 데이터를 모두 복사하는 방법
	
	public void deepCopy() {
		
		int[] arr = {1,2,3,4,5}; // 원본
		
		// 1. for문을 이용한 깊은 복사
		int[] copyArr1 = new int[arr.length]; // 5칸 짜리 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			
			copyArr1[i] = arr[i];
			
		}
		
		
		System.out.println(arr);
		System.out.println(copyArr1);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr1));
		
		// 2. System.arraycopy(원본배열, 원본복사 시작 인덱스, 
		//						복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		
		int[] copyArr2 = new int[arr.length]; // 5칸 짜리 배열 생성
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println(Arrays.toString(copyArr2));
		
		// 3. 복사할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copyArr3));
		
		
		// 값 변경 후 확인
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
