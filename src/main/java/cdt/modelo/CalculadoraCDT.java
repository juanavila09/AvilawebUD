package cdt.modelo;

import java.io.Serializable;

/**
 * Lógica de negocio del simulador de CDT.
 * Encapsula las fórmulas financieras necesarias para calcular la rentabilidad
 * de un Certificado de Depósito a Término. Es independiente de la vista y del
 * controlador, lo que permite ser probada y reutilizada de forma aislada.
 */
public class CalculadoraCDT implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Año comercial usado en cálculos financieros (360 días). */
	private static final double ANIO_COMERCIAL = 360;

	/** Tasa del Gravamen a los Movimientos Financieros (4 x 1000 sobre la ganancia). */
	private static final double TASA_IMPUESTO = 0.04;

	/**
	 * Calcula los valores derivados del CDT a partir de la inversión, el interés
	 * y el plazo, y los asigna al objeto recibido.
	 *
	 * @param cdt CDT con los datos de entrada (inversion, interes, plazo)
	 */
	public void calcular(CDT cdt) {
		double ganancia = calcularGanancia(cdt.getInversion(), cdt.getInteres(), cdt.getPlazo());
		double impuesto = calcularImpuesto(ganancia);
		double valorFuturo = cdt.getInversion() + ganancia;

		cdt.setGanancia(ganancia);
		cdt.setImpuesto(impuesto);
		cdt.setValorFuturo(valorFuturo);
	}

	/**
	 * Calcula la ganancia bruta del CDT.
	 * Fórmula: ganancia = inversion * (interes * (plazo / 360))
	 */
	public double calcularGanancia(double inversion, double interes, double plazo) {
		return inversion * (interes * (plazo / ANIO_COMERCIAL));
	}

	/**
	 * Calcula el impuesto del 4% aplicado sobre la ganancia.
	 */
	public double calcularImpuesto(double ganancia) {
		return ganancia * TASA_IMPUESTO;
	}
}
