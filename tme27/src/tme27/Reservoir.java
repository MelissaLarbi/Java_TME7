package tme27;
public abstract class Reservoir {

  //les attributs
	Ingredient ing ;
	protected final double capacite;
	protected double niveau;
	private   final double  nivMax ;// on suppose ici que l'or de la creation on a le niveau =nivMax
	
	public Reservoir(Ingredient in,double capa,double niv){
		ing=in;
		capacite=capa;
		this.nivMax=niv;
		this.niveau=niv;
	}
	
	public Reservoir(double capa,double niv){
		capacite=capa;
		this.nivMax=niv;
		this.niveau=niv;
		
	}
	
	public Ingredient getIngredient(){
		return ing;
		}
	public double getNiveau(){
		return niveau;
	}
	public void remplir(){
		niveau=nivMax;
	}
	
	public void recupere(double qtt){
	RecuperationIngredientException e;
	double stat=Math.random();
	if(stat>1/1000){
      if(niveau>=qtt){
    	  niveau-=qtt;
      }		
      else{
    	  e=new RecuperationIngredientException("le niveau est insuffisant a la quantité demandée par le client");
    	  }
	}
	else{
		e=new RecuperationIngredientException("le reservoir a connu une défallance,il n'est pas capable de délivrer la commande");
		}
	}
}
	