package com.ustglobal.exception.first;

public class PayTm {
	void book() {
		System.out.println("Paytm Started");
		IRCTC i = new IRCTC();
		i.confirm();
		System.out.println("Paytm Eded");
	}
}
