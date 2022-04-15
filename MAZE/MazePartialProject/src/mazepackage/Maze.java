package mazepackage;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import javafx.scene.paint.Color;

public class Maze {

    private int N;                 // dimension of maze
    private MazeCell[][] maze;
    private Random rand = new Random();
    // Used to signal the maze has been solved
    private boolean done;
    // time in milliseconds (from currentTimeMillis()) when we can draw again
    // used to control the frame rate
    private long nextDraw = -1;
    private MazeApp mf;
    // Define constants for the circle size
    private final double BIG = 0.375;
    private final double SMALL = 0.25;
    // Define constants for the delay times
    private final int SHORT = 30;
    private final int LONG = 500;

    public Maze(MazeApp ma, int n) {
        N = n;
        mf = ma;
        mf.setXscale(0, N + 2);
        mf.setYscale(0, N + 2);
    }

    public void buildAndDrawMaze() {
        createMaze();
        buildMaze();
        drawMaze();
    }

    // create the initial data structures that contain the maze data
    private void createMaze() {
        maze = new MazeCell[N + 2][N + 2];
        for (int i = 0; i < N + 2; i++) {
            for (int j = 0; j < N + 2; j++) {
                maze[i][j] = new MazeCell();
            }
        }
        // initialize border cells as already visited
        for (int x = 0; x < N + 2; x++) {
            maze[x][0].visited = true;
            maze[x][N + 1].visited = true;
        }
        for (int y = 0; y < N + 2; y++) {
            maze[0][y].visited = true;
            maze[N + 1][y].visited = true;
        }
    }

    // build the maze
    private void buildMaze(int x, int y) {
        maze[x][y].visited = true;
        // while there is an unvisited neighbor
        while (!maze[x][y + 1].visited || !maze[x + 1][y].visited
                || !maze[x][y - 1].visited || !maze[x - 1][y].visited) {
            // pick random neighbor (could use Knuth's trick instead)
            while (true) {
                int r = rand.nextInt(4);
                if (r == 0 && !maze[x][y + 1].visited) {
                    maze[x][y].nth = false;
                    maze[x][y + 1].sth = false;
                    buildMaze(x, y + 1);
                    break;
                } else if (r == 1 && !maze[x + 1][y].visited) {
                    maze[x][y].est = false;
                    maze[x + 1][y].wst = false;
                    buildMaze(x + 1, y);
                    break;
                } else if (r == 2 && !maze[x][y - 1].visited) {
                    maze[x][y].sth = false;
                    maze[x][y - 1].nth = false;
                    buildMaze(x, y - 1);
                    break;
                } else if (r == 3 && !maze[x - 1][y].visited) {
                    maze[x][y].wst = false;
                    maze[x - 1][y].est = false;
                    buildMaze(x - 1, y);
                    break;
                }
            }
        }
    }

    // build the maze starting from lower left
    private void buildMaze() {
        buildMaze(1, 1);
        // Make sure visited is reset to false
        for (int x = 1; x < N + 1; x++) {
            for (int y = 1; y < N + 1; y++) {
                maze[x][y].visited = false;
            }
        }
        // delete some random walls
        for (int i = 0; i < N; i++) {
            int x = 1 + rand.nextInt(N - 1);
            int y = 1 + rand.nextInt(N - 1);
            maze[x][y].nth = maze[x][y + 1].sth = false;
        }
    }

    // draw the initial maze
    private void drawMaze() {
        drawCircle(Color.RED, N / 2, N / 2, BIG);
        drawCircle(Color.RED, 1, 1, BIG);
        // Draw the walls in black
        mf.setPenColor(Color.BLACK);
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= N; y++) {
                if (maze[x][y].sth) {
                    mf.line(x, y, x + 1, y);
                }
                if (maze[x][y].nth) {
                    mf.line(x, y + 1, x + 1, y + 1);
                }
                if (maze[x][y].wst) {
                    mf.line(x, y, x, y + 1);
                }
                if (maze[x][y].est) {
                    mf.line(x + 1, y, x + 1, y + 1);
                }
            }
        }
        delay(LONG);
    }

    private void delay(int t) {
        // sleep until the next time we're allowed to draw
        long millis = System.currentTimeMillis();
        if (millis < nextDraw) {
            try {
                Thread.sleep(nextDraw - millis);
            } catch (InterruptedException e) {
                System.out.println("Error sleeping");
            }
            millis = nextDraw;
        }
        // when are we allowed to draw again
        nextDraw = millis + t;
    }

    private void drawCircle(Color c, double x, double y, double size) {
        mf.setFillColor(c);
        mf.filledCircle(x + 0.5, y + 0.5, size);
    } 
    
    public void solve() {
       //MazeCell mc = new MazeCell();
        Stack path = new Stack();
        // Your code goes here!!!!! Dont change ANYTHING else in this project!
        int row=1;
        int column = 1;
        path.push(row);
        path.push(column);
       while(row!=N/2||column!=N/2){
           drawCircle(Color.BLUE, row,column, SMALL);
           maze[row][column].visited = true;
           if(maze[row][column].nth == false && maze[row][column+1].visited==false){
               
               column++;
               path.push(row);
               path.push(column);
               drawCircle(Color.BLUE, row,column, SMALL);
               delay(SHORT);
              
              
               
           }
           else if(maze[row][column].sth == false && maze[row][column-1].visited == false){
              
               column--;
               path.push(row);
               path.push(column);
               drawCircle(Color.BLUE, row,column, SMALL);
               delay(SHORT);
              
              
           }
           else if(maze[row][column].est== false && maze[row+1][column].visited == false){
               
               row++;
               path.push(row);
               path.push(column);
               drawCircle(Color.BLUE, row,column, SMALL);
               delay(SHORT);
                       
               
           }
           else if(maze[row][column].wst == false && maze[row-1][column].visited == false){
              
               row--;
               path.push(row);
               path.push(column);
               drawCircle(Color.BLUE, row,column, SMALL);
               delay(SHORT);
               
              
           }else {
              
               column =(int)path.pop();
              row = (int) path.pop();
              if(maze[row-1][column].visited == true ){
                 
               drawCircle(Color.GRAY, row, column, SMALL);
               delay(SHORT);
           }
              else if(maze[row+1][column].visited == true){
                   drawCircle(Color.GRAY, row, column, SMALL);
               delay(SHORT);
              }
              else if(maze[row][column+1].visited ==true){
                   drawCircle(Color.GRAY, row, column, SMALL);
               delay(SHORT);
              }
              else if(maze[row][column-1].visited ==true){
                   drawCircle(Color.GRAY, row, column, SMALL);
               delay(SHORT);
              }
           
           
           
           }
      
}
}
}


        



class MazeCell {
    // nth, sth, est, wst used to identify walls - true indicates wall present 
    boolean nth, sth, wst, est;
    // used to indicate that a cell has already been processed
    boolean visited;

    public MazeCell() {
        // All walls are initially present for every cell
        nth = sth = est = wst = true;
        // Initially no cells have been visited
        visited = false;
    }
}

