package br.com.adapter;

public class TesteControleDePonto {

  public static void main(String[] args) throws InterruptedException {
    
/*ControleDePonto controleDePonto = new ControleDePonto ();
	Funcionario funcionario = new Funcionario (" Marcelo Martins ");
	controleDePonto . registraEntrada ( funcionario );
	Thread.sleep(5000);
	controleDePonto.registraSaida ( funcionario );*/
	  
    ControleDePontoAdapter controleDePonto = new ControleDePontoAdapter();
	  Funcionario funcionario = new Funcionario (" Marcelo Martins ");
	  controleDePonto.registraEntrada ( funcionario );
	  Thread.sleep (3000) ;
	  controleDePonto . registraSaida ( funcionario );	  
  
  }
}


