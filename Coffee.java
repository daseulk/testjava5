package com.tech3.inter_di1;

public class Coffee {
private HotAmericano ame;
//private IceAmericano ame;
 public Coffee() {
//System.out.println("did you call me");
 ame= new HotAmericano();
 System.out.println(ame);
 }
public void coffeeType() {
	System.out.println(ame.getName());
}
}
