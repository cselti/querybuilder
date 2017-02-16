package net.sf.esfinge.querybuilder;

import net.sf.esfinge.querybuilder.methodparser.EntityClassProvider;

import java.lang.reflect.Method;

public class DummyEntityClassProvider implements EntityClassProvider{

	@Override
	public Class<?> getEntityClass(String name) {
		return null;
	}

	public Class<?> getEntityClass(Method m, String name) { return null;}
	

}
