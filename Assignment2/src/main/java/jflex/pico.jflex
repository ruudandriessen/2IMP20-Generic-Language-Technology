
BLOCK = "{" BLOCK_STATEMENT* "}";

BLOCK_STATEMENT
    = CLASS-DECL
    | VAR-DECL
    | STATEMENT
    ;

STATEMENT
    = ASSIGN-STATEMENT
    | WHILE-STATEMENT
    ;

CLASS-DECL = "class" ID EXTENDS? BLOCK;

EXTENDS = "extends" USE;