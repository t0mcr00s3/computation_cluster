package data;

import java.util.Random;
import java.util.Vector;

import vector.Vectorable;

public class Data implements Vectorable{
    private Vector<Integer> vec = new Vector<Integer>();

    public Data(int task){
        for(int i = 0; i < 1000; i++){
            vec.add(new Random().nextInt(1000));
        }
    }

    @Override
    public Vector<Integer> getVector(){
        return this.vec;
    }
}
