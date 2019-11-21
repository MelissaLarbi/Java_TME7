package tme27;

public abstract class Ingredient{
	protected String nom;

	public Ingredient(String n){
		nom=n;
	}
	
	public String toString(){
		return "je suis l'ingredient:" +nom;
	}
	
	public boolean equals(Object o){
		
	
		if(this==o){
			return true;
		}
		if(o==null){
			return false;
		}
		if(this.getClass()!=o.getClass()){
			return false;
		}
		Ingredient other=(Ingredient)o;
		if(this.getNom()==other.getNom()){
			return true;
		}		
	    return false;
	}
	
	public String getNom(){
		return nom;
	}
}
