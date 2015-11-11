package br.com.adapter;

public class ControleDePontoAdapter {
  private ControleDePontoNovo controleDePontoNovo ;

  public ControleDePontoAdapter () {
    this.controleDePontoNovo = new ControleDePontoNovo ();
  }
	
  public void registraEntrada ( Funcionario f) {
    this.controleDePontoNovo.registra (f, true );
  }
	
  public void registraSaida ( Funcionario f) {
    this.controleDePontoNovo.registra (f, false );
  }
}


