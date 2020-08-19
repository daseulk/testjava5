package com.tech1.trans;

public class transTest {
	public static void printCharge(trans tran) {
		System.out.println("===============");
		System.out.println(tran.toString());
		System.out.println("----------------");
		System.out.println(tran);
		System.out.println("지불금액"+tran.getCharge());
		System.out.println("----------------")
		;}
	
public static void main(String[] args) {
	trans[] trans =new trans[4];
	trans[0]=new train(5,100,200);
	trans[1]=new express(10,100,100);
	trans[2]=new taxi(2,10,500);
	trans[3]=new train(1,100,200);
for (int i = 0; i < trans.length; i++) {
	printCharge(trans[i]);
}
}
}
