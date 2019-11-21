package tme27;
import java.util.ArrayList;

public class Train {
	private Motrice mot ;
	private ArrayList<Wagon> wg;
	
	public Train(Motrice m){
		mot=m;
		wg=new ArrayList<Wagon>();
	}
	
	public void ajouteWagon(Wagon w) {
		wg.add(w);
	}

	public String toString(){
		String ch=mot.toString();
	    for(Wagon w:wg){
			ch+=w.toString();
		}
		return ch ;
	}
	
	public double poids(){
		double pd=0;
		for(Wagon w:wg) {
			if(w instanceof WMarchandise){
				WMarchandise g=(WMarchandise)w;
				pd+=g.getPoid();
			}
		}
		return pd;
		
	}
}
