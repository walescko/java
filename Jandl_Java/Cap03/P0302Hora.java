package com.company.Jandl_Java.Cap03;

public class P0302Hora {

	private int hora, minuto, segundo;

	public int getHoras() {
		return hora;
	}

	public int getMinutos() {
		return minuto;
	}

	public int getSegundos() {
		return segundo;
	}

	public void setHoras(int h) {
		if (h > 0 && h < 24) {
			hora = h;
		}
	}

	public void setMinutos(int m) {
		if (m > 0 && m < 60) {
			minuto = m;
		}
	}

	public void setSegundos(int s) {
		if (s > 0 && s < 60) {
			segundo = s;
		}
	}
	public void setHorario(int h, int m, int s){
		setHoras(h); setMinutos(m); setSegundos(s);
	}
	public String toString(){
		return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
	}
	

}
