package api;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value//(Equivalent to @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode. )
@AllArgsConstructor
public class EmployeeValue 
{
	String name;
	String age;
}
