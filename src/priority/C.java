package priority;
public class C extends Letter{
	
	public void plus() {
		this.number ++ ;
	}
	
	public C(int priority){
		this.setPriority(priority);
	}

}