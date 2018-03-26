/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nicholas
 */
public enum Identifiers {
    
    FUNC ("func"), VAR ("var"), LET ("let"), IF ("if"), WHILE ("while"), TERNARY ("?"), RETURN ("return"),
    OR ("or"), AND ("and"), FOR ("for"), FOREACH ("foreach"), IN ("in"), TO ("to"), TRUE ("true"), FALSE ("false"),
    PRINT ("print"), PRINTLN ("println"), PRINTF ("printf"), LBRACE ("{"), RBRACE ("}"), LPAR ("("), RPAR (")"),
    COMMA (","), SIMOCOL (";"), COLON (":"), GREAT (">"), LESS ("<"), GREATEQU (">="), LESSEQU ("<="), NOTEQU ("!="),
    EQUAL ("=="), NOT ("!"), INCREASE ("++"), DECREASE ("--"), PLUS ("+"), MINUS ("-"), MULT ("*"), DIV ("/"), MOD ("%");
    
    public String id;
    
    Identifiers (String id) {
        this.id = id;
    }
    
}
