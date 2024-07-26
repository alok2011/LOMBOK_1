package api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString

public class EmployeeData
{
	String name;
	String password;
	int age;
	
}
