/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Arrays;
import java.util.Scanner; 

/**
 *
 * @author Sierra
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rows are in the maze? ");
        int rows = scanner.nextInt();
        System.out.print("How many colums are in the maze? ");
        int colums = scanner.nextInt();
        int[][] maze = new int[rows][colums];
        for (int i = 0; i < maze.length; i++) {
            System.out.print("Enter the danger in row " + (i + 1) + ", separated by spaces: ");
            for (int j = 0; j < maze[i].length; j++) {

                maze[i][j] = scanner.nextInt();

            }

        }
        System.out.print("Enter the starting x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter the starting y coordinate: ");
        int y = scanner.nextInt();
        
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {

                if (x == i && y == j) {
                    System.out.print("*");
                } else {
                    System.out.print(maze[i][j] + " ");

                }

                

            }System.out.println("");
        }
      
           
         //String newpath = (path+path2);
        while (x != 0 && y != 0 && x != (rows - 1) && y != (colums - 1)) {
            int left = maze[x][y - 1];
            int right = maze[x][y + 1];
            int up = maze[x - 1][y];
            int down = maze[x + 1][y];
            
          String path = (Integer.toString(x) + Integer.toString(y));
         // path = path + "x"+"y";
          
            
         // String path = (Integer.toString(x,y));
         // String path2 = (Integer.toString(x,y));
        // path = "x,y";
       //  path2 = "x,y";
           
       //  String newpath = (path+path2);
         
            
            //path = "x";
          //String path2 = "y";
                   
            //String newpath = path + path2 + "x" + "y";
           // if (x == x && y == y + 1) {
             //   left = 1000;
           
            if (!path.contains("x,y")){
                path = path +"x,y";
                
           }
            
            if (left <= right && left <= up && left <= down  ){
           
                //path = path + "x,y";
                y = y - 1;
               
            }
           
 System.out.println("Moving to " + x + "," + y + " (danger level " + maze[x][y] + ")");
           for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[x].length; j++) {
                    if (x == i && y == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(maze[i][j] + " ");
                    }

                  
            
               }
                System.out.println("");
            }
           // System.out.println("Moving to " + x + y + " (danger level " + maze[x][y] + ")");
            //count++;
            
           
            
            //if (x == x && y == (y - 1)) {
             //   right = 1000;
              if (right <= left && right <= up && right <= down  ) {
                //path = path + "x,y";
                y = y + 1;
                 
            }
            //here

            /*for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    if (x == i && y == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(maze[i][j] + " ");
                    }

                }
                System.out.println("");
            }
            System.out.println("Moving to " + x + y + " (danger level " + (y + 1) + ")");
            count++;
*/
            //if (x == (x - 1) && y == y) {
              //  up = 1000;
              if (up <= right && up <= left && up <= down  ) {
                //path = path + "x,y";
                x = x - 1;
                 
            }
  /*          for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    if (x == i && y == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(maze[i][j] + " ");
                    }

                }
                System.out.println("");
            }*/
 //           System.out.println("Moving to " + x + y + " (danger level " + (x - 1) + ")");
            

           // if (x == (x + 1) && y == y) {
              //  down = 1000;
             if (down <= right && down <= left && down <= up  ) {
                //path = path + "x,y";
                x = x + 1;
                 
            }
           /* for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    if (x == i && y == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(maze[i][j] + " ");
                    }

                }
                System.out.println("");

            }*/
           // System.out.println("Moving to " + x + y + " (danger level " + (x + 1) + ")");
            

            // here
        }
        
        if (x == 0 || y == 0 || x == (rows - 1) || y == (colums - 1)) {

            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {

                    if (x == i && y == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print(maze[i][j] + " ");
                    }

                }
                System.out.println("");
            }
            System.out.println("Exited the world at: " + x + "," + y + "total danger faced: " + maze[x][y]);

        }
    }
    }


