ACCEPT  P_EMP_ID PROMPT 'INFORME O N�MERO DO FUNCION�RIO'
ACCEPT  P_LAST_NAME PROMPT 'INFORME O NOME DO FUNCION�RIO'

DECLARE
   V_EMP_ID NUMBER(5):=&P_EMP_ID;
   V_LN     VARCHAR(100) := initcap('&P_LAST_NAME');
   V_COUNT  INT := 1;
   V_TAX    NUMBER(3,1) NOT NULL DEFAULT 10;
   C_TAX    CONSTANT INT := 23 ;
BEGIN
   DBMS_OUTPUT.PUT_LINE(V_EMP_ID);
   DBMS_OUTPUT.PUT_LINE(V_COUNT);
   DBMS_OUTPUT.PUT_LINE('O NOME DO FUNCION�RIO �: '||V_LN);
   V_COUNT := V_COUNT + 1;
   DBMS_OUTPUT.PUT_LINE(V_COUNT);
END;
/