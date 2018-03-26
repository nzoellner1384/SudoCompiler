/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudocompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;

/**
 *
 * @author nicholas
 */
public class FileDeconstructor {
    
    private static File file;
    private static TreeMap<Integer, String> lines;
    
    
    public static void deconstructFile(String path){
        file = new File(path);
        lines = new TreeMap();
        Scanner scanner;
        try {
            int index = 0;
            String extension = getFileExtension(file);
            if (!extension.trim().equals("n"))
                throw new InvalidFileTypeException("That is not a valid file type\n valid file types end with .n");
            scanner = new Scanner(file);
            while(scanner.hasNext()) {
                lines.put(index, scanner.nextLine());
                index++;
            }
        } catch (FileNotFoundException exception) {
            System.err.println("That is not a valid file");
        } catch (InvalidFileTypeException ex) {
            System.err.println("That is not a valid file type\nvalid file types end with .n" + ex);
        }
        
    }
    
    private static String getFileExtension(File file) {
        String path = file.getPath();
        String[] temp = path.split("\\.");
        String extension = "";
        if (temp.length > 1) 
            extension = temp[1];
        return extension;
    }
    
    public static TreeMap<Integer, String> getFileContent() {
        return lines;
    }
    
    public static String getFileName(File file) {
        String path = file.getPath();
        path = path.replace('\\', ' ');
        path = path.replace('.', ' ');
        path = path.replace('/', ' ');
        String[] temp = path.split(" ");
        String name = "";
        if (temp.length > 1)
            name = temp[temp.length - 2];
        return name;
    }
    
    private static void print(Object obj) {
        System.out.print(obj);
    }
    
    private static void println(Object obj) {
        System.out.println(obj);
    }
    
    private static void println() {
        System.out.println();
    }
    
    private static void printf(String s, Object ... args) {
        System.out.printf(s,args);
    }
    
}
