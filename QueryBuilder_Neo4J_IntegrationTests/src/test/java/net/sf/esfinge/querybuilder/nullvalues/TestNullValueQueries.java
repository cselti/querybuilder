package net.sf.esfinge.querybuilder.nullvalues;

import java.util.List;

import net.sf.esfinge.querybuilder.annotation.CompareToNull;
import net.sf.esfinge.querybuilder.annotation.IgnoreWhenNull;
import net.sf.esfinge.querybuilder.annotation.Starts;
import net.sf.esfinge.querybuilder.neo4j.testresources.Person;

public interface TestNullValueQueries {
	
	public List<Person> getPersonByName(@CompareToNull String name);
	public List<Person> getPersonByLastName(@CompareToNull String lastname);
	public List<Person> getPersonByNameAndLastName(@Starts String name, @CompareToNull String lastname);
	public List<Person> getPersonByAgeGreater(@IgnoreWhenNull Integer age);
	public List<Person> getPersonByNameStartsAndLastNameStarts(@IgnoreWhenNull String name, @IgnoreWhenNull String lastname);

}
