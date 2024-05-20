package api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = {"name"})
public class EmployeeToString 
{
	private String name;
	String password;
	int age;

}
