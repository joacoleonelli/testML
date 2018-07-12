package com.jleonelli.sistemaSolar;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SistemaSolarServiceTest {
  SistemaSolarService sistemaSolarService;
  
  @Before
  public void setup() {
    sistemaSolarService = new SistemaSolarService();
  }
  
  @Test
  public void testCalcularPosicionPlaneta() {
    Planeta planeta = new Planeta(500, 1, 90);
    Map<String, Integer> posicionPlaneta = sistemaSolarService.calcularPosicionPlaneta(planeta, 0);
    
    assertEquals(posicionPlaneta.get("x").intValue(), 0);
    assertEquals(posicionPlaneta.get("y").intValue(), 500);
  }
  
  @Test
  public void testCalcularAlineacion_True() {
    Map<String, Integer> posicionPlaneta1 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta2 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta3 = new HashMap<String, Integer>();
    
    posicionPlaneta1.put("x", 0);
    posicionPlaneta1.put("y", 500);
    
    posicionPlaneta2.put("x", 0);
    posicionPlaneta2.put("y", 2000);
    
    posicionPlaneta3.put("x", 0);
    posicionPlaneta3.put("y", 1000);
    
    boolean alineados = sistemaSolarService.calcularAlineacion(posicionPlaneta1, posicionPlaneta2, posicionPlaneta3);
    
    assertTrue(alineados);
  }
  
  @Test
  public void testCalcularAlineacion_False() {
    Map<String, Integer> posicionPlaneta1 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta2 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta3 = new HashMap<String, Integer>();
    
    posicionPlaneta1.put("x", 1);
    posicionPlaneta1.put("y", 500);
    
    posicionPlaneta2.put("x", 0);
    posicionPlaneta2.put("y", 2000);
    
    posicionPlaneta3.put("x", 0);
    posicionPlaneta3.put("y", 1000);
    
    boolean alineados = sistemaSolarService.calcularAlineacion(posicionPlaneta1, posicionPlaneta2, posicionPlaneta3);
    
    assertFalse(alineados);
  }
  
  @Test
  public void testCalcularDistanciaPlanetas() {
    Map<String, Integer> posicionPlaneta1 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta2 = new HashMap<String, Integer>();
    
    posicionPlaneta1.put("x", 1);
    posicionPlaneta1.put("y", 500);
    
    posicionPlaneta2.put("x", 0);
    posicionPlaneta2.put("y", 2000);
    
    Float distancia12 = sistemaSolarService.calcularDistanciaPlanetas(posicionPlaneta1, posicionPlaneta2);
    
    assertEquals(distancia12.intValue(), 1500);
  }
  
  @Test
  public void testCalcularAreaTriangulo() {
    Map<String, Integer> posicionPlaneta1 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta2 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta3 = new HashMap<String, Integer>();
    
    posicionPlaneta1.put("x", 1);
    posicionPlaneta1.put("y", 500);
    
    posicionPlaneta2.put("x", 0);
    posicionPlaneta2.put("y", 2000);
    
    posicionPlaneta3.put("x", 0);
    posicionPlaneta3.put("y", 1000);
    
    Float areaTriangulo = sistemaSolarService.calcularAreaTriangulo(posicionPlaneta1, posicionPlaneta2, posicionPlaneta3);
    assertTrue(areaTriangulo > 0);
  }
  
  @Test
  public void testCalcularSolDentroTriangulo_True() {
    Map<String, Integer> posicionPlaneta1 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta2 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta3 = new HashMap<String, Integer>();
    
    Map<String, Integer> sol = new HashMap<String, Integer>();
    
    posicionPlaneta1.put("x", 0);
    posicionPlaneta1.put("y", 500);
    
    posicionPlaneta2.put("x", 100);
    posicionPlaneta2.put("y", -500);
    
    posicionPlaneta3.put("x", -100);
    posicionPlaneta3.put("y", -500);
    
    sol.put("x", 0);
    sol.put("y", 0);
    
    boolean solAdentro = sistemaSolarService.calcularSolDentroTriangulo(posicionPlaneta1, posicionPlaneta2, posicionPlaneta3, sol);
    assertTrue(solAdentro);
  }
  
  @Test
  public void testCalcularSolDentroTriangulo_False() {
    Map<String, Integer> posicionPlaneta1 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta2 = new HashMap<String, Integer>();
    Map<String, Integer> posicionPlaneta3 = new HashMap<String, Integer>();
    
    Map<String, Integer> sol = new HashMap<String, Integer>();
    
    posicionPlaneta1.put("x", 0);
    posicionPlaneta1.put("y", 500);
    
    posicionPlaneta2.put("x", 100);
    posicionPlaneta2.put("y", 200);
    
    posicionPlaneta3.put("x", -100);
    posicionPlaneta3.put("y", 200);
    
    sol.put("x", 0);
    sol.put("y", 0);
    
    boolean solAdentro = sistemaSolarService.calcularSolDentroTriangulo(posicionPlaneta1, posicionPlaneta2, posicionPlaneta3, sol);
    assertFalse(solAdentro);
  }
}
