package objects;

public class Classes {
	
	protected String className;
	protected String classTreiner;
	protected String classCapacity;
	protected String classDescription;
	protected String classDuration;
	
	public Classes() {
		
	}
	
	public void setClassName(String className) {
		this.className = className; 
	}
	
	public void setClassDuration(String classDuration) {
		this.classDuration = classDuration; 
	}
	
	public void setClassDescription(String ClassDescription) {
		this.classDescription = ClassDescription;
	}
	
	public void setClassTreiner(String classTreiner) {
		this.classTreiner = classTreiner; 
	}
	
	
	public void setClassCapacity(String classCapacity) {
		this.classCapacity = classCapacity; 
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public String getClassTreiner() {
		return this.classTreiner;
	}
	
	public String getClassCapacity() {
		return this.classCapacity;
	}
	
	public boolean checkClassCapacity(int amountMember) {
		boolean classcheck = false;
		if(amountMember <= Integer.parseInt(this.classCapacity)) {
			classcheck = true;
		}
		return classcheck;
	}
	
	public String getClassDuration() {
		return this.classDuration;
	}
	
	public String getClassDescription() {
		return this.classDescription;
	}
}