package com.tech1.trans;

public abstract class trans {
protected int cusCnt;
protected int dis;
public abstract int getCharge();

public trans(int cusCnt, int dis) {
	this.cusCnt=cusCnt;
	this.dis=dis;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cusCnt+" : "+dis;
	}


}
