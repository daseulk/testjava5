package com.tech1.trans;

public class express extends trans implements Start, End {
	private int eDan;
public express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis);
		this.eDan=eDan;
	}
	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return cusCnt*dis*eDan;
		
		
	}
	@Override
	public String getStartStation() {
		// TODO Auto-generated method stub
		return "seoul";
	}
	@Override
	public String getEndStation() {
		// TODO Auto-generated method stub
		return "busan";
	}

}
