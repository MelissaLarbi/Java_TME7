package tme27;
public class WVoyageur extends Wagon{
	
	// les attributs 
	private int nbPlace;
	
	// le constructeur 
	public WVoyageur(int nb,int num,String mar,int nbP){
		super(num,mar,nbP);
		nbPlace=nb;
	}
	
	public String toString() {
		return "je suis un wagon de voyageur : "+numSerie+"marque : "+marque +"dont le nombre de place est :"+nbPlace+"\n";
	}
	
	

}
