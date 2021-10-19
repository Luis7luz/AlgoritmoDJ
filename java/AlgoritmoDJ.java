/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 * This code was updated by Luis Gonzalez
 * Date: Monday 18 October 2021
 */
import java.util.Scanner;

class AlgoritmoDJ{
    /**
     * @about: Luis Gonzalez
     * En este metodo se iniciara sel setup del algoritmo
     */
    public void init(){
        this.start();
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
    private void start(){
        // . . .
        // . . .
        System.out.println("[OK] Starting . . . ");
        //Gui guiInterface = new Gui();
        //guiInterface.setVisible(true);
    } 
    //Create global array 
    public  int distance[] = new int[10];
    //Create global matrix
	public  int cost[][] = new int[10][10];

    //Create a method to calculate the fastest solve
    public void calculate(int number, int solves){
        //Create a auxiliary array
        int flag[] = new int[number + 1];
        //Create variables 
        int i = 0, j = 0, position = 1, minium = 0, counter = 0;
        //For cycle to match the arrays with the matrix
        for(i = 0; i<=number; i++){
            flag[i]=0;
            this.distance[i]=this.cost[solves][i];
        }
        counter = 2;
        //While Cycle to match the position 
        while(counter<=number){
            minium = 99;
            for(j = 0; j<=number; j++){
                if(this.distance[j]<minium && flag [j] != 1){
                    minium = this.distance[i];
                    position = j;
                }
            }

            flag[position] = 1;
            counter++;
            //For Cycle to sum the array with the matrix
            for(j = 0; j<=number; j++){
                if(distance[position]+ this.cost[position][j] < this.distance[j] && flag[j] != 1){
                    this.distance[j] = this.distance[position] + this.cost[position][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        //AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        //algoritmoDJ.init();
        int nodes = 0, origin = 0, i = 0, j = 0;

        //Create a method Scanner to read values 
        Scanner read = new Scanner(System.in);

        System.out.println("Insert the number of nodes that you want to");
        nodes = read.nextInt();

        //Crate a object 
        AlgoritmoDJ object = new AlgoritmoDJ();

        System.out.println("Insert the distance ");

        for(i = 1; i <= nodes; i++){
            for(j = 1; j <= nodes; j++){
              object.cost[i][j]=read.nextInt();
              if(object.cost[i][j]==0)
                object.cost[i][j]=999;
            }
        }

        System.out.println("Insert the node origen (The begginnig of the binary tree) ");
        origin = read.nextInt();
        //Call method calculate
        object.calculate(nodes, origin);

        //Print the course values
        for(i = 0; i <= nodes; i++){
            if(i != origin){
                System.out.println("Origin: " + origin + " Destination: " + i + " Minium: " + object.distance[i] + "\t");
            }
        }
    }
}