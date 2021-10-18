/**
 * @author: Luis Gonzalez
 * @email: luisgnzhdz@gmail.com
 * @about: Class node to return data 
 */
 class Node {
    private int data;
    private Node left, rigth;

    public Node(int data) {
        this.data = data;
        this.left = this.rigth = null;
    }


    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return rigth;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void printData() {
        System.out.println(this.getData());
    }
}