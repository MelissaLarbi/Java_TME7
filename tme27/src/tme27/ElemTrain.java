package tme27;

public abstract class ElemTrain {
	// les attribut 
	protected int numSerie;
	protected String marque;
	
		public ElemTrain(int num,String mar){
			numSerie=num;
			marque=mar;
		}
	 
	protected int getSerie(){
		return numSerie;
	}
	

}