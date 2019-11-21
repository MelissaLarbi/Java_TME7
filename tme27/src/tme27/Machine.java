package tme27;

import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
	// les attributs

	protected ArrayList<Recette> rec;
	protected ArrayList<Reservoir> rez;
	protected double credit;
	protected int id;
	public static int cpt = 0;

	public Machine() {
		cpt = cpt++;
		id = cpt;
	}

	public void ajouteReservoir(Reservoir r) {
		rez.add(r);
	}

	public void ajouteRecette(Recette r) {
		rec.add(r);
	}

	public void jouterCredit(double d) {
		credit = d;
	}

	public void rendreMonnaie() {
		credit = 0;
	}

	public void remplir() {
		for (Reservoir reservoir : rez) {
			reservoir.remplir();
		}
	}

	private Reservoir trouverReservoir(Ingredient i) {
		for (Reservoir reservoir : rez) {
			if (reservoir.getIngredient() == i) {
				return reservoir;
			}
		}
		return null;
	}

	// on a declarer la methode trouverReservoir comme private pour securiser les
	// reservoir de la machine c'est à dire qu'on peut pas acceder a cette methode
	// en dehors de la classe machine
	// car on a pas besoin

	private Recette getRecette(int n) {
		// renvoie la recette qui correspond au n null sinon
		for (Recette recette : rec) {
			if (recette.getNum() == n) {
				return recette;
			}
		}
		return null;
	}

	public boolean checkup() {
		for (Recette recette : rec) {
			for (Ingredient ingredient : recette.getTabIngredient()) {
				Reservoir r = trouverReservoir(ingredient);
				if (r == null || r.getNiveau() < 0) {
					return false;
				}
			}
			System.out.println(recette.getNom() + ": OK");
		}
		return true;
	}

	public boolean commander(int i) {
		Recette recette = getRecette(i);
		if (recette == null){
			System.out.println("séléctionnez un numéro valide");
		} else {
			System.out.println("vous avez séléctionnez" + recette.getNom());
			if (!checkup()){
				System.out.println("Service indisponible !! ressaiez ultérieurement ");
			} else {
				System.out.println("service en cours veillez patienter");
				System.out.println("veillez enter le monton:" + recette.getPrix());
				Scanner sc = new Scanner(System.in);
				double p = sc.nextDouble();
				if (p < recette.getPrix()) {
					System.out.println("monton insiffisant");
				}else{
					jouterCredit(p);
					System.out.println("vous commande est en cour de préparation ");
					System.out.println("servez vous et n'oubliez pas votre monnaie");
					rendreMonnaie();
				}
			}
		}
		return false;
	}

}
