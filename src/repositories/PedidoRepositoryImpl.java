package repositories;

import entities.Pedido;
import factories.ConnectionFactory;
import interfaces.PedidoRepository;

public class PedidoRepositoryImpl implements PedidoRepository {

	// Atributo
	private ConnectionFactory connectionFactory = new ConnectionFactory();

	@Override
	public void inserir(Pedido pedido) {

		try {

			var connection = connectionFactory.getConnection();

			var sql = """
						insert into pedido(id, nomecliente, datapedido, valor, descricao)
						values(?,?,?,?,?)
					""";

			var statement = connection.prepareStatement(sql);
			statement.setObject(1, pedido.getId());
			statement.setString(2, pedido.getNomeCliente());
			statement.setDate(3, java.sql.Date.valueOf(pedido.getDataPedido()));
			statement.setDouble(4, pedido.getValor());
			statement.setString(5, pedido.getDescricao());
			statement.execute();

			connection.close();

			System.out.println("\nPedido cadastrado com sucesso!");

		} catch (Exception e) {
			System.out.println("\nFalha ao inserir pedido: " + e.getMessage());
		}

	}

}
