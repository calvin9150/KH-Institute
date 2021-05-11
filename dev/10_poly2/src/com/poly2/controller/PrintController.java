package com.poly2.controller;

import com.poly2.model.vo.CannonPrinter;

public class PrintController {
	
	private CannonPrinter print = new CannonPrinter();
	
	public void print() {
		print.cannonPrint();
	}
	
}
