package tme27;
public abstract class Recette{
	private double prix;
	private String nom ;
	private Ingredient[] tab;
	private double t[];
	private int i;// correspend au num de la recette sur la mahine par exemple 1 c'est du café .....
	
    public Recette(int i,int n,int m,double prix,String nom){
    	this.i=i;
    	tab =new Ingredient[n];
    	t=new double[m];
    	this.prix=prix;
    	this.nom=nom;
    }
    
    public Ingredient[] getTabIngredient(){
    	return tab ;
    }
	
    public int getNum(){
    	return i;
    }
    public String getNom(){
    	return nom;
    }
    public double getPrix(){
    	return prix;
    }
    
   
    
    
}
	
	