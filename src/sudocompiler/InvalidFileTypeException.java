/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudocompiler;

/**
 *
 * @author nicholas
 */
public class InvalidFileTypeException extends Throwable{
    
    public InvalidFileTypeException () {
    }
    
    public InvalidFileTypeException (String message) {
        super(message);
    }
    
}
