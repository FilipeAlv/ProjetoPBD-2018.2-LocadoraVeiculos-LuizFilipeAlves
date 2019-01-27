package br.com.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import br.com.model.beans.Pessoa;
import br.com.model.beans.PessoaFisica;
import br.com.model.dao.DAOPessoaFisica;
import br.com.util.Util.Criptografia;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	public static Scene sceneLogin, scenePrincipal, sceneNovaReserva, sceneConfigLocacao, sceneAddValorLocacao, sceneAlterarSenha;
	public static Scene sceneFuncionario, sceneReserva, sceneNovaCategoria, sceneNovaFilial, sceneNovoMotorista, sceneNovoCliente;
	public static Scene sceneNovoFuncionario, sceneNovoVeiculo, sceneNovoModelo, sceneNovaMarca, sceneVeiculo, sceneAddVeiculoLocacao;
	public static Scene sceneLocacao, sceneFinalizarLocacao, sceneCategoria, sceneCliente, sceneMotorista, sceneFilial;

	public static Stage stage, stageNovoFuncionario, stageNovoVeiculo, stageNovoModelo, stageNovaMarca, stageVeiculo;
	public static Stage stageNovaReserva, stageConfigLocacao, stageAddValorLocacao, stageAlterarSenha, stageFuncionario;
	public static Stage stageReserva, stageNovaCategoria, stageNovaFilial, stageNovoMotorista, stageNovoCliente, stageAddVeiculoLocacao;
	public static Stage stageLocacao, stageFinalizarLocacao, stageCategoria, stageCliente, stageFilial, stageMotorista;

	public static Pane telaPrincipal, telaLogin, telaNovaReserva, telaConfigLocacao, telaAddValorLocacao, telaAlterarSenha;
	private static Pane telaFuncionario, telaReserva, telaNovoMotorista, telaNovoCliente, telaNovaMarca, telaVeiculo;
	public static Pane  telaNovaCategoria, telaNovaFilial, telaNovoFuncionario, telaNovoVeiculo, telaNovoModelo, telaAddVeiculoLocacao;
	public static Pane telaLocacao, telaFinalizarLocacao, telaCliente, telaCategoria, telaMotorista, telaFilial;
	@Override
	public void start(Stage primaryStage) {
		try {
			telaLogin = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
			telaPrincipal = FXMLLoader.load(getClass().getResource("../view/Principal.fxml"));
			telaNovaReserva = FXMLLoader.load(getClass().getResource("../view/NovaReserva.fxml"));
			telaConfigLocacao = FXMLLoader.load(getClass().getResource("../view/ConfigLocacao.fxml"));
			telaAddValorLocacao =  FXMLLoader.load(getClass().getResource("../view/AddValorLocacao.fxml"));
			telaAlterarSenha = FXMLLoader.load(getClass().getResource("../view/AlterarSenha.fxml"));
			telaFuncionario = FXMLLoader.load(getClass().getResource("../view/Funcionario.fxml"));
			telaReserva = FXMLLoader.load(getClass().getResource("../view/Reserva.fxml"));
			telaNovaCategoria = FXMLLoader.load(getClass().getResource("../view/NovaCategoria.fxml"));
			telaNovaFilial = FXMLLoader.load(getClass().getResource("../view/NovaFilial.fxml"));
			telaNovoMotorista = FXMLLoader.load(getClass().getResource("../view/NovoMotorista.fxml"));
			telaNovoCliente = FXMLLoader.load(getClass().getResource("../view/NovoCliente.fxml"));
			telaNovoFuncionario = FXMLLoader.load(getClass().getResource("../view/NovoFuncionario.fxml"));
			telaNovoVeiculo = FXMLLoader.load(getClass().getResource("../view/NovoVeiculo.fxml"));
			telaNovoModelo = FXMLLoader.load(getClass().getResource("../view/NovoModelo.fxml"));
			telaNovaMarca = FXMLLoader.load(getClass().getResource("../view/NovaMarca.fxml"));
			telaVeiculo = FXMLLoader.load(getClass().getResource("../view/Veiculos.fxml"));
			telaAddVeiculoLocacao = FXMLLoader.load(getClass().getResource("../view/AddVeiculoLocacao.fxml"));
			telaLocacao = FXMLLoader.load(getClass().getResource("../view/Locacao.fxml"));
			telaFinalizarLocacao = FXMLLoader.load(getClass().getResource("../view/FinalizarLocacao.fxml"));
			telaCategoria = FXMLLoader.load(getClass().getResource("../view/Categoria.fxml"));
			telaFilial = FXMLLoader.load(getClass().getResource("../view/Filial.fxml"));
			telaMotorista = FXMLLoader.load(getClass().getResource("../view/Motorista.fxml"));
			telaCliente = FXMLLoader.load(getClass().getResource("../view/Cliente.fxml"));

			sceneLogin = new Scene(telaLogin);
			scenePrincipal = new Scene(telaPrincipal);
			sceneNovaReserva = new Scene(telaNovaReserva);
			sceneConfigLocacao = new Scene(telaConfigLocacao);
			sceneAddValorLocacao = new Scene(telaAddValorLocacao);
			sceneAlterarSenha = new Scene(telaAlterarSenha);
			sceneFuncionario = new Scene(telaFuncionario);
			sceneReserva = new Scene(telaReserva);
			sceneNovaCategoria = new Scene(telaNovaCategoria);
			sceneNovaFilial = new Scene(telaNovaFilial);
			sceneNovoMotorista = new Scene(telaNovoMotorista);
			sceneNovoCliente = new Scene(telaNovoCliente);
			sceneNovoFuncionario = new Scene(telaNovoFuncionario);
			sceneNovoVeiculo = new Scene(telaNovoVeiculo);
			sceneNovoModelo = new Scene(telaNovoModelo);
			sceneNovaMarca = new Scene(telaNovaMarca);
			sceneVeiculo = new Scene(telaVeiculo);
			sceneAddVeiculoLocacao = new Scene(telaAddVeiculoLocacao);
			sceneLocacao = new Scene(telaLocacao);
			sceneFinalizarLocacao = new Scene(telaFinalizarLocacao);
			sceneCliente = new Scene(telaCliente);
			sceneCategoria = new Scene(telaCategoria);
			sceneMotorista = new Scene(telaMotorista);
			sceneFilial = new Scene(telaFilial);

			primaryStage.setScene(sceneLogin);
			primaryStage.initStyle(StageStyle.UNDECORATED);
			stage = primaryStage;
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Pessoa pessoa = new PessoaFisica();
		pessoa.setLogin("admin");
		pessoa.setSenha(new String (Criptografia.criptografa("admin".toCharArray())));
		DAOPessoaFisica.getInstace().saveOrUpdate(pessoa);
		launch(args);
	}

	public static void novaTela(String tela) {	
		switch(tela) {
		case "NovaReserva":
			stageNovaReserva = new Stage();
			stageNovaReserva.initModality(Modality.APPLICATION_MODAL);
			stageNovaReserva.setScene(sceneNovaReserva);
			stageNovaReserva.show();
			break;
		case "ConfigLocacao":
			stageConfigLocacao = new Stage();
			stageConfigLocacao.initModality(Modality.APPLICATION_MODAL);
			stageConfigLocacao.setScene(sceneConfigLocacao);
			stageConfigLocacao.show();
			break;
		case "AddValorLocacao":
			stageAddValorLocacao = new Stage();
			stageAddValorLocacao.initModality(Modality.APPLICATION_MODAL);
			stageAddValorLocacao.setScene(sceneAddValorLocacao);
			stageAddValorLocacao.show();
			break;
		case "AlterarSenha":
			stageAlterarSenha = new Stage();
			stageAlterarSenha.initModality(Modality.APPLICATION_MODAL);
			stageAlterarSenha.setScene(sceneAlterarSenha);
			stageAlterarSenha.show();
			break;
		case "Funcionario":
			stageFuncionario = new Stage();
			stageFuncionario.initModality(Modality.APPLICATION_MODAL);
			stageFuncionario.setScene(sceneFuncionario);
			stageFuncionario.show();
			break;
		case "Reserva":
			stageReserva = new Stage();
			stageReserva.initModality(Modality.APPLICATION_MODAL);
			stageReserva.setScene(sceneReserva);
			stageReserva.show();
			break;
		case "NovaCategoria":
			stageNovaCategoria = new Stage();
			stageNovaCategoria.initModality(Modality.APPLICATION_MODAL);
			stageNovaCategoria.setScene(sceneNovaCategoria);
			stageNovaCategoria.show();
			break;
		case "NovaFilial":
			stageNovaCategoria = new Stage();
			stageNovaCategoria.initModality(Modality.APPLICATION_MODAL);
			stageNovaCategoria.setScene(sceneNovaFilial);
			stageNovaCategoria.show();
			break;
		case "NovoMotorista":
			stageNovoMotorista = new Stage();
			stageNovoMotorista.initModality(Modality.APPLICATION_MODAL);
			stageNovoMotorista.setScene(sceneNovoMotorista);
			stageNovoMotorista.show();
			break;

		case "NovoCliente":
			stageNovoCliente = new Stage();
			stageNovoCliente.initModality(Modality.APPLICATION_MODAL);
			stageNovoCliente.setScene(sceneNovoCliente);
			stageNovoCliente.show();
			break;

		case "NovoFuncionario":
			stageNovoFuncionario = new Stage();
			stageNovoFuncionario.initModality(Modality.APPLICATION_MODAL);
			stageNovoFuncionario.setScene(sceneNovoFuncionario);
			stageNovoFuncionario.show();
			break;

		case "NovoVeiculo":
			stageNovoVeiculo = new Stage();
			stageNovoVeiculo.initModality(Modality.APPLICATION_MODAL);
			stageNovoVeiculo.setScene(sceneNovoVeiculo);
			stageNovoVeiculo.show();
			break;

		case "NovoModelo":
			stageNovoModelo = new Stage();
			stageNovoModelo.initModality(Modality.APPLICATION_MODAL);
			stageNovoModelo.setScene(sceneNovoModelo);
			stageNovoModelo.show();
			break;

		case "NovaMarca":
			stageNovaMarca = new Stage();
			stageNovaMarca.initModality(Modality.APPLICATION_MODAL);
			stageNovaMarca.setScene(sceneNovaMarca);
			stageNovaMarca.show();
			break;

		case "Veiculo":
			stageVeiculo = new Stage();
			stageVeiculo.initModality(Modality.APPLICATION_MODAL);
			stageVeiculo.setScene(sceneVeiculo);
			stageVeiculo.show();
			break;

		case "AddVeiculoLocacao":
			stageAddVeiculoLocacao = new Stage();
			stageAddVeiculoLocacao.initModality(Modality.APPLICATION_MODAL);
			stageAddVeiculoLocacao.setScene(sceneAddVeiculoLocacao);
			stageAddVeiculoLocacao.show();
			break;

		case "Locacao":
			stageLocacao = new Stage();
			stageLocacao.initModality(Modality.APPLICATION_MODAL);
			stageLocacao.setScene(sceneLocacao);
			stageLocacao.show();
			break;

		case "FinalizarLocacao":
			stageFinalizarLocacao = new Stage();
			stageFinalizarLocacao.initModality(Modality.APPLICATION_MODAL);
			stageFinalizarLocacao.setScene(sceneFinalizarLocacao);
			stageFinalizarLocacao.show();
			break;


		case "Categoria":
			stageCategoria = new Stage();
			stageCategoria.initModality(Modality.APPLICATION_MODAL);
			stageCategoria.setScene(sceneCategoria);
			stageCategoria.show();
			break;


		case "Cliente":
			stageCliente = new Stage();
			stageCliente.initModality(Modality.APPLICATION_MODAL);
			stageCliente.setScene(sceneCliente);
			stageCliente.show();
			break;

		case "Motorista":
			stageMotorista = new Stage();
			stageMotorista.initModality(Modality.APPLICATION_MODAL);
			stageMotorista.setScene(sceneMotorista);
			stageMotorista.show();
			break;

		case "Filial":
			stageFilial = new Stage();
			stageFilial.initModality(Modality.APPLICATION_MODAL);
			stageFilial.setScene(sceneFilial);
			stageFilial.show();
			break;

		}
	}

	public static void alterarTela(String tela) {	
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		switch(tela) {
		case "Principal":
			stage.setWidth(d.getWidth());
			stage.setHeight(d.getHeight());
			stage.setX(0);
			stage.setY(0);
			stage.setScene(scenePrincipal);
			break;

		case "Login":
			stage.setWidth(500);
			stage.setHeight(400);
			stage.setX((d.getWidth()-500)/2);
			stage.setY((d.getHeight()-400)/2);
			stage.setScene(sceneLogin);
			break;
		}
	}


}