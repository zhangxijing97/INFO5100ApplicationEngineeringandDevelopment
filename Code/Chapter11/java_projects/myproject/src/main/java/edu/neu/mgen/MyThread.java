package edu.neu.mgen;

class MyThread extends Thread {
    private String name;
    private long executionTime;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            System.out.println(name + ": " + i);
        }
        
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
