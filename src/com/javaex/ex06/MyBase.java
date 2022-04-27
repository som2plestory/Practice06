package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성

	
	public void service(String state) {
		if(state.equals("오후")) {
			afternoon();
		}else {
			super.service(state);
		}
	}
	
	public void afternoon(){
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
