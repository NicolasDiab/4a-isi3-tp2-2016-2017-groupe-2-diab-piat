package arbreBinaire;

import visiteur.Visiteur;

import java.util.OptionalInt;

public abstract class OperateurBinaire  extends OperateurUnaire {

	private Noeud opD;
	
	public OperateurBinaire(String s,Noeud ng,Noeud nd){
		super(s,ng);
		opD=nd;
	}
	
	public Noeud getOperateurDroit(){
		return opD;
	}

	public OptionalInt accept(Visiteur v){
		return v.visiterBinaire(this);
	}


}
