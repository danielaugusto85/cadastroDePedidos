package controllers;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import entities.Pedido;
import repositories.PedidoRepositoryImpl;

public class PedidoController {

	// Atributos da classe
	private Scanner scanner = new Scanner(System.in);

	/*
	 * Método para realizar o cadastro de um pedido
	 */
	public void realizarCadastro() {

		System.out.println("\nCADASTRO DE PEDIDOS: \n");

		var pedido = new Pedido(); // Criando um objeto da classe Pedido

		pedido.setId(UUID.randomUUID()); // Gerando um id único
		pedido.setDataPedido(LocalDate.now()); // Data atual do sistema

		System.out.println("NOME DO CLIENTE......:");
		pedido.setNomeCliente(scanner.nextLine());

		System.out.println("VALOR DO PEDIDO......:");
		pedido.setValor(Double.parseDouble(scanner.nextLine()));

		System.out.println("DESCRIÇÃO DO PEDIDO..:");
		pedido.setDescricao(scanner.nextLine());

		// Enviar para o banco de dados
		var pedidoRepository = new PedidoRepositoryImpl();
		pedidoRepository.inserir(pedido);

	}
}
