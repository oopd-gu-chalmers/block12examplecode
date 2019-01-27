package statictest;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    static int counterM = 0;
    static void increment(){ counterM++; }
    static int getCount(){ return counterM; }
    static ArrayList<Counter> myCounters
            = new ArrayList<>();

    static void incAll(){
        for (Counter counter : myCounters){
            counter.inc();
        }
    }

    public Counter(){
        myCounters.add(this);
    }

    int objGetCount(){ return counterM;}
    int counterO = 0;
    int getCountO(){ return counterO; }
    void inc() { counterO++; }

    public static void main(String[] args){
        //System.out.print(counterM);
        Counter one = new Counter();
        Counter two = new Counter();
        //System.out.print(Counter.myCounters.size());
        Counter.increment();
        one.inc();
        System.out.print(one.getCountO());
        System.out.print(two.getCountO());
        Counter.incAll();
        System.out.print(one.getCountO());
        System.out.print(two.getCountO());
    }

    //static int machineGetCountO(){ return counterO;}
}