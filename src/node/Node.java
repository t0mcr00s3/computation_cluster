package node;

import java.util.Vector;

public class Node {
    private Vector<Integer> vec;

    public Node(Vector<Integer> vec){
        this.vec = vec;
    }

    public void Computation(){
        this.vec
            .stream()
            .forEach(e -> System.out.println(e + " "));
    }
}