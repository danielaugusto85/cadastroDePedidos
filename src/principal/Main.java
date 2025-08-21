package principal;

import controllers.PedidoController;

public class Main {

	public static void main(String[] args) {
		
		//Instanciando a classe de controle
		var pedidoController = new PedidoController();
		
		//Executando o cadastro do pedido
		pedidoController.realizarCadastro();
		


	}

}
