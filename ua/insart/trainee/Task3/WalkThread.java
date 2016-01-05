package ua.insart.trainee.Task3;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Семья on 04.01.2016.
 */
public class WalkThread implements Runnable {
    private static AtomicInteger instanceCounter = new AtomicInteger(0);
    private static boolean started;
    private Thread t;
    private File folderPath;
    private String fileExtension;

    public WalkThread(File folderPath, String fileExtension){
        instanceCounter.incrementAndGet();
        started = true;
        this.folderPath = folderPath;
        this.fileExtension = fileExtension;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (File file : folderPath.listFiles()) {
            TreeWalk.getFilesBySourceAndExtension(file, fileExtension);
        }
        instanceCounter.decrementAndGet();
    }
    public static boolean isThreadsFinished(){
        boolean result = false;
        if (started && instanceCounter.intValue() == 0) {
            result = true;
        }
        return result;
    }
}
