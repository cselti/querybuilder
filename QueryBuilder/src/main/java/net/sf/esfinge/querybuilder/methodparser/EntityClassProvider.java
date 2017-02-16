package net.sf.esfinge.querybuilder.methodparser;

import java.lang.reflect.Method;

public interface EntityClassProvider {
	
	public Class<?> getEntityClass(String name);

	public Class<?> getEntityClass(Method m, String name);

}
