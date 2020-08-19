package com.tech1.trans;

public class train extends trans{
	private int tDan;
public train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis);
		this.tDan=tDan;
	}
	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return cusCnt*dis*tDan;
	}

	
}
