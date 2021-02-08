package com.gui.Payroll.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Long id) {
		
		super("could not find employee " + id);

	}
}
