package less06_07;

public class Hunter extends Human{

	int killedMammonts = 0;
	
	 Hunter() {
		 
	}
	 Hunter(String name, int age){
		 super(name,age);
	 }
	
	void killMammont (){
		run();
		killedMammonts++;
		System.out.println(name+": Uhhhhr I kill "+killedMammonts+" mammonts");
		eat("mammont meat");
	}
	
	void walk(){
		super.run();
	}
	
	@Override
	void run(){
		System.out.println(name+": faster go-go-go!!!");
	}
	
	public String toString(){
		return "Hunter [name="+name+", age="+age+"]";
	}
}
