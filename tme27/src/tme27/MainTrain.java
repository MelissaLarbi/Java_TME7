package tme27;
public class MainTrain {

	public static void main(String[] args) {
		Motrice m=new Motrice(1000,"Samg",1024);
		WMarchandise wm=new WMarchandise(14,142,"lenovo",147);
		WVoyageur wv=new WVoyageur(40,15420,"hp",70);
		Train t=new Train(m);;
		t.ajouteWagon(wm);
		t.ajouteWagon(wv);
	    System.out.println(t.toString());
	    System.out.println("le poid treansporté par le train est"+t.poids());
	}
}
