package Clases;

import javax.swing.JOptionPane;

public class Dinero_Cambio{
	double equivalencia;
	
	String entrada;
	String salida;
	
	public Dinero_Cambio() {
		
	}

	private Object[] comboMenu_1 = {"------------","Soles a Dolar","Soles a Euro","Soles a Pesos Mex.","Soles a Yen","Dolar a Soles","Euro a Soles","Pesos Mex. a Soles","Yen a soles"};
	
	
	public int getOpcionMenu() {
		int op=0;
		String aux;
		try {
			aux=(String)JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio", "Menu de Moneda de Cambio", JOptionPane.INFORMATION_MESSAGE,null ,comboMenu_1 , 0);
			switch (aux) {
			case "------------":
				op=1;
				break;
			case "Soles a Dolar":
				op=2;
				this.equivalencia=3.83;
				entrada="sole(s)";
				salida="dolare(s)";
				break;
			case "Soles a Euro":
				op=3;
				this.equivalencia=4.06;
				
				entrada="sole(s)";
				salida="euro(s)";
				break;
			case "Soles a Pesos Mex.":
				op=4;
				this.equivalencia=0.19;
				entrada="sole(s)";
				salida="peso(s) Mx";
				
				break;
			case "Soles a Yen":
				op=5;
				this.equivalencia=0.028;
				
				entrada="sole(s)";
				salida="yene(s)";
				break;
			case "Dolar a Soles":
				op=6;
				this.equivalencia=0.26;
				
				entrada="dolare(s)";
				salida="sole(s)";
				break;
			case "Euro a Soles":
				op=7;
				this.equivalencia=0.25;
				
				break;
			case "Pesos Mex. a Soles":
				op=8;
				this.equivalencia=5.17;
				
				entrada="peso(s) Mx";
				salida="sole(s)";
				break;
			case "Yen a soles":
				op=9;
				this.equivalencia=35.69;
				
				entrada="yene(s)";
				salida="sole(s)";
				break;
			}
		} catch (NullPointerException e) {
			op=10;
		}
		
		return op;
	}
	
	public double obtenerMonedaAcambiar() {
		double moneda;
		moneda = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero en "+entrada+" a cambiar :").toString());
		return moneda;
	}
	
	public double obtenerElCambio(double moneda) {
		double cambio = moneda*equivalencia;
		return cambio;
	}
	
	public void mensaje(double cambio) {
		JOptionPane.showMessageDialog(null, "El Tipo de Cambio es "+cambio+" "+salida);
	}
	
	public double obtenerTipoDeCambio() {
		double cambio=0.0;
		double moneda=0.0;
		
		do {
			int op=getOpcionMenu();
			if(op==10 || op==1) {
				
			}else {
				moneda=obtenerMonedaAcambiar();
				cambio=obtenerElCambio(moneda);
				break;
			}
			
		} while (true);
		
		return cambio;
	}

	
	
	
}
