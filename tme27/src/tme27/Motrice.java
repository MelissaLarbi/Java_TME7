package tme27;
public class Motrice extends ElemTrain{
	// les attriburs 
	private double puissance;
	
	public Motrice(double p,String mar,int num) {
		super(num,mar);
		puissance=p;
		
	}
	
	public String toString(){
		
		return "la motrice numero de serie = "+numSerie +"marque :" +marque+"de puissance"+puissance+"\n";
		
	}

}