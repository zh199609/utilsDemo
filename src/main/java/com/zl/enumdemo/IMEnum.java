package com.zl.enumdemo;

public enum IMEnum {
	
	TYPT_ONE("钢厂","1"),
	TYPT_TWO("外企","2"),
	TYPT_THREE("贸易商","3"),
	TYPT_FOUR("煤炭企业","4"),
	TYPT_FIVE("大型企业","5"),
	TYPT_SIX("投资公司","6"),
	TYPT_SEVEN("金融机构","7"),
	TYPT_EIGHT("政府机构","8"),
	TYPT_NINE("学术机构","9"),
	TYPT_ZERO("其他","0");
	
	
	
	private String im;
	private String imName;
	
	public static String getIMName(String im) {
		IMEnum[] values = IMEnum.values();
		
		for(int i=0;i<values.length;i++) {
			if(values[i].getIm().equals(im)) {
				return values[i].getImName();
			}
		}
		return "未知";
	}
	
	public String getIm() {
		return im;
	}



	public void setIm(String im) {
		this.im = im;
	}



	public String getImName() {
		return imName;
	}



	public void setImName(String imName) {
		this.imName = imName;
	}



	private IMEnum( String imName,String im) {
		this.im = im;
		this.imName = imName;
	}
	
	
	
	
	

}
