package Part5;

public class Arhive {
	String name, identifier;
	public Arhive(String name, String identifier) {
		this.name = name;
		this.identifier = identifier;
	}
	public String getIdentifier() {
		return identifier;
	}
	public String getName() {
		return name;
	}
	 @Override
	    public boolean equals(Object compared){
	        if(this == compared) {
	            return true;
	        }
	        if(!(compared instanceof Arhive)){
	            return false;
	        }
	        
	        Arhive comparedItem = (Arhive) compared;
	        
	        return this.identifier.equals(comparedItem.identifier);
	    }
}
