package jana60.valutazioni;

public class ClasseStudente {
	//attributi
	int idStudenti,percAssenze;
	double mediaVoti;
	
	//costruttore
	public ClasseStudente(int idStudenti,int percAssenze,double mediaVoti)
	{
		    super();
		    this.idStudenti =idStudenti;
		    this.percAssenze=percAssenze;
		    this.mediaVoti = mediaVoti;
	}
	
	//Metodi
	

	boolean esito() 
	{
		boolean esito;
	 if(percAssenze<25&&mediaVoti>=2) 
	 {
		 esito=true;
	 }
	 else if(percAssenze<50&&mediaVoti>2)
	 {
		  esito=true;
	 }
	 else
	 {
		  esito=false;
	 }
	 return esito;
	}
}
