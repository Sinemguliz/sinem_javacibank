package net.javaci.javacibank.backoffice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.javaci.javacibank.db.model.Employee;


@Getter @Setter @ToString
public class EmployeeDto extends Employee {
	private String confirmPassword;

}
