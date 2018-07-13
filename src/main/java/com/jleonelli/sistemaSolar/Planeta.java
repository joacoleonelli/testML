package com.jleonelli.sistemaSolar;

public class Planeta {

  private Integer distanciaSol;
  private String sentidoDeGiro;
  private Integer velocidadAngular;
  private Integer posicionInicial;
  
  public Planeta(Integer distanciaSol, String sentidoDeGiro, Integer velocidadAngular, Integer posicionInicial) {
    super();
    this.distanciaSol = distanciaSol;
    this.sentidoDeGiro = sentidoDeGiro;
    this.velocidadAngular = velocidadAngular;
    this.posicionInicial = posicionInicial;
  }
  public Integer getDistanciaSol() {
    return distanciaSol;
  }
  public void setDistanciaSol(Integer distanciaSol) {
    this.distanciaSol = distanciaSol;
  }
  public String getSentidoDeGiro() {
    return sentidoDeGiro;
  }
  public void setSentidoDeGiro(String sentidoDeGiro) {
    this.sentidoDeGiro = sentidoDeGiro;
  }
  public Integer getVelocidadAngular() {
    return velocidadAngular;
  }
  public void setVelocidadAngular(Integer velocidadAngular) {
    this.velocidadAngular = velocidadAngular;
  }
  public Integer getPosicionInicial() {
    return posicionInicial;
  }
  public void setPosicionInicial(Integer posicionInicial) {
    this.posicionInicial = posicionInicial;
  }
  
}
