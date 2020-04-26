package ejercicios.ejercicio3.clases;

import ejercicios.ejercicio2.clases.Atleta;
import ejercicios.ejercicio2.clases.MinimoMultiple;

/**
 * La finalidad de esta clase no es otra que encapsular la declaracion del
 * Generic en una clase de declaracion mas simple para poder definir un array de
 * este tipo. Es como si fuese un "alias" de MinimoMultiple<Atleta>, porque esta
 * clase hereda completamente la API de MinimoMultiple, aunque ya declarando que
 * trabaja con atletas (solo podra tener atletas y clases que deriven de ella).
 */
public class MasRapidos extends MinimoMultiple<Atleta> {
}
