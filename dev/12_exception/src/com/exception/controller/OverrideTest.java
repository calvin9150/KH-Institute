package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class OverrideTest extends ThrowsTest{

	@Override
	public void b() throws FileNotFoundException,EOFException{
		
	}
	
	
}
