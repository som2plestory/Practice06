package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] userArr = new User[3];
		
		User c01 = new Customer("jws", "j1234", "정우성", 1000);
		User c02 = new Customer("yjs", "y2345", "이효리", 2000);
		
		User e01 = new Employee("master", "m7788","운영자", 5000000);
		
		userArr[0] = c01;
		userArr[1] = c02;
		userArr[2] = e01;
		
		for(int i=0; i<userArr.length; i++) {
			userArr[i].showInfo();
		}
		
		System.out.println("운영자의 월급은 "+((Employee)userArr[2]).getSalary()+"원 입니다.");
		

	}

}
