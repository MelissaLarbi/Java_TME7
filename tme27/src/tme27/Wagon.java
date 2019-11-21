package tme27;

public abstract class Wagon extends ElemTrain {
	// les attribut 
	protected int nbPorte ;
	
	public Wagon(int num,String m,int n){
		super(num,m);
		nbPorte=n;
	}
	
	
	
	public abstract String toString();
 
    }
