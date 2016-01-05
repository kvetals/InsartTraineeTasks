package ua.insart.trainee.Task3;

import java.io.File;
import java.util.List;

/**
 * Created by Семья on 01.01.2016.
 */
public class TestTask3 {
    public static void main(String[] args) {
        List<File> files = TreeWalk.getFilesBySourceAndExtension("./Task3FolderForWalk", "ignore");
        while(!WalkThread.isThreadsFinished()){}

        for (File file : files){
            System.out.println(file.getName());
        }
        System.out.println("total files quantity = " + files.size());
    }
}
