package com.api.controller;

public class StringTestController {
	
	public static void main(String[] args) {
		//문자열처리 클래스에 대해 알아보자.
		//1. String 클래스 자바에서 기본자료형처럼 문자열을 처리할 수 있는 클래스
		String str = "곰탱이";
		System.out.println(str);
		
		//주소값 출력
		//String 은 불변의 데이터
		System.out.println(str.hashCode());
		str+=" 미련하다";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		//String 클래스에서 제공하는 메서드 알아보기
		//자주쓰는 메서드들
		//1. concat() : 문자열을 결합하고 반환하는 메서드.
		String temp = str.concat(" 너무 미련하다.");
		System.out.println(str+" : "+temp);
		
		//2. contains (확인문자열) : 문자열에 특정 문자가 포함됐는지 확인하는 메서드
		// 매개변수에 들어온 문자열이 포함이면 true
		System.out.println(temp.contains("곰탱이")); // true
	
		//3. indexOf() : 매개변수의 문자열과 동일한 문자를 찾고 그 문자열의 인덱스 번호를 반환
		// 만약 없으면 -1을 반환, 띄어쓰기도 인덱스 요소로 본다.
		System.out.println(temp.indexOf("미련"));
		//시작위치 지정 가능
		System.out.println(temp.indexOf("미련", 4));
		
		temp = "안녕하세요요요";
		// 4. lastIndexOf() : 찾은 문자열 중에서 가장 마지막 것의 인덱스를 출력
		System.out.println(temp.lastIndexOf("요"));
		
		//5. replace(대상문가, 대체문구) : 특정문구를 수정하는 메서드
		String change = temp.replace("요", "다");
		System.out.println(change);
		
		//6. split() : 문자열이 특정구분자에 의해 구분되었을 때, 그 구분자를 기준으로 배열 형태를 만들어 준다.
		temp = "코딩,축구,캠핑,클라이밍";
		String[] hobbies = temp.split(",");
		for(int i=0;i<hobbies.length;i++) {
			System.out.println(hobbies[i]);
		}
		
		//***번외편
		//forEach문 : 배열, List, Map, Set 등의 자료를 자동으로 반복하여 데이터를 순회할 수 있는 반복문
		//for( 배열자료형 변수 : 배열 or List or Set or Map){로직}
		for(String h : hobbies) {
			System.out.println(h);
		}
		
		//7. join(인덱스 사이에 넣을 문자열, 대상 배열) : 배열을 문자열로 변경해주는 메서드
		temp = "코딩,축구,캠핑,클라이밍";
		String aaa = String.join("~", hobbies);
		System.out.println(aaa); //코딩~축구~캠핑~클라이밍
		
		//8. subString() : 문자열의 특정 위치를 잘라내는 것
		//substring(정수) / substring(시작(포함), 끝(미포함))
		temp = "이제 곧 쉬는시간";
		System.out.println(temp.substring(5)); //쉬는시간
		System.out.println(temp.substring(2,6)); // 곧 쉬
		System.out.println(temp.substring(temp.indexOf("쉬"), temp.indexOf("간"))); //쉬는시
		
		//9. 대소문자 변환
		//toUpperCase(), toLowerCase()
		temp = "abcdefABC";
		System.out.println(temp.toUpperCase()); //ABCDEFABC
		System.out.println(temp.toLowerCase()); //abcdefabc
		
		//10. trim() : 문자열 양끝의 공백을 제거
		temp = "   안녕      ";
		System.out.println(temp.trim()); //안녕
		
		//String.valueOf(변수 or 리터럴)
		int a = 123;
		temp = String.valueOf(a);
		System.out.println(temp); //123
		
		
		//------------------------ StringBuffer
		//StringBuffer 클래스
		//기본자료형처럼 쓰지않고 객체처럼 쓴다
		//생성해서 사용한다. 메서드를 이용해서 데이터를 수정.
		StringBuffer sb = new StringBuffer();
		//테이터 넣기(추가)
		//append(내용) : StringBuffer에 내용을 추가해줌
		sb.append("이얏호");
		System.out.println(sb); //이얏호
		
		sb.insert(sb.indexOf("호")+1, " 밥먹을 시간이다");
		System.out.println(sb); // 이얏호 밥먹을 시간이다
		
		//setCharAt();
		sb.setCharAt(0, '히');
		System.out.println(sb); // 히얏호 밥먹을 시간이다)
		
		//String, StringBuffer 변환
		String temp1 = new String(sb); // StringBuffer를 String 타입 변수에 대입
		temp1 = sb.toString(); // StringBuffer를 String 타입 변수에 대입
		StringBuffer sb1 = new StringBuffer(temp1); // String을 StringBuffer 타입 변수에 대입
		
	}	
}
