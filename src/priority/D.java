package priority;
public class D extends Letter{
	
	public void plus() {
		this.number ++ ;
	}

	public D(int priority){
		this.setPriority(priority);
	}
}