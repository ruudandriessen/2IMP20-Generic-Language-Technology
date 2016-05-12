package pico;


BLOCK = BLOCK_STATEMENT* ;

BLOCK_STATEMENT
    = CLASS_DECL
    | VAR_DECL
    | STATEMENT
    ;

STATEMENT
    = ASSIGN_STATEMENT
    | WHILE_STATEMENT
    ;

CLASS_DECL = "class" ID EXTENDS? BLOCK;

EXTENDS = "extends" USE;

