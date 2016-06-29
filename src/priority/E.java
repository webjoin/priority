package priority;
public class E extends Letter{
	
	public void plus() {
		this.number ++ ;
	}
	
	public E(int priority){
		this.setPriority(priority);
	}

}