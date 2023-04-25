-- INTRODUÇÃO
-- Comando do SQL Developer, não é PL/SQL
SET SERVEROUT ON;
CLEAR SCREEN;

-- DECLARE
BEGIN
    DBMS_OUTPUT.PUT_LINE('Boa noite');
-- EXCEPTION
END;
/

-- EXERCÍCIO 1
DECLARE
    amount INTEGER(10);
BEGIN
    DBMS_OUTPUT.PUT_LINE(amount);
END;


-- EXERCÍCIO 2
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello World');
END;
/

-- Deixar a configuração da forma que você encontrou
SET SERVEROUT OFF;
