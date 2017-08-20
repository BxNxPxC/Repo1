package proyectito;

public class Mayor {
	
	private int primero;
	private int segundo;
	private int tercero;
	
	public Mayor(int primero, int segundo, int tercero){
		this.primero = primero;
		this.segundo = segundo;
		this.tercero = tercero;
	}
	
	public int esElMayor(){
		int mayor = primero;
	
		if(segundo > mayor)
			mayor = segundo;
		if (tercero > mayor)
			mayor = tercero;
		
		return mayor;
	}

}
