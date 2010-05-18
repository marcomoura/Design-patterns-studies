
public class PresidentConferenceWorld{
	
	public static void main(String args[]){
		President obama = new AmericanPresident();
		obama.performGreeting();
		
		President peron = new SpanishPresident();
		peron.performGreeting();

		President lula = new PortuguesePresident();
		lula.performGreeting();
	}
	
}