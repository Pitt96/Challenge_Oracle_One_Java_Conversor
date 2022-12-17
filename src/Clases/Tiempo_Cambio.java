package Clases;

import javax.swing.JOptionPane;

public class Tiempo_Cambio {
	double equivalencia;
	String entrada;
	String salida;
	private Object[] comboMenu_2= {"------------","Segundos a Minutos","Segundos a Horas","Minutos a Segundos","Minutos a Horas","Horas a Segundos","Horas a Minutos"};

	public Tiempo_Cambio() {
	}
	
	public int getOpcionMenu() {
		int op=0;
		String aux;
		try {
			aux=(String)JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio", "Menu de Tiempo", JOptionPane.INFORMATION_MESSAGE,null ,comboMenu_2 , 0);
			switch (aux) {
			case "------------":
				op=1;
				break;
			case "Segundos a Minutos":
				op=2;
				equivalencia=60;
				entrada = "Segundo(s)";
				salida = "Minuto(s)";
				break;
			case "Segundos a Horas":
				op=3;
				equivalencia=3600;
				entrada = "Segundo(s)";
				salida = "Hora(s)";
				break;
			case "Minutos a Segundos":
				op=4;
				equivalencia=60;
				entrada = "Minuto(s)";
				salida = "Segundo(s)";
				break;
			case "Minutos a Horas":
				op=5;
				equivalencia=60;
				entrada = "Minuto(s)";
				salida = "Hora(s)";
				break;
			case "Horas a Segundos":
				op=6;
				equivalencia=3600;
				entrada = "Hora(s)";
				salida = "Segundo(s)";
				break;
			case "Horas a Minutos":
				op=7;
				equivalencia=60;
				entrada = "Hora(s)";
				salida = "Minuto(s)";
				break;
			}
		} catch (NullPointerException e) {
			op=0;
		}
		return op;
	}
	
	public double obtenerDatoEntrada() {
		double dato;
		dato = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de "+entrada+" : ").toString());
		return dato;
	}
	
	public double obtenerElCambio(double dato,int op) {
		double cambio = 0;
		if(op==2 || op==5 || op==3) {
			cambio=dato/equivalencia;
		}else {
			cambio=dato*equivalencia;
		}
		return cambio;
	}
	
	public void mensaje(double cambio) {
		JOptionPane.showMessageDialog(null, "Como salida tenemos : "+cambio+" "+salida);
	}
	
	public double obtenerTipoDeCambio() {
		double cambio=0.0;
		double tiempo=0.0;
		do {
			int op=getOpcionMenu();
			if(op>1) {
				tiempo=obtenerDatoEntrada();
				cambio=obtenerElCambio(tiempo, op);
				break;
			}
		} while (true);
		
		return cambio;
	}
}
