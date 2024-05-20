package api;

import lombok.Value;

@Value//(Equivalent to @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode. )
public class EmployeeValue 
{
	String name;
	String age;
}
