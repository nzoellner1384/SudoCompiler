/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudocompiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nzoel
 */
public class BuildRunBatch {
    
    private File file;
    private BufferedWriter bw;
    
    public BuildRunBatch (String fileName) throws IOException {
        fileName = fileName.replace('\\', ' ');
        fileName = fileName.replace('/', ' ');
        fileName = fileName.replace('.', ' ');
        String[] tempa = fileName.split(" ");
        String temp = "";
        int index = 0;
        while(index < tempa.length - 2) {
            temp += tempa[index] + "\\";
            index++;
        }
        file = new File(temp + "Run.bat");
        file.createNewFile();
        bw = new BufferedWriter(new FileWriter(file));
        bw.write("@echo off" + "\n");
        bw.write("java " + tempa[tempa.length - 2] + "\n");
        bw.write("@echo Finished!" + "\n");
        bw.write("pause");
        bw.close();
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
