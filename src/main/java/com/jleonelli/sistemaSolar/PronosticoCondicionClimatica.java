package com.jleonelli.sistemaSolar;

public class PronosticoCondicionClimatica {
  
  private Integer periodo;
  private Integer periodosDeSequia;
  private Integer periodosDeLluvia;
  private Integer diaDePicoMaximoDeLluvia;
  private Integer periodosDeCondicionesOptimas;
  public Integer getPeriodo() {
    return periodo;
  }
  public void setPeriodo(Integer periodo) {
    this.periodo = periodo;
  }
  public Integer getPeriodosDeSequia() {
    return periodosDeSequia;
  }
  public void setPeriodosDeSequia(Integer periodosDeSequia) {
    this.periodosDeSequia = periodosDeSequia;
  }
  public Integer getPeriodosDeLluvia() {
    return periodosDeLluvia;
  }
  public void setPeriodosDeLluvia(Integer periodosDeLluvia) {
    this.periodosDeLluvia = periodosDeLluvia;
  }
  public Integer getDiaDePicoMaximoDeLluvia() {
    return diaDePicoMaximoDeLluvia;
  }
  public void setDiaDePicoMaximoDeLluvia(Integer diaDePicoMaximoDeLluvia) {
    this.diaDePicoMaximoDeLluvia = diaDePicoMaximoDeLluvia;
  }
  public Integer getPeriodosDeCondicionesOptimas() {
    return periodosDeCondicionesOptimas;
  }
  public void setPeriodosDeCondicionesOptimas(Integer periodosDeCondicionesOptimas) {
    this.periodosDeCondicionesOptimas = periodosDeCondicionesOptimas;
  }
  
  
  public String toString() {
	  return "Para el pronostico de " + periodo + " años, habran: " + periodosDeSequia + " periodos de sequia, " + periodosDeLluvia
			  + " periodos de lluvia, con el dia numero " + diaDePicoMaximoDeLluvia + " el dia de pico "
			  + "maximo de lluvia y habra " + periodosDeCondicionesOptimas + " periodos de condiciones optimas de temp y presion.";
  }
  
}
