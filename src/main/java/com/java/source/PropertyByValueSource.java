
package com.java.source;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class PropertyByValueSource {
	@Value("${name}")
	private String Name;
	@Value("${employees.sam.gender}")
	private String employee_gender;

	public String getName(){
		return this.Name;
	}

	public String getEmployeeGender(){
		return this.employee_gender;
	}
}
