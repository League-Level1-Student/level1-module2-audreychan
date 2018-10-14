
public class TeaParty {
	
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
    public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
    	this.name = name;
    	this.isWoman = isWoman;
    	this.isKnighted = isKnighted;
    	
    	if(isWoman && isKnighted) {
    		return "Hello Lady " + name;
    	}
    	else if(isWoman && isKnighted == false) {
    		return "Hello Ms. " + name;
    	}
    	else if(isWoman == false && isKnighted) {
    		return "Hello Sir " + name;
    	}
    	else if(isWoman == false && isKnighted == false) {
    		return "Hello Mr. " + name;
    	}
		return null;
    	
    	
    }
    
}
