package JandlJrCap03;

public class P0301 {
	public static void main(String[] args) {
		
		P0301Hora inicio = new P0301Hora();
		inicio.setHorario(12, 45, 38);
		
		System.out.println("Inicio: "+ inicio.toString());

		System.out.println(" ------ ");

		P0302Hora horario = new P0302Hora();
		horario.setHoras(28);
		horario.setMinutos(54);
		horario.setSegundos(63);

		System.out.println(horario.toString());
	}

}
