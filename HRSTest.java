package com.tech2.poly;



	abstract class Employee{//�θ�Ŭ����
		String name;
		int salary;
		
		public abstract void calcSalary();
		public abstract void calcBonus();
	}
	
	class Salesman extends Employee{
		public void calcSalary() {
			System.out.println("Salesman �޿� =�⺻��+�Ǹż���");
		}
		public void calcBonus() {
			System.out.println("Salesman ���ʽ� =�⺻��*12*4");
		}
		
	}
	class Consultant extends Employee{
		public void calcSalary() {
			System.out.println("Consultant �޿� =�⺻��+������ Ư������");
		}
	
		public void calcBonus() {
			System.out.println("Consultant ���ʽ� =�⺻��*12*2");
		}
	
}
abstract class Manager extends Employee{
	public void calcSalary() {
		System.out.println("Manager �޿� =�⺻��+������ �� ���� ����");
	}
}	
class Director extends Manager{
	public void calcBonus() {
		System.out.println("Manager ���ʽ� =�⺻��*12*60");
	}
}	//��ӹ��� ����.

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
			System.out.println("����");
		}else System.out.println("����ġ");
		calTax(s);
		calTax(c);
		
	}
	public static void calTax (Employee s) {
//		System.out.println("tax calcultating");
		System.out.println("Salesman  ��"+(s instanceof Salesman));
		
		if (s instanceof Salesman) {
			System.out.println("i'm a Salesman");
		}else if (s instanceof Manager) {
			System.out.println("i'm a Manager");
		}else if (s instanceof Director) {
			System.out.println("i'm a Director");
		}
	}
}


