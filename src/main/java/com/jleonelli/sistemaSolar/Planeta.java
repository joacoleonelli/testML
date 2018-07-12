package com.jleonelli.sistemaSolar;

public class Planeta {

  private Integer distanciaSol;
  private Integer velocidadAngular;
  private Integer posicionInicial;
  
  public Planeta(Integer distanciaSol, Integer velocidadAngular, Integer posicionInicial) {
    super();
    this.distanciaSol = distanciaSol;
    this.velocidadAngular = velocidadAngular;
    this.posicionInicial = posicionInicial;
  }
  public Integer getDistanciaSol() {
    return distanciaSol;
  }
  public void setDistanciaSol(Integer distanciaSol) {
    this.distanciaSol = distanciaSol;
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
