package com.tech2.poly;



	abstract class Employee{//부모클래스
		String name;
		int salary;
		
		public abstract void calcSalary();
		public abstract void calcBonus();
	}
	
	class Salesman extends Employee{
		public void calcSalary() {
			System.out.println("Salesman 급여 =기본급+판매수당");
		}
		public void calcBonus() {
			System.out.println("Salesman 보너스 =기본급*12*4");
		}
		
	}
	class Consultant extends Employee{
		public void calcSalary() {
			System.out.println("Consultant 급여 =기본급+컨설팅 특별수당");
		}
	
		public void calcBonus() {
			System.out.println("Consultant 보너스 =기본급*12*2");
		}
	
}
abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager 급여 =기본급+컨설팅 팀 성과 수당");
	}
}	
class Director extends Manager{
	public void calcBonus() {
		System.out.println("Manager 보너스 =기본급*12*60");
	}
}	//상속받음 세개.

public class HRSTest{
	public static void main(String[] args) {
		Salesman s =new Salesman();
		Consultant c =new Consultant();
		Director d= new Director();
		
		Employee arr[]=new Employee[3];
		arr[0]=s;
		arr[1]=c;
		arr[2]=d;
//		for (Employee object : arr) {
//			calTax(object);
//			}
		calTax(s);
			
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		s.calcBonus();
//		c.calcBonus();
//		d.calcBonus();
		System.out.println(s.toString());
		System.out.println(c.toString());
		Salesman s2=s;
		if (s.equals(c)) {
			System.out.println("동일");
		}else System.out.println("불일치");
		calTax(s);
		calTax(c);
		
	}
	public static void calTax (Employee s) {
//		System.out.println("tax calcultating");
		System.out.println("Salesman  비교"+(s instanceof Salesman));
		
		if (s instanceof Salesman) {
			System.out.println("i'm a Salesman");
		}else if (s instanceof Manager) {
			System.out.println("i'm a Manager");
		}else if (s instanceof Director) {
			System.out.println("i'm a Director");
		}
	}
}


