package test;
import clases.Instalador;

public class Main {

	public static void main(String[] args) {
		Instalador instalador = new Instalador(150);
		
		instalador.instalar("WhatsApp", 50, "2019-11-15 15:00:00"); // instalar
		instalador.instalar("Instagram", 70, "2019-11-20 12:15:30"); // instalar
		instalador.instalar("WhatsApp", 45, "2019-11-14 15:00:00"); // no se pudo instalar
		instalador.instalar("Twitter", 100, "2019-11-13 12:00:00"); // tamaño insuficiente
		instalador.instalar("WhatsApp", 10, "2019-11-17 15:00:00"); //Actualizar

	}

}
