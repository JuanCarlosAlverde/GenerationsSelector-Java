
import java.util.Calendar;
import java.util.Scanner;
public class GenerationsSelector {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("D�me t� sexo: (h/m)");

		String sexoInput = scanner.next();
		String sexo = sexoInput.equalsIgnoreCase("h") ? "Hombre":"Mujer";
		if(sexoInput.equalsIgnoreCase("h")){
			sexo = "hombre";
		}else {
			sexo = "mujer";
		}
		System.out.print("D�me t� edad:");
		int edad = scanner.nextInt();

		Calendar calendarioActual = Calendar.getInstance();

		calendarioActual.add(Calendar.YEAR, (int) -edad);
		int anioDeNacimiento = calendarioActual.get(Calendar.YEAR);
		String generacion = "";
		if ((anioDeNacimiento >= 1925)&&(anioDeNacimiento <= 1945)) {
			generacion = "Perteneces a la generaci�n del silencio";
		}else if ((anioDeNacimiento >= 1946)&&(anioDeNacimiento <= 1964)) {
			generacion = "Perteneces a la generaci�n baby boomers";
		}else if ((anioDeNacimiento >= 1965)&&(anioDeNacimiento <= 1979)) {
			generacion = "Perteneces a la generaci�n X";
		}else if ((anioDeNacimiento >= 1980)&&(anioDeNacimiento <= 2000)) {
			generacion = "Perteneces a la generaci�n Milennials";
		}else if ((anioDeNacimiento >= 2000)) {
			generacion = "Perteneces a la generaci�n Z";
		}else {
			generacion = "Wow! Perteneces a una generaci�n desconocida!";
		}

		System.out.println("Usted naci� en el a�o: " + anioDeNacimiento +
				", eres: "+sexo+". "+generacion);
	}
}