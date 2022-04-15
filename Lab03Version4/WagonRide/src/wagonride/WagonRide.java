/*
* Lab 03 for CS1181 
* This program demonstrates the use of NetBeans IDE
* This program will output a graphic to the user and demonstrate animation on the 
* object.
*/
package wagonride;
/*
* @author Sierra Sprungl
* CS1181L-06
* Instrictor: R. Volkers
* TA's: William Hess and Chris Stropes 
*/
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class WagonRide extends Application {

    /**
    * Makes graphic objects that include circles, rectangles, lines, and arcs. Sets the properties of these objects in terms of x and y orientation,
    * type, radius length, stroke and fill color, and sets these objects in a Pane. Also performs animation on these objects that causes them 
    * them the move right to left endlessly within a certain amount of time. It also overrides the start method in the Application Class.
    * Precondition: is part of a class that extends the JavaFx Application Class
    * Postcondition: was passed a the variable stage called primaryStage
    * @param primaryStage - the stage variable used to display the scene, must be called primaryStage
    */
    @Override
    public void start(Stage primaryStage) {
        
        // Creates a new Pane object that will hold all of the Grapic objects
        Pane p = new Pane();
        
        // Creates a circle object that will be used for the left wheel of the cart.
        Circle wheel1 = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 30 pixels.
        wheel1.setCenterX(30);
        // Sets the y-orientation for the circle object. Here it is set to 300 pixels.
        wheel1.setCenterY(300);
        // Sets the radius value for the circle object. Here it is set to 30 pixels.
        wheel1.setRadius(30);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        wheel1.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to red.
        wheel1.setFill(Color.RED);
      

        // Creates a circle object that will be used for the right wheel of the cart.
        Circle wheel2 = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 280 pixels.
        wheel2.setCenterX(280);
        // Sets the y-orientation for the circle object. Here it is set to 300 pixels.
        wheel2.setCenterY(300);
        // Sets the radius value for the circle object. Here it is set to 30 pixels.
        wheel2.setRadius(30);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        wheel2.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to red.
        wheel2.setFill(Color.RED);
       

        // Creates a circle object that will be used for the small circle inside the left wheel of the cart.
        Circle smallCircle1 = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 30 pixels.
        smallCircle1.setCenterX(30);
        // Sets the y-orientation for the circle object. Here it is set to 300 pixels.
        smallCircle1.setCenterY(300);
        // Sets the radius value for the circle object. Here it is set to 10 pixels.
        smallCircle1.setRadius(10);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        smallCircle1.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to black.
        smallCircle1.setFill(Color.BLACK);
      

        // Creates a circle object that will be used for the small circle inside the right wheel of the cart.
        Circle smallCircle2 = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 280 pixels.
        smallCircle2.setCenterX(280);
        // Sets the y-orientation for the circle object. Here it is set to 300 pixels
        smallCircle2.setCenterY(300);
        // Sets the radius value for the circle object. Here it is set to 10 pixels.
        smallCircle2.setRadius(10);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        smallCircle2.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to black.
        smallCircle2.setFill(Color.BLACK);
      
        
        // Creates a rectangle object that will be used for the cart body, it also sets up the x-orientation to 0 pixels, y-orientation to 240 pixles,
        // the width to 310 pixels, the height to 30 pixels.
        Rectangle wagon = new Rectangle(0, 240, 310, 30);
        // Sets the stroke/outline for the rectangle object to the color black
        wagon.setStroke(Color.BLACK);
        // Sets the color for the inside of the rectangle object to red.
        wagon.setFill(Color.BLUE);
     
        // Creates a line object that will be used for the body of the stick figure that sits in the cart. 
        Line body = new Line();
        // Sets the startng x-coorinate for the line object. Here it is 150 pixels.
        body.setStartX(150.0);
        // Sets the starting y-corrinate for the line object. Here it is 238 pixels.
        body.setStartY(238.0);
        // Sets the ending x-corrinate for the line object. Here it is 150 pixels. 
        body.setEndX(150.0);
        // Sets the ending y-corrinate for the line object. Here is it 140 pixels.
        body.setEndY(140.0);
        // Sets the stroke width of the line object. Here is it 5 pixels.
        body.setStrokeWidth(5);
        // Sets the stroke/outline color of the line object. Here the color is green.
        body.setStroke(Color.GREEN);
      

        // Creates a line object that will be used for the left arm of the stick figure that sits in the cart
        Line leftArm = new Line();
        // Sets the startng x-coorinate for the line object. Here it is 149 pixels.
        leftArm.setStartX(149);
        // Sets the starting y-corrinate for the line object. Here it is 160 pixels.
        leftArm.setStartY(160);
        // Sets the ending x-corrinate for the line object. Here it is 60 pixels. 
        leftArm.setEndX(60);
        // Sets the ending y-corrinate for the line object. Here it is 238 pixels.
        leftArm.setEndY(238);
        // Sets the stroke width of the line object. Here is it 5 pixels.
        leftArm.setStrokeWidth(5);
        // Sets the stroke/outline color of the line object. Here the color is green.
        leftArm.setStroke(Color.GREEN);
        

        // Creates a line object that will be used for the right arm of the stick figure that sits in the cart
        Line rightArm = new Line();
        // Sets the startng x-coorinate for the line object. Here it is 152 pixels.
        rightArm.setStartX(152);
        // Sets the starting y-corrinate for the line object. Here it is 160 pixels.
        rightArm.setStartY(160);
        // Sets the ending x-corrinate for the line object. Here it is 235 pixels. 
        rightArm.setEndX(235);
        // Sets the ending y-corrinate for the line object. Here it is 238 pixels.
        rightArm.setEndY(238);
        // Sets the stroke width of the line object. Here is it 5 pixels.
        rightArm.setStrokeWidth(5);
        // Sets the stroke/outline color of the line object. Here the color is green.
        rightArm.setStroke(Color.GREEN);
       
        // Creates a circle object that will be used for the head of the stick figure that sits in the cart.
        Circle head = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 150 pixels.
        head.setCenterX(150);
        // Sets the y-orientation for the circle object. Here it is set to 100 pixels.
        head.setCenterY(100);
        // Sets the radius value for the circle object. Here it is set to 40 pixels.
        head.setRadius(40);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        head.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to white.
        head.setFill(Color.WHITE);
       

        // Creates a arc object that will used for the mouth of the stick figure that sits in the cart.
        Arc mouth = new Arc();
        // Sets the x-orientation for the arc object. Here it is 170 pixels.
        mouth.setCenterX(170);
        // Sets the y-orientation for the arc object. Here it is 120 pixels.
        mouth.setCenterY(120);
        // Sets the x length for the radius of the arc object. Here it is 15 pixels.
        mouth.setRadiusX(15);
        // Sets the y length for the radius of the arc object. Here it is 3 pixels.
        mouth.setRadiusY(3);
        // Sets the starting angle for the arc object. Here it is 0 degrees.
        mouth.setStartAngle(0);
        // Sets the length/ ending angle for the arc object. Here is it -180 degrees.
        mouth.setLength(-180);
        // Sets the color for the inside of the arc object to black. 
        mouth.setFill(Color.BLACK);
        // Sets the type of the arc object to chord.
        mouth.setType(ArcType.CHORD);
      

        // Creates a circle object that will be used for the eye of the stick figure that sits in the cart.
        Circle eye = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 170 pixels.
        eye.setCenterX(170);
        // Sets the y-orientation for the circle object. Here it is 90 pixels  
        eye.setCenterY(90);
        // Sets the x length for the radius of the circle object. Here it is 5 pixels.
        eye.setRadius(5);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        eye.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to black.
        eye.setFill(Color.BLACK);
      

        // Creates an arc object that will be used for the hair of the stick figure that sits in the cart
        Arc hair = new Arc();
        // Sets the x-orientation for the arc object. Here it is 150 pixels.
        hair.setCenterX(150);
        // Sets the y-orientation for the arc object. Here it is 80 pixels.
        hair.setCenterY(80);
        // Sets the x length for the radius of the arc object. Here it is 34 pixels.
        hair.setRadiusX(34);
        // Sets the y length for the radius of the arc object. Here it is 20 pixels.
        hair.setRadiusY(20);
        // Sets the starting angle for the arc object. Here it is 0 degrees
        hair.setStartAngle(0);
        // Sets the length/ ending angle for the arc object. Here is it 180 degrees.
        hair.setLength(180);
        // Sets the color for the inside of the arc object to brown.
        hair.setFill(Color.BROWN);
        // Sets the type of the arc object to chord.
        hair.setType(ArcType.CHORD);
        
        // Creates a new circle object that will be used for the eye2 on the stick figure that sits in the cart.
         Circle eye2 = new Circle();
        // Sets the x-orientation for the circle object. Here it is  set to 130 pixels.
        eye2.setCenterX(130);
        // Sets the y-orientation for the circle object. Here it is 90 pixels  
        eye2.setCenterY(90);
        // Sets the x length for the radius of the circle object. Here it is 5 pixels.
        eye2.setRadius(5);
        // Sets the color of the stroke/outline for the circle object. Here the color is set to black.
        eye2.setStroke(Color.BLACK);
        // Sets the color for the inside of the circle object. Here the color is set to black.
        eye2.setFill(Color.BLACK);
        
        
         // Creates a arc object that will used for mouth2 of the stick figure that sits in the cart.
        Arc mouth2 = new Arc();
        // Sets the x-orientation for the arc object. Here it is 130 pixels.
        mouth2.setCenterX(130);
        // Sets the y-orientation for the arc object. Here it is 120 pixels.
        mouth2.setCenterY(120);
        // Sets the x length for the radius of the arc object. Here it is 15 pixels.
        mouth2.setRadiusX(15);
        // Sets the y length for the radius of the arc object. Here it is 3 pixels.
        mouth2.setRadiusY(3);
        // Sets the starting angle for the arc object. Here it is 0 degrees.
        mouth2.setStartAngle(0);
        // Sets the length/ ending angle for the arc object. Here is it -180 degrees.
        mouth2.setLength(-180);
        // Sets the color for the inside of the arc object to black. 
        mouth2.setFill(Color.BLACK);
        // Sets the type of the arc object to chord.
        mouth2.setType(ArcType.CHORD);
        
        
        
    
        // Creates a line object that will be used for the path of the animation on wheel1 and smallCircle1 
        Line path = new Line();
        // Sets the starting x postion of the path. Here it is 30 pixels
        path.setStartX(30);
        // Sets the starting y postion of the path. Here it is 300 pixels
        path.setStartY(300);
        // Sets the ending x postion of the path. Here it is 515 pixels
        path.setEndX(515);
        // Sets the ending y postion of the path. Here it is 300 pixels
        path.setEndY(300);
        // Sets the stroke color of the path to white
        path.setStroke(Color.WHITE);
        // Sets the stroke width of the path to 0, so the path is not visable to the user.
        path.setStrokeWidth(0);
        // Adds the path, wheel1, and smallCircle1 into the pane.
        p.getChildren().addAll(path,wheel1,smallCircle1);
        // Creates a new path transition object so that the objects set to the path can travierse it and move. 
        PathTransition pt = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path.
        pt.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt.setPath(path);
        // Sets the object that will be moving in the path transistion 
        pt.setNode(wheel1);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving.
        pt.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt.setAutoReverse(true);
        // Tells the animation to move/play.
        pt.play();
        
        // Creates a line object that will be used for the path of the animation on wheel2 and smallCircle2
        Line path2 = new Line();
        // Sets the starting x postion of the path. Here it is 280 pixels
        path2.setStartX(280);
        // Sets the starting y postion of the path. Here it is 300 pixels
        path2.setStartY(300);
        // Sets the ending x postion of the path. Here it is 770 pixels
        path2.setEndX(770);
        // Sets the ending y postion of the path. Herer it is 300 pixels
        path2.setEndY(300);
        // Sets the stroke color of the path to white
        path2.setStroke(Color.WHITE);
        // Sets the stroke width of the path to 0, so the path is not visable to the user.
        path2.setStrokeWidth(0);
        // Adds the path, wheel2, and smallCircle2 into the pane.
        p.getChildren().addAll(path2,wheel2, smallCircle2);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt2 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path.
        pt2.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt2.setPath(path2);
        // Sets the object that will be moving in the path transistion 
        pt2.setNode(wheel2);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path.
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving.
        pt2.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt2.setAutoReverse(true);
        // Tells the animation to move/play.
        pt2.play();
        
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt3 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path.
        pt3.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt3.setPath(path);
        // Sets the object that will be moving in the path transistion 
        pt3.setNode(smallCircle1);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path.      
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving.
        pt3.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt3.setAutoReverse(true);
        // Tells the animation to move/play.
        pt3.play();
        
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt4 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt4.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt4.setPath(path2);
        // Sets the object that will be moving in the path transistion 
        pt4.setNode(smallCircle2);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path.   
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving.
        pt4.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt4.setAutoReverse(true);
        // Tells the animation to move/play.
        pt4.play();
        
        // Creates a line object that will be used for the path of the animation on the wagon object.
        Line path3 = new Line();
        // Sets the starting x postion of the path. Here it is 160 pixels
        path3.setStartX(160);
        // Sets the starting y postion of the path. Here it is 260 pixels
        path3.setStartY(260);
        // Sets the ending x postion of the path. Here it is 645 pixels
        path3.setEndX(645);
        // Sets the ending y postion of the path. Herer it is 260 pixels
        path3.setEndY(260);
        // Sets the stroke color of the path to white
        path3.setStroke(Color.WHITE);
        // Sets the stroke width of the path to 0, so the path is not visable to the user.
        path3.setStrokeWidth(0);
        // Adds the path and wagon in the pane
        p.getChildren().addAll(path3,wagon);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt5 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt5.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt5.setPath(path3);
        // Sets the object that will be moving in the path transistion
        pt5.setNode(wagon);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt5.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving.
        pt5.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt5.setAutoReverse(true);
        // Tells the animation to move/play.
        pt5.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path4 = new Line();
        // Sets the starting x postion of the path. Here it is 149 pixels
        path4.setStartX(149);
        // Sets the starting y postion of the path. Here it is 195 pixels
        path4.setStartY(195);
        // Sets the ending x postion of the path. Here it is 645 pixels
        path4.setEndX(645);
        // Sets the ending y postion of the path. Herer it is 195 pixels
        path4.setEndY(195);
        // Sets the stroke color of the path to white
        path4.setStroke(Color.WHITE);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path4.setStrokeWidth(0);
        // Adds the path and body to the pane
        p.getChildren().addAll(path4,body);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt6 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt6.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt6.setPath(path4);
        // Sets the object that will be moving in the path transistion
        pt6.setNode(body);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt6.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt6.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt6.setAutoReverse(true);
        // Tells the animation to move/play.
        pt6.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path5 = new Line ();
        // Sets the starting x postion of the path. Here it is 193 pixels
        path5.setStartX(193);
        // Sets the starting y postion of the path. Here it is 205 pixels
        path5.setStartY(205);
        // Sets the ending x postion of the path. Here it is 688 pixels
        path5.setEndX(688);
        // Sets the ending y postion of the path. Herer it is 205 pixels
        path5.setEndY(205);
        // Sets the stroke color of the path to black
        path5.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path5.setStrokeWidth(0);
        // Adds the path and rightArm to the pane
        p.getChildren().addAll(path5,rightArm);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt7 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt7.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt7.setPath(path5);
        // Sets the object that will be moving in the path transistion
        pt7.setNode(rightArm);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt7.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt7.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt7.setAutoReverse(true);
        // Tells the animation to move/play.
        pt7.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path6 = new Line();
        // Sets the starting x postion of the path. Here it is 102 pixels
        path6.setStartX(102);
        // Sets the starting y postion of the path. Here it is 205 pixels
        path6.setStartY(205);
        // Sets the ending x postion of the path. Here it is 600 pixels
        path6.setEndX(600);
        // Sets the ending y postion of the path. Herer it is 205 pixels
        path6.setEndY(205);
        // Sets the stroke color of the path to black
        path6.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path6.setStrokeWidth(0);
        // Adds the path and leftArm to the pane
        p.getChildren().addAll(path6,leftArm);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt8 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt8.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt8.setPath(path6);
        // Sets the object that will be moving in the path transistion
        pt8.setNode(leftArm);
         // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt8.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
         // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt8.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt8.setAutoReverse(true);
        // Tells the animation to move/play.
        pt8.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path7 = new Line();
        // Sets the starting x postion of the path. Here it is 149 pixels
        path7.setStartX(149);
        // Sets the starting y postion of the path. Here it is 105 pixels
        path7.setStartY(105);
        // Sets the ending x postion of the path. Here it is 645 pixels
        path7.setEndX(645);
        // Sets the ending y postion of the path. Herer it is 105 pixels
        path7.setEndY(105);
        // Sets the stroke color of the path to black
        path7.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path7.setStrokeWidth(0);
        // Adds the path and head into the pane
        p.getChildren().addAll(path7,head);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt9 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt9.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt9.setPath(path7);
        // Sets the object that will be moving in the path transistion
        pt9.setNode(head);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt9.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt9.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt9.setAutoReverse(true);
        // Tells the animation to move/play.
        pt9.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path8 = new Line();
        // Sets the starting x postion of the path. Here it is 171 pixels
        path8.setStartX(171);
        // Sets the starting y postion of the path. Here it is 120 pixels
        path8.setStartY(120);
        // Sets the ending x postion of the path. Here it is 668 pixels        
        path8.setEndX(668);
        // Sets the ending y postion of the path. Herer it is 120 pixels
        path8.setEndY(120);
         // Sets the stroke color of the path to black
        path8.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path8.setStrokeWidth(0);
        // Adds the path and mouth into the pane.
        p.getChildren().addAll(path8,mouth);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt10 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt10.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt10.setPath(path8);
        // Sets the object that will be moving in the path transistion
        pt10.setNode(mouth);
        // Sets the visiblably of the mouth object to true.
        mouth.setVisible(true);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path.
        pt10.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt10.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt10.setAutoReverse(true);
        // Tells the animation to move/play.
        pt10.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path9 = new Line();
        // Sets the starting x postion of the path. Here it is 171 pixels
        path9.setStartX(171);
        // Sets the starting y postion of the path. Here it is 90 pixels
        path9.setStartY(90);
        // Sets the ending x postion of the path. Here it is 668 pixels 
        path9.setEndX(668);
        // Sets the ending y postion of the path. Herer it is 90 pixels
        path9.setEndY(90);
        // Sets the stroke color of the path to black
        path9.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path9.setStrokeWidth(0);
        // Adds the path and the eye in the pane
        p.getChildren().addAll(path9,eye);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt11 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt11.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt11.setPath(path9);
        // Sets the object that will be moving in the path transistion
        pt11.setNode(eye);
        // Sets the visiblity of the eye object to true.
        eye.setVisible(true);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt11.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt11.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt11.setAutoReverse(true);
        // Tells the animation to move/play.
        pt11.play();
        
        // Creates a line object that will be used for the path of the animation on the body object.
        Line path10 = new Line();
        // Sets the starting x postion of the path. Here it is 149 pixels
        path10.setStartX(149);
        // Sets the starting y postion of the path. Here it is 73 pixels        
        path10.setStartY(73);
        // Sets the ending x postion of the path. Here it is 645 pixels 
        path10.setEndX(645);
        // Sets the ending y postion of the path. Herer it is 90 pixels
        path10.setEndY(73);
        // Sets the stroke color of the path to black
        path10.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path10.setStrokeWidth(0);
        // Adds the path and the hair object in the pane
        p.getChildren().addAll(path10,hair);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt12 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt12.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt12.setPath(path10);
        // Sets the object that will be moving in the path transistion
        pt12.setNode(hair);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt12.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt12.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt12.setAutoReverse(true);
        // Tells the animation to move/play.
        pt12.play();
        
         // Creates a line object that will be used for the path of the animation on the body object.
        Line path11 = new Line();
        // Sets the starting x postion of the path. Here it is 125 pixels
        path11.setStartX(125);
        // Sets the starting y postion of the path. Here it is 90 pixels
        path11.setStartY(90);
        // Sets the ending x postion of the path. Here it is 620 pixels 
        path11.setEndX(620);
        // Sets the ending y postion of the path. Herer it is 90 pixels
        path11.setEndY(90);
        // Sets the stroke color of the path to black
        path11.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path11.setStrokeWidth(0);
        // Adds the path and the eye in the pane
        p.getChildren().addAll(path11,eye2);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt13 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt13.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt13.setPath(path11);
        // Sets the object that will be moving in the path transistion
        pt13.setNode(eye2);
       eye2.setVisible(true);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
        pt13.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt13.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt13.setAutoReverse(true);
        // Tells the animation to move/play.
        pt13.play();
        
        // Creates a line object that will be used for the path of the animation on the mouth2 object.
        Line path12 = new Line();
        // Sets the starting x postion of the path. Here it is 126 pixels
        path12.setStartX(126);
        // Sets the starting y postion of the path. Here it is 120 pixels
        path12.setStartY(120);
        // Sets the ending x postion of the path. Here it is 622 pixels        
        path12.setEndX(622);
        // Sets the ending y postion of the path. Herer it is 120 pixels
        path12.setEndY(120);
         // Sets the stroke color of the path to black
        path12.setStroke(Color.BLACK);
        // Sets the stroke width of the path to 0, so the path is not visable to the user
        path12.setStrokeWidth(0);
        // Adds the path and mouth into the pane.
        p.getChildren().addAll(path12,mouth2);
        // Creates a new path transition object so that the objects set to the path can travierse it and move.
        PathTransition pt14 = new PathTransition();
        // Sets the speed on the path transition to 6 millis, this how fast the objects will move on the path
        pt14.setDuration(Duration.millis(6000));
        // Sets the path in the path transition
        pt14.setPath(path12);
        // Sets the object that will be moving in the path transistion
        pt14.setNode(mouth2);
        // Sets the orientation type of the path transiston. Here it is set to orthognal to tangent. This is how the oject will 
        // move on the path. 
       mouth2.setVisible(true);
        pt14.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        // Sets the number of times that the object will move, here it is set to indfinite. Meaning the object
        // will never stop moving
        pt14.setCycleCount(Timeline.INDEFINITE);
        // Tells whether or not the the object will reverse directions when it reaches the end of the path. Here is it 
        // set to true, meaning that the object will reverse directions when it reaches the end of the path.
        pt14.setAutoReverse(true);
        // Tells the animation to move/play.
        pt14.play();
        
        if (eye.isVisible()&& eye2.isVisible()){
            eye2.setVisible(false);
            
        }else{
            eye2.setVisible(true);
            
        }
        if(mouth.isVisible() && mouth2.isVisible()){
            mouth2.setVisible(false);
          
        }else{
            mouth2.setVisible(true);
        }
        
        if(eye2.isVisible() && eye.isVisible()){
            eye.setVisible(false);
           
        }else{
            eye.setVisible(true);
        }
        if(mouth2.isVisible() && eye.isVisible()){
            mouth.setVisible(false);
           
        }else{
         mouth.setVisible(true);   
        }
        
        
        // Creates a new scene object and it places the pane into the scene along with setting the dimensions for the scene. The x is 800 pixles and the y
        // is 350 pixels
        Scene scene = new Scene(p, 800, 350);
        // Sets the name for the stage
        primaryStage.setTitle("Wagon Ride");
        // Sets the scene in the stage
        primaryStage.setScene(scene);
        // Shows the stage to user.
        primaryStage.show();
                
    }
    
    

    /**
    * launches the program for the user and displays the program to the user
    * Precondition: the program has a start method and class was passed a string array
    * Postcondition: the program was passed a string array that had the command arguments for the program
    * @param args - the command line arguments
    */
    public static void main(String[] args) {
        launch(args);
    }

}

