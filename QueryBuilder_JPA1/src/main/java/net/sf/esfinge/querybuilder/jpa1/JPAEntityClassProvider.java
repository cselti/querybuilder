package net.sf.esfinge.querybuilder.jpa1;

import javax.persistence.Entity;

import net.sf.esfinge.querybuilder.exception.EntityClassNotFoundException;
import net.sf.esfinge.querybuilder.methodparser.EntityClassProvider;
import net.sf.esfinge.querybuilder.utils.ServiceLocator;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class JPAEntityClassProvider implements EntityClassProvider {

    private Map<String, Class> classMap = new HashMap<String, Class>();

	@Override
	public Class<?> getEntityClass(String name) {
		EntityManagerProvider emp = ServiceLocator.getServiceImplementation(EntityManagerProvider.class);
            try {
                    Class<?> forName = Class.forName(name);
                    if (forName.isAnnotationPresent(Entity.class)) {
                        return forName;
                    }
            } catch (ClassNotFoundException ex) {
                //throw new EntityClassNotFoundException(ex.getMessage());
            }
		return null;
	}

    @Override
    public Class<?> getEntityClass(Method m, String name) {
        try {
            Class<?> clazz = Class.forName(m.getReturnType().getName());
            String entityName = clazz.getName().substring(clazz.getName().lastIndexOf(".")+1);
            if (clazz.isAnnotationPresent(Entity.class) && entityName.equals(name)) {
                return clazz;
            }
        } catch (ClassNotFoundException ex) {
            //throw new EntityClassNotFoundException(ex.getMessage());
        }
        return null;
    }

}
