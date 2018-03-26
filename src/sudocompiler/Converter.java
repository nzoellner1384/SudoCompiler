/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudocompiler;

import java.io.BufferedWriter;
import java.util.TreeMap;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;

/**
 *
 * @author nicholas
 */
public class Converter {
    
    private final TreeMap<Integer, String> LINES = new TreeMap();
    private TreeMap<Integer, String> endFile = new TreeMap();
    private final String fileName;
    private final File FILE;
    private FileWriter fw;
    BufferedWriter bw;
    
    public Converter(TreeMap<Integer, String> lines, String path) throws IOException {
        fileName = FileDeconstructor.getFileName(new File(path));
        FILE = new File(path.replace(".n", ".java"));
        FILE.createNewFile();
        fw = new FileWriter(FILE);
        bw = new BufferedWriter(fw);
        this.LINES.putAll(lines);
        int index = 0;
        endFile.put(index, String.format("public class %s {", fileName));
        index++;
        endFile.put(index, "}");
        for (Entry e : endFile.entrySet()) {
            bw.write(e.getValue() + "\n");
        }
        bw.close();
    }
    
    public void buildFile() {
        int index = 1;
        for (Entry e : LINES.entrySet()) {
            endFile.put(index, "\t" + e.getValue().toString());
            index++;
        }
        endFile.put(index + 1, "}");
    }
    public void convertFile() throws IOException{
        for (int i = 0; i < endFile.size() - 1; i++) {
            if (endFile.get(i).contains("func main")) {
                if (endFile.get(i).contains("main")) {
                    endFile.replace(i, "\tpublic static void main(String[] args) {");
                }
            }
            if (endFile.get(i).contains("println")) {
                endFile.replace(i, "\t\tSystem.out." + endFile.get(i).substring(2));
            }
            if (endFile.get(i).contains("printf")) {
                endFile.replace(i, "\t\tSystem.out." + endFile.get(i).substring(2));
            }
            if (endFile.get(i).contains("print(")) {
                endFile.replace(i, "\t\tSystem.out." + endFile.get(i).substring(2));
            }
        }
        fw = new FileWriter(FILE);
        bw = new BufferedWriter(fw);
        for (Entry e : endFile.entrySet())
            bw.write(e.getValue() + "\n");
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
