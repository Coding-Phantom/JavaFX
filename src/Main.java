
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        // Starts with a stage, which is our canvas

        // Group of nodes that will hold our elements
        Group root = new Group();

        // Scene holds root node
        Scene scene = new Scene(root, 1000, 1000, Color.BLACK);

        // Adds text to the root
        Text text = new Text();
        text.setText("Welcome to darkness");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Blacklisted", 50));

        // Sets text position
        text.setX(250);
        text.setY(500);

        // Adds line to the root
        Line line1 = new Line();
        line1.setStartX(0);
        line1.setStartY(0);
        line1.setEndX(1000);
        line1.setEndY(1000);
        line1.setStroke(Color.WHITE);

        Line line2 = new Line();
        line2.setStartX(1000);
        line2.setStartY(0);
        line2.setEndX(0);
        line2.setEndY(1000);
        line2.setStroke(Color.WHITE);

        // Adds image
        ImageView dark = new ImageView("Darken.png");
        dark.setX(380);
        dark.setY(700);




        // Adds elements to root
        root.getChildren().add(text);
        root.getChildren().add(line1);
        root.getChildren().add(line2);
        root.getChildren().add(dark);


        // Sets icon to the world of Darkness
        Image icon = new Image("Darken.png");
        stage.getIcons().add(icon);

        // Sets the stage scene
        stage.setScene(scene);

        // Set the position of the stage


        // Sets the title of the canvas
        stage.setTitle("Darkened World");

        stage.show();

        System.out.println("Hello ULTIMATE future");
    }
}