package App;


import javax.swing.JOptionPane;

import Clases.Dinero_Cambio;
import Clases.Tiempo_Cambio;

public class App {

	public static void main(String[] args) {
		Object[] comboMenu= {"------------","Conversor de moneda","Conversor de Tiempo","Salir"};
		JOptionPane.showMessageDialog(null, "Ingresando al Software de Conversion...");
		do {
			String op=(String)JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.INFORMATION_MESSAGE,null ,comboMenu , 0);
			if(op!=null) {
				if(op.equalsIgnoreCase("------------")) {
					JOptionPane.showMessageDialog(null, "Opcion no valida");
				}else if(op.equalsIgnoreCase("Conversor de moneda")){
					Dinero_Cambio claseD = new Dinero_Cambio();
					double cambio=claseD.obtenerTipoDeCambio();
					claseD.mensaje(cambio);
				}else if(op.equalsIgnoreCase("Conversor de Tiempo")){
					Tiempo_Cambio claseT = new Tiempo_Cambio();
					double tiempo = claseT.obtenerTipoDeCambio();
					claseT.mensaje(tiempo);
				}else if(op.equalsIgnoreCase("Salir")) {
					int resp = JOptionPane.showConfirmDialog(null, "¿DESEAR CERRAR EL CONVERSOR?", "Alerta!", JOptionPane.YES_NO_OPTION);
					if(resp==0) {
						JOptionPane.showMessageDialog(null, "Gracias por usar el Software...");
						break;
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "No se escogio una opcion");
			}
			
			
		} while (true);
		

	}

}
