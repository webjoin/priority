package priority;
public class B extends Letter{
	
	public B(int priority){
		this.setPriority(priority);
	}
	
	public void plus() {
		this.number ++ ;
	}

}
