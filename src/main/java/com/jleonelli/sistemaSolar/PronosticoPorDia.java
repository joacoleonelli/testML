package com.jleonelli.sistemaSolar;

public class PronosticoPorDia {

  private String dia; // dia numero
  private String clima; // lluvia o seco o condicion optima
  private String esPicoMaximoLluvia;

  public String getDia() {
    return dia;
  }
  public void setDia(String dia) {
    this.dia = dia;
  }
  public String getClima() {
    return clima;
  }
  public void setClima(String clima) {
    this.clima = clima;
  }
  public String getEsPicoMaximoLluvia() {
    return esPicoMaximoLluvia;
  }
  public void setEsPicoMaximoLluvia(String esPicoMaximoLluvia) {
    this.esPicoMaximoLluvia = esPicoMaximoLluvia;
  }
}
