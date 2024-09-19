import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TesteFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();

        // Labels e TextFields ID
        Label lblID = new Label("ID:");
        lblID.relocate(100, 100);
        TextField txtID = new TextField();
        txtID.relocate(150, 100);
        txtID.setPrefWidth(200);

        // Labels e TextFields Nome
        Label lblNome = new Label("Nome:");
        lblNome.relocate(100, 150);
        TextField txtNome = new TextField();
        txtNome.relocate(150, 150);
        txtNome.setPrefWidth(200);

        // Labels e TextFields Telefone
        Label lblTelefone = new Label("Telefone:");
        lblTelefone.relocate(100, 200);
        TextField txtTelefone = new TextField();
        txtTelefone.relocate(150, 200);
        txtTelefone.setPrefWidth(200);
        
        //Botão Salvar e Pesquisar
        Button btnSalvar = new Button("Salvar");
        btnSalvar.relocate(150, 250);

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.relocate(200, 250);

       
        panel.getChildren().addAll(lblID, txtID, lblNome, txtNome, lblTelefone, txtTelefone, btnSalvar, btnPesquisar);

        Scene scn = new Scene(panel, 400, 350); // Ajustei o tamanho da cena

        stage.setScene(scn);
        stage.setTitle("Título da Janela");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TesteFx.class, args);
    }
}
