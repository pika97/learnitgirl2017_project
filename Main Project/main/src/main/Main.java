/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import java.io.File;
import javafx.*;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import 	javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.media.*;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author swatiii
 */
public class Main extends Application {
    MediaPlayer mediaPlayer;
    private Label time;
    Duration duration;
    Scene scene;
    Media media;
    double width;
    double height;
    MediaView mediaView;
    @Override
    public void start(Stage primaryStage) {
            scene = setScene(this.width, this.height);
            primaryStage.setTitle("Music Player");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    public Scene setScene(double width, double height) {
    this.height = height;
    this.width = width;

    media = new Media(new File("/home/swatiii/Downloads/Enrique_Iglesias_Hero.mp3").toURI().toString());
    mediaPlayer = new MediaPlayer(media);
    mediaPlayer.setAutoPlay(false);
    mediaView = new MediaView(mediaPlayer);


    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(mediaView);
    borderPane.setBottom(addToolBar());
    borderPane.setStyle(" -fx-background-image: url(\"/resources/images/wall.jpg\");-fx-background-repeat: stretch;-fx-background-size:cover; ");
    
    scene = new Scene(borderPane, 400, 500);
    return scene;
}
 private HBox addToolBar() {
        HBox toolBar = new HBox();
        toolBar.setPadding(new Insets(20));
        toolBar.setAlignment(Pos.CENTER);
        toolBar.alignmentProperty().isBound();
        toolBar.setSpacing(5);
        toolBar.setStyle("-fx-background-color:Black");
        Image playButtonImage = new Image(getClass().getResourceAsStream("/resources/images/play.png"));
        Button playButton = new Button();
        ImageView play = new ImageView(playButtonImage);
        playButton.setGraphic(play);
        play.setFitHeight(60);
        play.setFitWidth(60);
        playButton.setStyle("-fx-background-color: Black");

        playButton.setOnAction((ActionEvent e) -> {
            mediaPlayer.play();
        });
        playButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        playButton.setStyle("-fx-background-color: Black");
        playButton.setStyle("-fx-body-color: Black");
        });
        playButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        playButton.setStyle("-fx-background-color: Black");
});
        Image pausedButtonImage = new Image(getClass().getResourceAsStream("/resources/images/pause.png"));
        Button pauseButton = new Button();
        ImageView pause = new ImageView(pausedButtonImage);
        pauseButton.setGraphic(pause);
        pause.setFitHeight(60);
        pause.setFitWidth(60);
        pauseButton.setStyle("-fx-background-color: Black");

        pauseButton.setOnAction((ActionEvent e) -> {
            mediaPlayer.pause();
        });
        pauseButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        pauseButton.setStyle("-fx-background-color: Black");
        pauseButton.setStyle("-fx-body-color: Black");
        });
        pauseButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        pauseButton.setStyle("-fx-background-color: Black");
        });
        Image reloadButtonImage = new Image(getClass().getClassLoader().getResourceAsStream("resources/images/reload.png"));
        Button reloadButton = new Button();
        ImageView reload = new ImageView(reloadButtonImage);
        reloadButton.setGraphic(reload);
        reload.setFitHeight(60);
        reload.setFitWidth(60);
        reloadButton.setStyle("-fx-background-color: Black");

        reloadButton.setOnAction((ActionEvent e) -> {
            mediaPlayer.seek(mediaPlayer.getStartTime());
        });
        reloadButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        reloadButton.setStyle("-fx-background-color: Black");
        reloadButton.setStyle("-fx-body-color: Black");
        });
        reloadButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        reloadButton.setStyle("-fx-background-color: Black");
        });
        Image findButtonImage = new Image(getClass().getClassLoader().getResourceAsStream("resources/images/find.png"));
        Button findButton = new Button();
        ImageView find = new ImageView(findButtonImage);
        findButton.setGraphic(find);
        find.setFitHeight(60);
        find.setFitWidth(60);
        findButton.setStyle("-fx-background-color: Black");

        findButton.setOnAction((ActionEvent e) -> {
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new ExtensionFilter("*.mp3"));
            File file = fc.showOpenDialog(null);
            String path = file.getAbsolutePath();
            path = path.replace("\\", "/");
            media = new Media(new File(path).toURI().toString());
           
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaView.setMediaPlayer(mediaPlayer);

        });
        findButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        findButton.setStyle("-fx-background-color: Black");
        findButton.setStyle("-fx-body-color: Black");
        });
        findButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        findButton.setStyle("-fx-background-color: Black");
        });
        
        toolBar.getChildren().addAll(playButton, pauseButton,reloadButton,findButton);
        return toolBar;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
