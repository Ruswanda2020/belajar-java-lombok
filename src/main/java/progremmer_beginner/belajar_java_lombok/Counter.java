package progremmer_beginner.belajar_java_lombok;

import lombok.Synchronized;

public class Counter {

    private final Object counterLock =new Object();

    private Long counter=0L;
    @Synchronized
    public void increment(){
        counter=counter+1;
    }
    @Synchronized
    public Long getCounter(){
        return counter;
    }
}
