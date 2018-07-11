package com.jleonelli.sistemaSolar;

import java.util.HashMap;
import java.util.Map;

public class SistemaSolarService {
	
	/**
	 * 
	 * @param distanciaSol
	 * 			radio/distancia del planeta al origen/sol. 
	 * @param velocidadAngular
	 * 			cantidad de grados por dia.
	 * @param tiempo
	 * 			año para el cual se calcula la posición.
	 * @param posicionInicial
	 * 			ángulo de posición inicial.
	 * @return Mapa con coordenadas x, y que designan la posición del planeta.
	 */
	public Map<String, Integer> calcularPosicionPlaneta(Integer distanciaSol, Integer velocidadAngular, Integer tiempo, Integer posicionInicial){
		
		Integer x = (int) (distanciaSol * Math.cos(velocidadAngular * tiempo + posicionInicial));
		Integer y = (int) (distanciaSol * Math.sin(velocidadAngular * tiempo + posicionInicial));
		
		Map<String, Integer> posicionPlaneta = new HashMap<String, Integer>();
		posicionPlaneta.put("x", x);
		posicionPlaneta.put("y", y);
		
		return posicionPlaneta;
	}
	
	/**
	 * 
	 * 
	 * @param elemento1
	 * 			posicion planeta1 o Sol
	 * @param elemento2
	 * 			posicion planeta2 o Sol
	 * @param elemento3
	 * 			posicion planeta3 o Sol
	 * @return True si los 3 elementos estan alineados, False si no estan alineados. 
	 */
	public boolean calcularAlineacion(Map<String, Integer> elemento1, Map<String, Integer> elemento2, Map<String, Integer> elemento3) {
		Integer elemento1X = elemento1.get("x");
		Integer elemento1Y = elemento1.get("y");
		
		Integer elemento2X = elemento2.get("x");
		Integer elemento2Y = elemento3.get("y");
		
		Integer elemento3X = elemento3.get("x");
		Integer elemento3Y = elemento3.get("y");
		
		
		return (elemento2Y - elemento1Y) * (elemento3X - elemento2X) == (elemento3Y - elemento2Y) * (elemento2X - elemento1X);
	}
	
	/**
	 * 
	 * @param elemento1
	 * @param elemento2
	 * @param elemento3
	 * @return Perimetro del triángulo.
	 */
	public Float calcularPerimetroTriangulo(Map<String, Integer> planeta1, Map<String, Integer> planeta2, Map<String, Integer> planeta3) {
		Float distanciaPlaneta12 = calcularDistanciaPlanetas(planeta1, planeta2);
		Float distanciaPlaneta23 = calcularDistanciaPlanetas(planeta2, planeta3);
		Float distanciaPlaneta13 = calcularDistanciaPlanetas(planeta1, planeta3);
		return distanciaPlaneta12 + distanciaPlaneta23 + distanciaPlaneta13;
	}
	
	/**
	 * 
	 * @param planeta1
	 * 			posicion planeta1.
	 * @param planeta2
	 * 			posicon planeta2.
	 * @return Distancia/Longitud de lado entre planeta1 y planeta2.
	 */
	public Float calcularDistanciaPlanetas(Map<String, Integer> planeta1, Map<String, Integer> planeta2) {
		Integer planeta1X = planeta1.get("x");
		Integer planeta1Y = planeta1.get("y");
		
		Integer planeta2X = planeta2.get("x");
		Integer planeta2Y = planeta2.get("y");
		
		Float distanciaPlanetas = (float) Math.sqrt(Math.pow(planeta2X - planeta1X, 2) + Math.pow(planeta2Y - planeta1Y, 2));
		return distanciaPlanetas;
	}
	
	/**
	 * 
	 * @param planeta1
	 * @param planeta2
	 * @param planeta3
	 * @param sol
	 * @return True si el sol esta dentro del triangulo, False si no esta dentro del triangulo. 
	 */
	public boolean calcularSolDentroTriangulo(Map<String, Integer> planeta1, Map<String, Integer> planeta2, Map<String, Integer> planeta3, Map<String, Integer> sol) {
		Float areaTrianguloPlanetas = calcularAreaTriangulo(planeta1, planeta2, planeta3);
		Float areaTrianguloPlaneta23Sol = calcularAreaTriangulo(sol, planeta2, planeta3);
		Float areaTrianguloPlaneta13Sol = calcularAreaTriangulo(planeta1, sol, planeta3);
		Float areaTrianguloPlaneta12Sol = calcularAreaTriangulo(planeta1, planeta2, sol);
		
		return (areaTrianguloPlanetas ==  areaTrianguloPlaneta23Sol + areaTrianguloPlaneta13Sol + areaTrianguloPlaneta12Sol);
	}
	
	/**
	 * 
	 * @param elemento1
	 * 			posicion planeta1 o Sol
	 * @param elemento2
	 * 			posicion planeta2 o Sol
	 * @param elemento3
	 * 			posicion planeta3 o Sol
	 * @return Area del triangulo formado por los 3 elementos.
	 */
	public Float calcularAreaTriangulo(Map<String, Integer> elemento1, Map<String, Integer> elemento2, Map<String, Integer> elemento3) {
		Integer elemento1X = elemento1.get("x");
		Integer elemento1Y = elemento1.get("y");
		
		Integer elemento2X = elemento2.get("x");
		Integer elemento2Y = elemento3.get("y");
		
		Integer elemento3X = elemento3.get("x");
		Integer elemento3Y = elemento3.get("y");
		
		Float area = (float) Math.abs((elemento1X * (elemento2Y - elemento3Y) + elemento2X * (elemento3Y - elemento1Y) + elemento3X * (elemento1Y - elemento2Y))/ 2);
		
		return area;
	}

}
