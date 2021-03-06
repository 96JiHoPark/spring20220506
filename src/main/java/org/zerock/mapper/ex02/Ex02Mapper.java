package org.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id} ")
	String selectNameById(int id);

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id} ")
	String selectFirstEmployeeNameById(int id);

	@Select("SELECT CustomerName As Name, Address, City, Country FROM Customers WHERE CustomerID = #{id} ")
	CustomerDto selectCustomerById(int id);
	
	@Select("SELECT FirstName, LastName, BirthDate FROM Employees WHERE EmployeeID = #{id} ")
	EmployeeDto selectEmployeeById(int id);
	
	@Insert("INSERT INTO Customers "
			+ "(CustomerName, ContactName, City, Country, Address, PostalCode) "
			+ "VALUES (#{customerName},#{contactName},#{city},#{country},#{address},#{postalCode}) ")
	int insertCustomer(CustomerDto customer);
	
	@Insert("INSERT INTO Employees "
			+ "(FirstName, LastName, Photo, Notes) "
			+ "VALUES (#{firstName}, #{lastName}, #{photo}, #{notes}) ")
	int insertEmployee(EmployeeDto employee);

}
