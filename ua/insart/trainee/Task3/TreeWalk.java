package ua.insart.trainee.Task3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Семья on 01.01.2016.
 */
public class TreeWalk {
    private static List<File> fileList = new ArrayList<File>();
    static Object fileListMonitor = new Object();
    /*Creates a List of files with specified extension from the specified directory.
    * To gef files of any extensions You must specify fileExtension = "ignore"
     */
    public static List<File> getFilesBySourceAndExtension(String folderPath, String fileExtension){
        File baseFolder = new File(folderPath);
        if (baseFolder.isFile()){
            if (fileExtension.equals("ignore") || baseFolder.getName().endsWith(fileExtension))
                synchronized (fileListMonitor) {
                    fileList.add(baseFolder);
                }
        }else {
                new WalkThread(baseFolder, fileExtension);
        }


        return fileList;
    }
    public static List<File> getFilesBySourceAndExtension(File baseFolder, String fileExtension){
        if (baseFolder.isFile()){
            if (fileExtension.equals("ignore") || baseFolder.getName().endsWith(fileExtension))
                synchronized (fileListMonitor) {
                    fileList.add(baseFolder);
                }
        }else {
            new WalkThread(baseFolder, fileExtension);
        }


        return fileList;
    }
}
