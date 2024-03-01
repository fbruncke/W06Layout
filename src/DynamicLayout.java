import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;




public class DynamicLayout extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10,10,10,10));
        gp.setHgap(10);
        gp.setVgap(10);
        Scene scene = new Scene(gp,600,600);

        Button btn1 = new Button("Button 1");


        gp.setGridLinesVisible(true);


        Button btnForHbox1 = new Button("HBox Btn");
        Button btnForHbox2 = new Button("HBox Btn");


        Label lName = new Label("Name: ");
        Label lAge = new Label("Age: ");

        TextField tfName = new TextField();
        TextField tfAge = new TextField();

        gp.add(lName,0,0);
        gp.add(tfName, 1 ,0 );

        gp.add(lAge,0,1);
        gp.add(tfAge, 1 ,1 );

        Button btnEnter = new Button("Data insert");
        btnEnter.setMinWidth(400);
        GridPane.setColumnSpan(btnEnter, 2);
        GridPane.setHalignment(btnEnter, HPos.RIGHT);

        gp.add(btnEnter,0,3);

        primaryStage.setTitle("Layouts");
        primaryStage.setScene(scene);
        primaryStage.show();

        //System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
