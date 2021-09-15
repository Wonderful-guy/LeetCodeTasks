class Help{
	void helpon(int what){	
		switch (what){
			case '1':
			System.out.println("Operator If:");
			System.out.println("if (condition) operator;");
			System.out.print("else operator");
			break;
			case '2':		
			System.out.println("Operator Switch:");
			System.out.println("switch (expression)");
			System.out.print("{");
			System.out.println("case const:");
			System.out.println("operator sequance ");
			System.out.println("break;");
			System.out.println("//...");		
			System.out.println("}");				
			break;
			case '3':
			System.out.println("Operator for:");
			System.out.println("for(init; condition; iteration)");
			System.out.println("operator;");
			break;
			case '4':
			System.out.println("Operator while:\n");
			System.out.println("while(condition) operator;");
			break;
			case '5':
			System.out.println("Operator do-while:\n");
			System.out.println("do {");
			System.out.println(" operator;");
			System.out.println("} while (condition);");
			break;
			case '6':
			System.out.println("Operator break:\n");
			System.out.println("break; or break mark;");
			break; 
			case '7':
			System.out.println("Operator continue:\n");
			System.out.println("continue; or continue mark;");
			break;  
		}
		
		System.out.println();
	}
	
	
	void showmenu(){
		System.out.println("About");
		System.out.println("1. If");
		System.out.println("2. Switch");
		System.out.println("3. For");
		System.out.println("4. While");
		System.out.println("5. Do-While");
		System.out.println("6. Break");
		System.out.println("7. Continue");
		System.out.println("q - Exit");
	}
	
	boolean isvalid(int ch){
		if (( ch < '1' | ch > '7' ) & ch != 'q') 
		return false;
		else 
		return true;
	}
}

class HelpClassDemo{
	public static void main(String args[])
	throws java.io.IOException {
		char choice, ignore;
		
		Help hp = new Help();
		
		for (;;){	
			do{
				hp.showmenu();
				System.out.println();
				choice = (char) System.in.read();
				
				do  {
					ignore = (char) System.in.read();
				} 
				while(ignore != '\n');				
			}
			while( !hp.isvalid(choice) );
			
			if (choice == 'q') break;
			hp.helpon(choice);
			System.out.println();
			
		}		
	}
}		