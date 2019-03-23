package Lambda1;

public class TestMain {

	public static void main(String[] args) {
		
		//ANNONYMUS INNER CLASS
		
		System.out.println(process("Hello World ARNAB",new Processor(){
			public String process(String s){
				return s.toLowerCase();
			}
		}));
		
		//LAMBDE EXPRESSION
/*
		System.out.println(process("Hello World",(String s) -> {
				return s.toLowerCase();
			}
		));*/
		

		//System.out.println(process("Hello World",(String s) ->	s.toUpperCase()));
		
		//System.out.println(process("Hello World",(s) ->	s.toUpperCase()));
	}

	private static String process(String s, Processor p) {
		
		return p.process(s);
	}
	
	@FunctionalInterface
	public interface Processor{
		public String process(String s);
	}

}
