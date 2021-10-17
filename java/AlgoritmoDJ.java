/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */


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
        Gui guiInterface = new Gui();
        guiInterface.setVisible(true);
    } 
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
    }
}