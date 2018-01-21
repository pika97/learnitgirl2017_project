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
            primaryStage.setTitle("Media Player!");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    public Scene setScene(double width, double height) {
    this.height = height;
    this.width = width;
    //Add your own path of the vidio that you want to play
    String path = "F:/MediaPl/src/mediapl/Tom and Jerry Beach YouTube.mp4";

    media = new Media(new File("/home/swatiii/Downloads/Enrique_Iglesias_Hero.mp3").toURI().toString());
    mediaPlayer = new MediaPlayer(media);
    mediaPlayer.setAutoPlay(false);
    mediaView = new MediaView(mediaPlayer);


    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(mediaView);
    borderPane.setBottom(addToolBar());

    borderPane.setStyle("-fx-background-color: Blue");
    scene = new Scene(borderPane, 900, 900);
    scene.setFill(Color.AQUA);
    return scene;
}
 private HBox addToolBar() {
        HBox toolBar = new HBox();
        toolBar.setPadding(new Insets(20));
        toolBar.setAlignment(Pos.CENTER);
        toolBar.alignmentProperty().isBound();
        toolBar.setSpacing(5);
        toolBar.setStyle("-fx-background-color: pink");
        Image playButtonImage = new Image(getClass().getResourceAsStream("/resources/images/play.png"));
        Button playButton = new Button();
        playButton.setGraphic(new ImageView(playButtonImage));
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
        pauseButton.setGraphic(new ImageView(pausedButtonImage));
        pauseButton.setStyle("-fx-background-color: Black");

        pauseButton.setOnAction((ActionEvent e) -> {
            mediaPlayer.pause();
        });
        pauseButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        pauseButton.setStyle("-fx-background-color: Black");
        pauseButton.setStyle("-fx-height:4vh");
        });
        pauseButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        pauseButton.setStyle("-fx-background-color: Black");
        });
        Image nextButtonImage = new Image(getClass().getClassLoader().getResourceAsStream("resources/images/play.png"));
        Button nextButton = new Button();
        nextButton.setGraphic(new ImageView(nextButtonImage));
        nextButton.setStyle("-fx-background-color: Black");

        nextButton.setOnAction((ActionEvent e) -> {
            mediaPlayer.seek(mediaPlayer.getStartTime());
        });
        nextButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        nextButton.setStyle("-fx-background-color: Black");
        nextButton.setStyle("-fx-body-color: Black");
        });
        nextButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        nextButton.setStyle("-fx-background-color: Black");
        });
        Image stopButtonImage = new Image(getClass().getClassLoader().getResourceAsStream("resources/images/play.png"));
        Button stopButton = new Button();
        stopButton.setGraphic(new ImageView(stopButtonImage));
        stopButton.setStyle("-fx-background-color: Black");

        stopButton.setOnAction((ActionEvent e) -> {
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new ExtensionFilter("*.mp3"));
            File file = fc.showOpenDialog(null);
            String path = file.getAbsolutePath();
            path = path.replace("\\", "/");
            media = new Media(new File(path).toURI().toString());
            mediaPlayer.stop();
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaView.setMediaPlayer(mediaPlayer);

        });
        stopButton.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
        stopButton.setStyle("-fx-background-color: Black");
        stopButton.setStyle("-fx-body-color: Black");
        });
        stopButton.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
        stopButton.setStyle("-fx-background-color: Black");
        });
        toolBar.getChildren().addAll(playButton, pauseButton,nextButton,stopButton);
        return toolBar;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
