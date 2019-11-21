package tme27;

public class WMarchandise extends Wagon{
	
	// les attributs 
	private double poid;
	
	public WMarchandise(int nb,int num,String mar,double p) {
		super(num,mar,nb);
		poid=p;
	}
	
	public String toString() {
		return "je suis un wagon de marchandise : "+numSerie+"marque : "+marque+"dont le poids est:"+poid+"\n";
	}

    public double getPoid(){
    	return poid;
    }
	
}