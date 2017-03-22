public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

	public void accept(Visiteur v){
		v.visiterAddition(this);
	}
	

}
