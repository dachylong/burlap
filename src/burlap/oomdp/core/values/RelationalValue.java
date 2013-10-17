package burlap.oomdp.core.values;

import java.util.ArrayList;
import java.util.List;

import burlap.oomdp.core.Attribute;
import burlap.oomdp.core.Value;

public class RelationalValue extends Value {

	protected String		target;
	
	public RelationalValue(Attribute attribute){
		super(attribute);
		this.target = "";
	}
	
	public RelationalValue(Value v){
		super(v);
		RelationalValue rv = (RelationalValue)v;
		this.target = rv.target;
	}
	
	@Override
	public Value copy() {
		return new RelationalValue(this);
	}
	
	@Override
	public void setValue(int v) {
		throw new UnsupportedOperationException(new Error("Cannot set relation value to a value to an int value"));
	}

	@Override
	public void setValue(double v) {
		throw new UnsupportedOperationException(new Error("Cannot set relation value to a value to a double value"));
	}

	@Override
	public void setValue(String v) {
		this.target = v;
	}
	
	@Override
	public void addRelationalTarget(String t) {
		this.target = t;
	}
	
	@Override
	public void clearRelationTargets() {
		this.target = "";
	}

	@Override
	public int getDiscVal() {
		throw new UnsupportedOperationException(new Error("Value is relational, cannot return discrete value"));
	}

	@Override
	public double getRealVal() {
		throw new UnsupportedOperationException(new Error("Value is relational, cannot return real value"));
	}
	
	@Override
	public List<String> getAllRelationalTargets() {
		List <String> res = new ArrayList<String>();
		res.add(this.target);
		return res;
	}

	@Override
	public String getStringVal() {
		return this.target;
	}

	@Override
	public double getNumericRepresentation() {
		return 0;
	}

	

}
