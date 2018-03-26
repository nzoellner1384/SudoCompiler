/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudocompiler;

import java.io.IOException;

/**
 *
 * @author nicholas
 */
public class SudoCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Converter converter;
        if (args.length != 0){
            FileDeconstructor.deconstructFile(args[0]);
            converter = new Converter(FileDeconstructor.getFileContent(), args[0]);
            converter.buildFile();
            converter.convertFile();
            BuildRunBatch brb = new BuildRunBatch(args[0]);
            BuildRunBash br = new BuildRunBash(args[0]);
        } else
            printlnErr("There was no file to be compiled.");
            System.exit(0);
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
    
    private static void printErr(Object obj) {
        System.err.print(obj);
    }
    
    private static void printlnErr(Object obj) {
        System.err.println(obj);
    }
    
    private static void printlnErr() {
        System.err.println();
    }
    
    private static void printfErr(String s, Object ... args) {
        System.err.printf(s,args);
    }
    
}
