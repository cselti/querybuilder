package net.sf.esfinge.querybuilder.neo4j.formaters;

import net.sf.esfinge.querybuilder.methodparser.formater.ParameterFormater;

public class ContainsParameterFormater implements ParameterFormater {

	@Override
	public Object formatParameter(Object param) {
		return "*"+param.toString()+"*";
	}

}
