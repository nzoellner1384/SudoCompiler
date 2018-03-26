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
 * @author nicholas
 */
class BuildRunBash {
    
    private File file;
    private BufferedWriter bw;
    
    public BuildRunBash(String fileName) throws IOException{
        fileName = fileName.replace('\\', ' ');
        fileName = fileName.replace('/', ' ');
        fileName = fileName.replace('.', ' ');
        String[] tempa = fileName.split(" ");
        String temp = "";
        int index = 0;
        while (index < tempa.length - 2) {
            temp += tempa[index] + "\\";
            index++;
        }
        file = new File(temp + "Run.sh");
        file.createNewFile();
        bw = new BufferedWriter(new FileWriter(file));
        bw.write("java " + tempa[tempa.length - 2] + "\n");
        bw.write("echo Finished!" + "\n");
        bw.close();
    }
    
}
