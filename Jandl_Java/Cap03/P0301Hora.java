package JandlJrCap03;

public class P0301Hora {
	public int hora, minuto, segundo;
	//metodo de entrada 
	public void setHorario(int h, int m, int s) {
		hora = h;
		minuto = m;
		segundo = s;
		
	}
	//metodo de saida
	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}
}
