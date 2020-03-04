package Vue;

import Controller.Controller;
import Model.Case;
import Model.Partie;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Vue extends Application {

    private Partie partie;
    private Stage primaryStage;
    private Group root;
    Controller monController;

    @Override
    public void start(Stage primaryStage) {
        this.partie = new Partie();
        monController = new Controller(this, partie);


        this.primaryStage = primaryStage;

        this.root = new Group();
        afficherPlatau();
        Scene scene = new Scene(root);

        setEventHandlerMenu();
        primaryStage.setTitle("Echec");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void setEventHandlerMenu() {

    }

    public void afficherPlatau() {
        root.getChildren().clear();
        for (int i = 0; i < partie.getPlateau().length; i++) {
            for (int j = 0; j < partie.getPlateau()[i].length; j++) {
                root.getChildren().add(partie.getCase(i,j).getSkinCase());
            }
        }
    }
}