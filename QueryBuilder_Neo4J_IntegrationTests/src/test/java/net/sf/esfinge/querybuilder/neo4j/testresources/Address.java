package net.sf.esfinge.querybuilder.neo4j.testresources;

import net.sf.esfinge.querybuilder.neo4j.oomapper.annotations.Id;
import net.sf.esfinge.querybuilder.neo4j.oomapper.annotations.Indexed;
import net.sf.esfinge.querybuilder.neo4j.oomapper.annotations.NodeEntity;

@NodeEntity
public class Address {
	
	@Id
	private int id;
	@Indexed
	private String city;
	@Indexed
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
