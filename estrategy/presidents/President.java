

public abstract class President{
	
	IdiomBehavior idiom;
	
	public void setIdiomBehavior(IdiomBehavior language){
		idiom = language;
	}
	
	public void performGreeting(){
		idiom.greetings();
	}
}





