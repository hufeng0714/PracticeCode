package com.how2j.exception;

public class OverdraftException extends Exception{

	public OverdraftException(){
		
	}
	
	public OverdraftException(String msg){
		super(msg);
	}
}
