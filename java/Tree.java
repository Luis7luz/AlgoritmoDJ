/**
 * @author: Luis Gonzalez
 * @email: luisgnzhdz@gmail.com
 * @about: Class tree to insert data 
 */

public class Tree{
    private boolean exist(Node num, int search) {
        if (num == null) {
            return false;
        }
        if (num.getData() == search) {
            return true;
        } else if (search < num.getData()) {
            return exist(num.getIzquierda(), search);
        } else {
            return exist(num.getDerecha(), search);
        }

    }

    public void insert(int data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            this.insert(this.root, data);
        }
    }

    private void insert(Node dad, int data) {
        if (dato > dad.getData()) {
            if (dad.getRight() == null) {
                dad.setRight(new Node(data));
            } else {
                this.insert(dad.getRight(), data);
            }
        } else {
            if (dad.getLeft() == null) {
                dad.setLeft(new Node(data));
            } else {
                this.insert(dad.getLeft(), data);
            }
        }
    }

    private void inorden(Node n) {
        if (n != null) {
            inorden(n.getLeft());
            n.printData();
            inorden(n.getright());
        }
    }

    public void inorden() {
        this.inorden(this.root);
    }
}