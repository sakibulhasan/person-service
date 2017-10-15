package wsib.on.ca.person.model;

import java.util.List;

import org.junit.Test;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterNonConcrete;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

public class PojoTest {
	private static final String POJO_PACKAGE = "wsib.on.ca.person.model";

	@Test
	public void testPojoStructureAndBehavior() {
		List <PojoClass> pojoClasses = PojoClassFactory.getPojoClassesRecursively(POJO_PACKAGE,
				new FilterNonConcrete());
		
		Validator validator = ValidatorBuilder.create()
				.with(new SetterMustExistRule(),
						new GetterMustExistRule())
				.with(new SetterTester(),
						new GetterTester())
				.build();
		validator.validate(pojoClasses);
	}
}
