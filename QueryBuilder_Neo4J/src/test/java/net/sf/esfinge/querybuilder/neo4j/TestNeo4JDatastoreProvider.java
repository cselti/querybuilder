package net.sf.esfinge.querybuilder.neo4j;

import net.sf.esfinge.querybuilder.annotation.ServicePriority;
import net.sf.esfinge.querybuilder.neo4j.dynamic.Address;
import net.sf.esfinge.querybuilder.neo4j.dynamic.Person;
import net.sf.esfinge.querybuilder.neo4j.oomapper.Neo4J;

@ServicePriority(0)
public class TestNeo4JDatastoreProvider implements DatastoreProvider{
	
	private static final Neo4J neo4j = new Neo4J();
	
	public TestNeo4JDatastoreProvider(){
		neo4j.map(Person.class);
		neo4j.map(Address.class);
	}

	@Override
	public Neo4J getDatastore() {
		return neo4j;
	}

}
