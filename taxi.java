package com.tech1.trans;

public class taxi extends trans{
	private int xDan;
public taxi(int cusCnt, int dis, int xDan) {
		super(cusCnt, dis);
		this.xDan=xDan;
	}
	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return cusCnt*dis*xDan;
	}

}
