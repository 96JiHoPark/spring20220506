package org.zerock.domain.ex01;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EmployeeDto {
	private String firstName;
	private String lastName;
	private String photo;
	private String notes;
	private LocalDateTime birthDate;
	
}
