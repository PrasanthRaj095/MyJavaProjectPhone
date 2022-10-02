package org.phone;

public class Phone {
	public void phoneInfo(String phonename,String modelname) {
		System.out.println(phonename);
		System.out.println(modelname);		
	}
	public void phoneInfo(float imeino,String imeiname) {
		System.out.println(imeino);
		System.out.println(imeiname);
	}
	public void phoneInfo(int phoneno,boolean vaild) {
		System.out.println(phoneno);
		System.out.println(vaild);
	}
	public void phoneInfo(long codeno,float scanno) {
		System.out.println(codeno);
		System.out.println(scanno);
	}
	public void phoneInfo(char initial,String phonename) {
		System.out.println(initial);
		System.out.println(phonename);
	}
	public void phoneInfo(boolean goodwill ,int value) {
		System.out.println(goodwill);
		System.out.println(value);
	}
	public void phoneInfo(char phonechar,boolean valid) {
		System.out.println(phonechar);
		System.out.println(valid);
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("vivo", "ZPRO");
		p.phoneInfo(235689.2232f, "IMEI");
		p.phoneInfo(2356478586l, 2354.222f);
		p.phoneInfo('V',"VIVO");
		p.phoneInfo(true, 2564566);
		p.phoneInfo('V', true);
	}
}
