package mazepackage;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MazeApp extends Application 
{
    // default canvas size is DEFAULT_SIZE-by-DEFAULT_SIZE
    private static final int DEFAULT_SIZE = 768;
    private int width = DEFAULT_SIZE;
    private int height = DEFAULT_SIZE;
    // The graphics context is needed to enable drawing on the canvas
    private GraphicsContext gc;
    // boundary of drawing canvas, 0% border
    // private static final double BORDER = 0.05;    
    private static final double BORDER = 0.00;
    private double xmin, ymin, xmax, ymax;

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) 
    {
        Group root = new Group();
        Canvas canvas = new Canvas(width, height);
        gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(2);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, width, height);
        root.getChildren().add(canvas);
        
        TextInputDialog tid = new TextInputDialog();
        tid.setTitle("Maze Size");
        tid.setHeaderText("Enter maze size between 10 and 50");
        tid.showAndWait();
        int size = Integer.parseInt(tid.getResult());
        if (size > 50)
            size = 50;
        if (size < 10)
            size = 10;
        
        primaryStage.setTitle("Maze Application");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        // Make sure that the application goes away when then window is closed
        primaryStage.setOnCloseRequest(e -> System.exit(0));
        primaryStage.show(); 
        
        Maze maze = new Maze(this, size);
        // Must solve the maze in a separate thread or else
        // the GUI wont update until the end.....
        Thread solver = new Thread(
            new Runnable () {
                public void run()
                {
                    while(true)
                    {
                        maze.buildAndDrawMaze();
                        maze.solve();
                        try 
                        {
                            Thread.sleep(5000);
                        }
                        catch(Exception e) { }
                        gc.setFill(Color.WHITE);
                        gc.fillRect(0, 0, width, height);                        
                    }
                }
            });
        solver.start();
    }

    /**
     * Sets the pen color to the specified color.
     *
     * @param color the color to make the pen
     */
    public void setPenColor(Color color) {
        gc.setStroke(color);
    }
    
    /**
     * Sets the pen color to the specified color.
     *
     * @param color the color to make the pen
     */
    public void setFillColor(Color color) {
        gc.setFill(color);
    }
    /**
     * Sets the <em>x</em>-scale to the specified range.
     *
     * @param min the minimum value of the <em>x</em>-scale
     * @param max the maximum value of the <em>x</em>-scale
     * @throws IllegalArgumentException if {@code (max == min)}
     */
    public void setXscale(double min, double max) {
        double size = max - min;
        if (size == 0.0) {
            throw new IllegalArgumentException("the min and max are the same");
        }

        xmin = min - BORDER * size;
        xmax = max + BORDER * size;
    }

    /**
     * Sets the <em>y</em>-scale to the specified range.
     *
     * @param min the minimum value of the <em>y</em>-scale
     * @param max the maximum value of the <em>y</em>-scale
     * @throws IllegalArgumentException if {@code (max == min)}
     */
    public void setYscale(double min, double max) {
        double size = max - min;
        if (size == 0.0) {
            throw new IllegalArgumentException("the min and max are the same");
        }

        ymin = min - BORDER * size;
        ymax = max + BORDER * size;
    }

    // helper functions that scale from user coordinates to screen coordinates and back
    private double scaleX(double x) {
        return width * (x - xmin) / (xmax - xmin);
    }

    private double scaleY(double y) {
        return height * (ymax - y) / (ymax - ymin);
    }

    private double factorX(double w) {
        return w * width / Math.abs(xmax - xmin);
    }

    private double factorY(double h) {
        return h * height / Math.abs(ymax - ymin);
    }

    private double userX(double x) {
        return xmin + x * (xmax - xmin) / width;
    }

    private double userY(double y) {
        return ymax - y * (ymax - ymin) / height;
    }

    /**
     * Draws a line segment between (<em>x</em><sub>0</sub>,
     * <em>y</em><sub>0</sub>) and (<em>x</em><sub>1</sub>,
     * <em>y</em><sub>1</sub>).
     *
     * @param x0 the <em>x</em>-coordinate of one endpoint
     * @param y0 the <em>y</em>-coordinate of one endpoint
     * @param x1 the <em>x</em>-coordinate of the other endpoint
     * @param y1 the <em>y</em>-coordinate of the other endpoint
     */
    public void line(double x0, double y0, double x1, double y1) {
        gc.strokeLine(scaleX(x0), scaleY(y0), scaleX(x1), scaleY(y1));
    }

    /**
     * Draws one pixel at (<em>x</em>, <em>y</em>). This method is private
     * because pixels depend on the display. To achieve the same effect, set the
     * pen radius to 0 and call {@code point()}.
     *
     * @param x the <em>x</em>-coordinate of the pixel
     * @param y the <em>y</em>-coordinate of the pixel
     */
    private void pixel(double x, double y) {
        gc.fillRect((int) Math.round(scaleX(x)), (int) Math.round(scaleY(y)), 1, 1);
    }

    /**
     * Draws a filled circle of the specified radius, centered at (<em>x</em>,
     * <em>y</em>).
     *
     * @param x the <em>x</em>-coordinate of the center of the circle
     * @param y the <em>y</em>-coordinate of the center of the circle
     * @param radius the radius of the circle
     * @throws IllegalArgumentException if {@code radius} is negative
     */
    public void filledCircle(double x, double y, double radius) {
        double xs = scaleX(x);
        double ys = scaleY(y);
        double ws = factorX(2 * radius);
        double hs = factorY(2 * radius);
        if (ws <= 1 && hs <= 1) {
            pixel(x, y);
        } else {
            gc.fillOval(xs - ws / 2, ys - hs / 2, ws, hs);
        }
    }
}
