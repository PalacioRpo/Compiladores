package apcompiladorpilaatributos;

public class Proyecto_2 {

    static Lexico lexico = new Lexico();
    
    static String cad="10^(3-1)+7*8-4/2¬";
    static String cad1 = "0123456789.";
    
    static int indice=0;
    static char sim=' ';
    static Lexico lex1 = new Lexico();
    static String cadavance="";
    static Analizador analizador = new Analizador();
    
    public static void main(String[] args) {

        analisisLexico();
        cad=lex1.cadenaLexico();
        sim=lex1.darElemento(indice).darTipo();
        cadavance=cadavance+sim;
        // crea los nodos para determinar el fondo de pila con v y el axioma
        // o no terminal inicial s

        NoTerminal v = new NoTerminal("v",0,0);
        NoTerminal s = new NoTerminal("s",0,0);
        // adiciona a la pila el fondo v y el axiona s. (en la clase analizador se 
        // tiene un arrayList para controlar la pila
        
        analizador.adicionarNodo(v);
        analizador.adicionarNodo(s);
       // analizador.mostrarCadenaPila();
        NoTerminal nt=null;
        
        // Realiza un ciclo do-while para controlar la cadena y realiza dos switches para
        // controlar la tabla de control, el primero para evaluar la entrada y el
        // segundo para evaluar los símbolos de pila
        
        do{
            System.out.println("Entra al do");
            
            switch (sim) {
            // los símbolos de entrada son i,+,*
            case 'i': 
                 System.out.println("Entra al i");
                // en nt se almacena el nodo ultimo de la pila
                nt = analizador.getnode(analizador.ultimo());
            // los símbolos de pila son s,e,el,t,tl,p,pl,f,)
                 System.out.println(nt.getNombre());
                switch  (nt.getNombre()){
                    case "s": 
                              proceso1();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ELO": 
                              proceso2();
                              analizador.mostrarCadenaPila();
                              break;
                    case "EL2": 
                              proceso5();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ER": 
                              proceso8();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E": 
                              proceso21();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ME": 
                              proceso13();
                              analizador.mostrarCadenaPila();
                              break;
                    case "MA": 
                              proceso16();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T": 
                              proceso25();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P": 
                              proceso29();
                              analizador.mostrarCadenaPila();
                              break;
                    case "F": 
                              proceso33();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul":
                              System.out.println("Intenta");
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;    
                    case "exp": 
                              exponente();
                              break;      
                    case "res": 
                              resultado();
                              break; 
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    
                    default : rechace();
                }
                break;
            case '+':
                 System.out.println("Entra al +");
                nt = analizador.getnode(analizador.ultimo());
                System.out.println(nt);
                 System.out.println(nt.getNombre());
                switch  (nt.getNombre()){
                    case "E_L": proceso22();
                             analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break; 
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;           
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;         
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break; 
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '-':
                 System.out.println("Entra al -");
                nt = analizador.getnode(analizador.ultimo());
                 System.out.println(nt.getNombre());
                switch  (nt.getNombre()){
                    case "E_L": proceso23();
                             analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break; 
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;           
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;         
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break; 
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '*':
                 System.out.println("Entra al *");
                nt = analizador.getnode(analizador.ultimo());
                 System.out.println(nt.getNombre().toUpperCase());
                switch  (nt.getNombre()){
                    case "T_L": proceso26();
                              analizador.mostrarCadenaPila();
                              break; 
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;           
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;         
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break; 
            case '/':
                 System.out.println("Entra al /");
                nt = analizador.getnode(analizador.ultimo());
                 System.out.println(nt.getNombre());
                switch  (nt.getNombre()){
                    case "T_L": proceso27();
                              analizador.mostrarCadenaPila();
                              break; 
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;           
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;         
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;  
            case '^':
                
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al ^");
                switch  (nt.getNombre()){
                    case "P_L": proceso30();
                              analizador.mostrarCadenaPila();
                              break;           
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;         
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break; 
            case '<':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al <");
                switch  (nt.getNombre()){
                    case "ER_L": proceso9();
                              analizador.mostrarCadenaPila();
                              break;
                    case "OR": proceso11();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '>':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al >");
                switch  (nt.getNombre()){
                    case "ER_L": proceso9();
                              analizador.mostrarCadenaPila();
                              break;
                    case "OR": proceso14();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break; 
            
            case '=': 
                // en nt se almacena el nodo ultimo de la pila
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al =");
            // los símbolos de pila son s,e,el,t,tl,p,pl,f,)
                switch  (nt.getNombre()){
                    case "ER_L": 
                              proceso9();
                              analizador.mostrarCadenaPila();
                              break;
                    case "OR": 
                              proceso17();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ME": 
                              proceso12();
                              analizador.mostrarCadenaPila();
                              break;
                    case "MA": 
                              proceso15();
                              analizador.mostrarCadenaPila();
                              break;
                    case "IG": 
                              proceso18();
                              analizador.mostrarCadenaPila();
                              break;
                    case "DI": 
                              proceso20();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": 
                              proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": 
                              proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": 
                              proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;               
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                }
                break;
            case '!':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al !");
                switch  (nt.getNombre()){
                    case "ER_L": proceso9();
                              analizador.mostrarCadenaPila();
                              break;
                    case "OR": proceso19();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '|':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al |");
                switch  (nt.getNombre()){
                    case "ELO_L": proceso3();
                              analizador.mostrarCadenaPila();
                              break;
                    case "EL2_L": proceso7();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ER_L": proceso10();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '&':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al &");
                switch  (nt.getNombre()){
                    case "EL2_L": proceso6();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ER_L": proceso10();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              //exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            case '(': 
                // en nt se almacena el nodo ultimo de la pila
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al (");
            // los símbolos de pila son s,e,el,t,tl,p,pl,f,)
                switch  (nt.getNombre()){
                    case "s": 
                              proceso1();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ELO": 
                              proceso2();
                              analizador.mostrarCadenaPila();
                              break;
                    case "EL2": 
                              proceso5();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ER": 
                              proceso8();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E": 
                              proceso21();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ME": 
                              proceso13();
                              analizador.mostrarCadenaPila();
                              break;
                    case "MA": 
                              proceso16();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T": 
                              proceso25();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P": 
                              proceso29();
                              analizador.mostrarCadenaPila();
                              break;
                    case "F": 
                              proceso32();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break; 
                    case "div": 
                              division();
                              break;    
                    case "exp": 
                              exponente();
                              break;    
                              
                    case "res": 
                              resultado();
                              break;
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                }
                break; //esto es un comentario
            case ')':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al )");
                switch  (nt.getNombre()){
                    case "ELO_L": proceso4();
                              analizador.mostrarCadenaPila();
                              break;
                    case "EL2_L": proceso7();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ER_L": proceso10();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case ")": procesoParentesis();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;  
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    //break;
                }
                break;
            
            case '¬':
                nt = analizador.getnode(analizador.ultimo());
                System.out.println("Entra al ¬");
                switch  (nt.getNombre()){
                    case "ELO_L": proceso4();
                              analizador.mostrarCadenaPila();
                              break;
                    case "EL2_L": proceso7();
                              analizador.mostrarCadenaPila();
                              break;
                    case "ER_L": proceso10();
                              analizador.mostrarCadenaPila();
                              break;
                    case "E_L": proceso24();
                              analizador.mostrarCadenaPila();
                              break;
                    case "T_L": proceso28();
                              analizador.mostrarCadenaPila();
                              break;
                    case "P_L": 
                              System.out.println("Entra");
                              proceso31();
                              analizador.mostrarCadenaPila();
                              break;
                    case "sum": 
                              suma();
                              break;
                    case "rest": 
                              resta();
                              break;
                    case "mul": 
                              mul();
                              break;
                    case "div": 
                              division();
                              break;
                    case "exp": 
                              exponente();
                              break;
                    case "res": 
                              resultado();
                              break;
                    case "pRelacional": 
                              pRelacional();
                              analizador.mostrarCadenaPila();
                              break;
                    case "pComparar": 
                              pComparar();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procOR": 
                              procOR();
                              analizador.mostrarCadenaPila();
                              break;
                    case "procAND": 
                              procAND();
                              analizador.mostrarCadenaPila();
                              break;
                    default : rechace();
                    
            }
            break;
                
            default: rechace();
        }
            nt=analizador.getnode(analizador.ultimo());
          
            
        }while (!nt.getNombre().equalsIgnoreCase("v"));
        
        if (nt.getNombre().equalsIgnoreCase("v")){
            System.out.println("Se acepta la secuencia ");
        }
        else
            System.out.println("Se rechaza la secuencia ");
        }
    
    
    
    public static void proceso1(){
    System.out.println("proceso1");
    //1. <S> --> <ELO>s1 {resultado} i1 
    //       i1<-s1
    int u = analizador.ultimo();
    // se van a crear cuatro objetos para analizador             
    NoTerminal i1 = new NoTerminal("i1",0,0);//u
    NoTerminal res = new NoTerminal("res",0,0);//u+1
    NoTerminal ELO = new NoTerminal("ELO",0,0);//u+2
    NoTerminal s1 = new NoTerminal("s1",u,0);//u+3
    s1.setValorLogico((int)i1.getValorLogico());
    analizador.removeNodo(u);  //pop <S> 
    analizador.adicionarNodo(i1);  // Push(i1
    analizador.adicionarNodo(res);  // Push(res)
    analizador.adicionarNodo(s1);  // Push(s1)
    analizador.adicionarNodo(ELO);  // Push(ELO)
}

public static void proceso2(){
    System.out.println("proceso2");
    NoTerminal nt;
    //2. <ELO> s1 --> <EL2> s2 <ELO_L> i1,s3
    //          s1<-s3   i1<-s2  
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    NoTerminal s3 = new NoTerminal("s3",nt.getDirec(),0);//u-1
    s3.setValorLogico((int)nt.getValorLogico());
    NoTerminal i1 = new NoTerminal("i1",0,0);//u
    NoTerminal ELO_L = new NoTerminal("ELO_L",0,0);//u+1
    NoTerminal s2 = new NoTerminal("s2",u,0);//u+2
    NoTerminal EL2 = new NoTerminal("EL2",0,0);//u+3
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.adicionarNodo(s3);
    analizador.adicionarNodo(i1);
    analizador.adicionarNodo(ELO_L);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(EL2);
}


public static void proceso3(){
    System.out.println("proceso3");
NoTerminal nt,nt2;
//3. <ELO_L> i1,s1 --> | <EL2> s2{pRelacional} i2,i3 {procOR} i4,i5,s4 <ELO_L> i6,s5
//     (i2,i4)<-i1   (i3,i5)<-s2   i6<-s4   s1<-s5

// Al desapilar se tienen que quitar dos nodos u y u-1
int u = analizador.ultimo();
nt=analizador.getnode(u-1);
nt2=analizador.getnode(u-2);
NoTerminal s5 = new NoTerminal("s5",nt2.getDirec(),0);//u-2
NoTerminal i6 = new NoTerminal("i6",0,0);//u-1
NoTerminal ELO_L = new NoTerminal("ELO_L",0,0);//u
NoTerminal s4 = new NoTerminal("s4",u-1,0);//u+1
NoTerminal i5 = new NoTerminal("i5",0,0);//u+2
NoTerminal i4 = new NoTerminal("i4",0,nt.getValor());//u+3
NoTerminal procOR = new NoTerminal("procOR",0,0);//u+4
NoTerminal i3 = new NoTerminal("i3",0,0);//u+5
NoTerminal i2 = new NoTerminal("i2",0,nt.getValor());//u+6
NoTerminal pRelacional = new NoTerminal("pRelacional",0,0);//u+7
NoTerminal s2 = new NoTerminal("s2",u+2,0);//u+8
NoTerminal EL2 = new NoTerminal("EL2",0,0);//u+9
s2.setValorLogico((int)nt2.getValorLogico());
i4.setValorLogico((int)nt.getValorLogico());
i3.setValorLogico((int)i5.getValorLogico());
i2.setValorLogico((int)i4.getValorLogico());

analizador.removeNodo(u);
analizador.removeNodo(u-1);        
analizador.removeNodo(u-2);        
analizador.adicionarNodo(s5);           //u-11
analizador.adicionarNodo(i6);           //u-10
analizador.adicionarNodo(ELO_L);        //u-9
analizador.adicionarNodo(s4);           //u-8
analizador.adicionarNodo(i5);           //u-7
analizador.adicionarNodo(i4);           //u-6
analizador.adicionarNodo(procOR);       //u-5
analizador.adicionarNodo(i3);           //u-4
analizador.adicionarNodo(i2);           //u-3
analizador.adicionarNodo(pRelacional);  //u-2
analizador.adicionarNodo(s2);           //u-1
analizador.adicionarNodo(EL2);          //u
/*nt3=analizador.getnode(u-7);
nt4=analizador.getnode(u-4);
nt5=analizador.getnode(u-1);
nt3.setValor(nt5.getValor());
nt4.setValor(nt5.getValor());*/
avance();
}

public static void proceso4(){
    System.out.println("proceso4");
    NoTerminal nt,nt2,nt3;
    //4. <ELO_L> i1,s1 --> e
    //         s1<- i1   
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    nt3=analizador.getnode(nt2.getDirec());
    nt3.setValor(nt.getValor());
    nt3.setValorLogico((int)nt.getValorLogico());
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    //retiene
}

public static void proceso5(){
    System.out.println("proceso5");
    NoTerminal nt;
    //5. <EL2> s1 --> <ER> s2 <EL2_L> i1,s3
    //          s1<-s3     i1<-s2   
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    NoTerminal s3 = new NoTerminal("s3",nt.getDirec(),0);//u-1
    NoTerminal i1 = new NoTerminal("i1",0,0);//u
    NoTerminal EL2_L1 = new NoTerminal("EL2_L",0,0);//u+1
    NoTerminal s2 = new NoTerminal("s2",u,0);//u+2
    NoTerminal ER = new NoTerminal("ER",0,0);//u+3
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.adicionarNodo(s3);
    analizador.adicionarNodo(i1);
    analizador.adicionarNodo(EL2_L1);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(ER);
    
}


public static void proceso6(){
    System.out.println("proceso6");
    NoTerminal nt,nt2;
    //6. <EL2_L> i1,s1--> & <ER> s2{pRelacional} i2,i3{procAND} i4,i5,s4 <EL2_L> i6,s5

    //   (i2,i4)<-i1  (i3,i5)<-s2  i6<-s4  s1<-s5
    
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    NoTerminal s5 = new NoTerminal("s5",nt2.getDirec(),0);//u-2
    NoTerminal i6 = new NoTerminal("i6",0,0);//u-1
    NoTerminal EL2_L1 = new NoTerminal("EL2_L",0,0);//u
    NoTerminal s4 = new NoTerminal("s4",u-1,0);//u+1
    NoTerminal i5 = new NoTerminal("i5",0,0);//u+2
    NoTerminal i4 = new NoTerminal("i4",0,nt.getValor());//u+3
    NoTerminal procAND = new NoTerminal("procAND",0,0);//u+4
    NoTerminal i3 = new NoTerminal("i3",0,0);//u+5
    NoTerminal i2 = new NoTerminal("i2",0,nt.getValor());//u+6
    NoTerminal pRelacional = new NoTerminal("pRelacional",0,0);//u+7
    NoTerminal s2 = new NoTerminal("s2",u+2,0);//u+8
    NoTerminal ER = new NoTerminal("ER",0,0);//u+9
    System.out.println(i4.getValorLogico()+"--"+i5.getValorLogico());
    s2.setValorLogico((int)nt2.getValorLogico());
    i4.setValorLogico((int)nt.getValorLogico());
    i3.setValorLogico((int)i5.getValorLogico());
    i2.setValorLogico((int)i4.getValorLogico());
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.adicionarNodo(s5);
    analizador.adicionarNodo(i6);
    analizador.adicionarNodo(EL2_L1);
    analizador.adicionarNodo(s4);
    analizador.adicionarNodo(i5);
    analizador.adicionarNodo(i4);
    analizador.adicionarNodo(procAND);
    analizador.adicionarNodo(i3);
    analizador.adicionarNodo(i2);
    analizador.adicionarNodo(pRelacional);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(ER);
    /*nt3=analizador.getnode(u-7);
    nt4=analizador.getnode(u-4);
    nt5=analizador.getnode(u-1);
    nt3.setValor(nt5.getValor());
    nt4.setValor(nt5.getValor());*/
    avance();
    }

public static void proceso7(){
    System.out.println("proceso7");
    NoTerminal nt,nt2,nt3;
    //7. <EL2_L> i1,s1--> e
    //         s1<- i1   
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    nt3=analizador.getnode(nt2.getDirec());
    nt3.setValor(nt.getValor());
    nt3.setValorLogico((int)nt.getValorLogico());
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
}

public static void proceso8(){
    System.out.println("proceso8");
    NoTerminal nt;
    //8. <ER> s1 --> <E> s2 <ER_L> i1,s3
    //          s1<-s3     i1<-s2   
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    NoTerminal s3 = new NoTerminal("s3",nt.getDirec(),0);//u-1
    NoTerminal i1 = new NoTerminal("i1",0,0);//u
    NoTerminal ER_L = new NoTerminal("ER_L",0,0);//u+1
    NoTerminal s2 = new NoTerminal("s2",u,0);//u+2
    NoTerminal E = new NoTerminal("E",0,0);//u+3
    s3.setValorLogico((int)nt.getValorLogico());
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.adicionarNodo(s3);
    analizador.adicionarNodo(i1);
    analizador.adicionarNodo(ER_L);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(E);
    //retiene
}

public static void proceso9(){
    System.out.println("proceso9");
    NoTerminal nt,nt2;
    //9. <ER_L> i1,s1--> <OR> s2 <E>s3{pComparar} i2,i3,i4,s4
    //   i2<-i1  i3<-s3  i4<-s2  s1<-s4
    
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0);//u-2
    s4.setValorLogico((int)nt2.getValorLogico());
    NoTerminal i4 = new NoTerminal("i4",0,0);//u-1
    NoTerminal i3 = new NoTerminal("i3",0,0);//u
    NoTerminal i2 = new NoTerminal("i2",0,nt.getValor());//u+1
    NoTerminal pComparar = new NoTerminal("pComparar",0,0);//u+2
    NoTerminal s3 = new NoTerminal("s3",u,0);//u+3
    NoTerminal E = new NoTerminal("E",0,0);//u+4
    NoTerminal s2 = new NoTerminal("s2",u-1,0);//u+5
    NoTerminal OR = new NoTerminal("OR",0,0);//u+6

    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.adicionarNodo(s4);
    analizador.adicionarNodo(i4);
    analizador.adicionarNodo(i3);
    analizador.adicionarNodo(i2);
    analizador.adicionarNodo(pComparar);
    analizador.adicionarNodo(s3);
    analizador.adicionarNodo(E);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(OR);
    //retiene
    }



    public static void proceso10(){
        System.out.println("proceso10");
        NoTerminal nt,nt2,nt3;
        //10. <ER_L> i1,s1--> e
        //         s1<- i1   
        // Al desapilar se tienen que quitar dos nodos u y u-1
        int u = analizador.ultimo();
        nt=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt.getValor());
        nt3.setValorLogico((int)nt.getValorLogico());
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        //retiene...supongo que es una funcion
    }

public static void proceso11(){
    System.out.println("proceso11");
    NoTerminal nt;
    //11. <OR> s1--> < <ME> s2
    //           s1<-s2   
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);//u-1
    NoTerminal ME = new NoTerminal("ME",0,0);//u
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(ME);
    avance();
}

public static void proceso12(){
    System.out.println("proceso12");
    NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // el 
        nt1=analizador.getnode(u-1);  // i1
        System.out.println(nt1.getDirec());
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(1);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
    avance();
}

public static void proceso13(){
    //13. <ME> s1 --> e
    // 
    System.out.println("proceso13");
    NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // el 
        nt1=analizador.getnode(u-1);  // i1
        System.out.println(nt1.getDirec());
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(2);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        //retiene...supongo que es una funcion
}

public static void proceso14(){
    System.out.println("proceso14");
    NoTerminal nt;
    //14. <OR> s1--> > <MA> s2
    //        s1<-s2    
    // Al desapilar se tienen que quitar dos nodos u y u-1
    int u = analizador.ultimo();
    nt=analizador.getnode(u-1);
    NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);//u-1
    NoTerminal MA = new NoTerminal("MA",0,0);//u
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.adicionarNodo(s2);
    analizador.adicionarNodo(MA);
    avance();
}

public static void proceso15(){
    System.out.println("proceso15");
    NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // el 
        nt1=analizador.getnode(u-1);  // i1
        System.out.println(nt1.getDirec());
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(3);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
    avance();
}

public static void proceso16(){
    System.out.println("proceso16");
    //13. <MA> s1--> e
    //       s1<- 4
    NoTerminal nt1,nt2;
        int u = analizador.ultimo();  // el 
        nt1=analizador.getnode(u-1);  // i1
        System.out.println(nt1.getDirec());
        nt2=analizador.getnode(nt1.getDirec());
        nt2.setValor(4);
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        //retiene...supongo que es una funcion
}
////////////////////////////////////////////////////////
////////////////////////////////////////////////////////

    
    public static void proceso17(){
        System.out.println("proceso17");
        NoTerminal nt;
        //17. <OR> s1 --> =<IG> s2  s1<-s2
        // Al desapilar se tienen que quitar dos nodos u y u-1
        int u = analizador.ultimo();
        nt=analizador.getnode(u-1);
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);
        NoTerminal IG = new NoTerminal("IG",0,0);
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s2);
        analizador.adicionarNodo(IG);
        avance();
    }
    
    ////////////////////////////////////////////////////////
                // AYUDAAAAAAAAAAAAAAAAAAAAA //
    ////////////////////////////////////////////////////////
    
    
       public static void proceso18(){
           System.out.println("proceso18");
           NoTerminal nt1,nt2;
            int u = analizador.ultimo();  // el 
            nt1=analizador.getnode(u-1);  // i1
            System.out.println(nt1.getDirec());
            nt2=analizador.getnode(nt1.getDirec());
            nt2.setValor(5);
            analizador.removeNodo(u);  // Pop  (el)
            analizador.removeNodo(u-1);
           avance();
    }
    
    
    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
    
        public static void proceso19(){
        System.out.println("proceso19");
        NoTerminal nt;
        //19. <OR> s1 --> !<DI> s2  s1<-s2
        // Al desapilar se tienen que quitar dos nodos u y u-1
        int u = analizador.ultimo();
        nt=analizador.getnode(u-1);
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);
        NoTerminal DI = new NoTerminal("DI",0,0);
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s2);
        analizador.adicionarNodo(DI);
        avance();
    }
    
    ////////////////////////////////////////////////////////
                // AYUDAAAAAAAAAAAAAAAAAAAAA //
    ////////////////////////////////////////////////////////
        public static void proceso20(){
           System.out.println("proceso20");
           NoTerminal nt1,nt2;
            int u = analizador.ultimo();  // el 
            nt1=analizador.getnode(u-1);  // i1
            System.out.println(nt1.getDirec());
            nt2=analizador.getnode(nt1.getDirec());
            nt2.setValor(6);
            analizador.removeNodo(u);  // Pop  (el)
            analizador.removeNodo(u-1);
           avance();
    }
    ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////
         
         
         public static void proceso21(){
        System.out.println("proceso21");
        NoTerminal nt;
        //21. <E> s1 --> <T> s2 <E_L> i1,s3     s1<-s3   i1<-s2
        // Al desapilar se tienen que quitar dos nodos u y u-1
        int u = analizador.ultimo();
        nt=analizador.getnode(u-1);
        NoTerminal s3 = new NoTerminal("s3",nt.getDirec(),0);  
        NoTerminal i1 = new NoTerminal("il",0,0);
        NoTerminal E_L = new NoTerminal("E_L",0,0); 
        NoTerminal s2 = new NoTerminal("s2",u,0);   
        NoTerminal T = new NoTerminal("T",0,0); 
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.adicionarNodo(s3);
        analizador.adicionarNodo(i1);
        analizador.adicionarNodo(E_L);
        analizador.adicionarNodo(s2);
        analizador.adicionarNodo(T);
    }
         
         
    public static void proceso22(){
        System.out.println("proceso22");
        // 22. <E_L> --> +<T>{suma}<E_L>   
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0);  //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0);               //u-1
        NoTerminal E_L = new NoTerminal("E_L",0,0);               //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0);             //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0);               //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor());  //u+3
        NoTerminal sum = new NoTerminal("sum",0,0);             //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0);             //u+5
        NoTerminal T = new NoTerminal("T",0,0);                 //u+5
        
        analizador.removeNodo(u);   // Pop  (e_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(E_L); //  Push (el)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(sum); //  Push (sum)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(T); //  Push (t)
        avance();
    }
    
    public static void proceso23(){
        System.out.println("proceso23");
        // 23. <E_L> --> -<T>{resta}<E_L>   
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0);  //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0);               //u-1
        NoTerminal E_L = new NoTerminal("E_L",0,0);               //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0);             //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0);               //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor());  //u+3
        NoTerminal rest = new NoTerminal("rest",0,0);             //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0);             //u+5
        NoTerminal T = new NoTerminal("T",0,0);                 //u+5
        
        analizador.removeNodo(u);   // Pop  (e_l)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(E_L); //  Push (el)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(rest); //  Push (sum)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(T); //  Push (t)
        avance();
    }
    
    
      public static void proceso24(){
          System.out.println("proceso24");
        // 24. <E_L> --> e
        NoTerminal nt1,nt2,nt3;
        System.out.println(" entro a proceso 24");
        int u = analizador.ultimo();  // el 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico((int)nt1.getValorLogico());
        analizador.removeNodo(u);  // Pop  (el)
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
    }
      
    
     public static void proceso25(){
         System.out.println("proceso25");
        //2. <T> --> <P><T_L>    i1<-s2  s1<-s3
        NoTerminal nt1;
               
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal T_L = new NoTerminal("T_L",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal P = new NoTerminal("P",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (<E>)
        analizador.removeNodo(u-1);   // Pop (s1)
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(T_L); // Push(<E_L>)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(P); // Push(<T>)
        
    }
     
    
     public static void proceso26(){
         System.out.println("proceso26");
        // 4. <T_L> --> *<P>{mul}<T_L>   
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u-1
        NoTerminal T_L = new NoTerminal("T_L",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0); //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+3
        NoTerminal mul = new NoTerminal("mul",0,0); //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+5
        NoTerminal P = new NoTerminal("P",0,0); //u+5
        analizador.removeNodo(u);   // Pop  (T_L)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(T_L); //  Push (T_L)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(mul); //  Push (res)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(P); //  Push (T)
        avance();
    }
     
     
    public static void proceso27(){
        System.out.println("proceso27");
        // 4. <T_L> --> /<P>{div}<T_L>   
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u-1
        NoTerminal T_L = new NoTerminal("T_L",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0); //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+3
        NoTerminal div = new NoTerminal("div",0,0); //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+5
        NoTerminal P = new NoTerminal("P",0,0); //u+5
        analizador.removeNodo(u);   // Pop  (T_L)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(T_L); //  Push (T_L)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(div); //  Push (res)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(P); //  Push (T)
        avance();
    }
     
    
      public static void proceso28(){
          System.out.println("proceso28");
        // 7. <T-L> --> e
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // T_L 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico((int)nt1.getValorLogico());
        analizador.removeNodo(u);  // Pop  (E_L)
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
    }
     
    
      public static void proceso29(){
          System.out.println("proceso29");
        //2. <P> --> <F><P_L>    i1<-s2  s1<-s3
        NoTerminal nt1;
               
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        
        NoTerminal s3 = new NoTerminal("s3",nt1.getDirec(),0);  //u-1
        NoTerminal i1 = new NoTerminal("i1",0,0);               //u
        NoTerminal P_L = new NoTerminal("P_L",0,0);               //u+1
        NoTerminal s2 = new NoTerminal("s2",u,0);               //u+2
        NoTerminal F = new NoTerminal("F",0,0);                 //u+3
        
        analizador.removeNodo(u);   // Pop (<E>)
        analizador.removeNodo(u-1);   // Pop (s1)
        
        analizador.adicionarNodo(s3); // Push(s3)
        analizador.adicionarNodo(i1);  // Push(i1)
        analizador.adicionarNodo(P_L); // Push(<P_L>)
        analizador.adicionarNodo(s2);  // Push(s2)
        analizador.adicionarNodo(F); // Push(<F>)
    
    }
      
      
       public static void proceso30(){
           System.out.println("proceso30");
        // 4. <P_L> --> ^<F>{exp}<P_L>   
        NoTerminal nt1,nt2;
               
        int u = analizador.ultimo();
        nt1 = analizador.getnode(u-1);
        nt2 = analizador.getnode(u-2);
        NoTerminal s4 = new NoTerminal("s4",nt2.getDirec(),0); //u-2
        NoTerminal i4 = new NoTerminal("i4",0,0); //u-1
        NoTerminal P_L = new NoTerminal("P_L",0,0); //u
        NoTerminal s3 = new NoTerminal("s3",u-1,0); //u+1
        NoTerminal i3 = new NoTerminal("i3",0,0); //u+2
        NoTerminal i2 = new NoTerminal("i2",0,nt1.getValor()); //u+3
        NoTerminal exp = new NoTerminal("exp",0,0); //u+4
        NoTerminal s2 = new NoTerminal("s2",u+2,0); //u+5
        NoTerminal F = new NoTerminal("F",0,0); //u+5
        analizador.removeNodo(u);   // Pop  (T_L)
        analizador.removeNodo(u-1);   // Pop  (i1)
        analizador.removeNodo(u-2);   // Pop  (s1)
        analizador.adicionarNodo(s4); //  Push (s4)
        analizador.adicionarNodo(i4);  // Push(i4)
        analizador.adicionarNodo(P_L); //  Push (T_L)
        analizador.adicionarNodo(s3); //  Push (s3)
        analizador.adicionarNodo(i3); //  Push (i3)
        analizador.adicionarNodo(i2); //  Push (i2)
        analizador.adicionarNodo(exp); //  Push (res)
        analizador.adicionarNodo(s2); //  Push (s2)
        analizador.adicionarNodo(F); //  Push (T)
        avance();
    }
    
       
      public static void proceso31(){
          System.out.println("proceso31");
        // 7. <P_L> --> e
        NoTerminal nt1,nt2,nt3;
        int u = analizador.ultimo();  // T_L 
        nt1=analizador.getnode(u-1);  // i1
        nt2=analizador.getnode(u-2);  // s1
        nt3=analizador.getnode(nt2.getDirec());
        nt3.setValor(nt1.getValor());
        nt3.setValorLogico((int)nt1.getValorLogico());
        analizador.removeNodo(u);  // Pop  (P_L)
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
    }
      
    
      
    public static void proceso32(){
        System.out.println("proceso32");
        // 7. <F> --> (<ELO>)
        NoTerminal nt ;
        int u = analizador.ultimo();
        nt = analizador.getnode(u-1);
        NoTerminal pd = new NoTerminal(")",0,0);
        NoTerminal s2 = new NoTerminal("s2",nt.getDirec(),0);
        NoTerminal ELO = new NoTerminal("ELO",0,0);
        analizador.removeNodo(u);   // Pop  (<F>)
        analizador.removeNodo(u-1);   // Pop  (s1)
        analizador.adicionarNodo(pd); //  Push ( ) )
        analizador.adicionarNodo(s2);   //  Push (s2)
        analizador.adicionarNodo(ELO); //  Push (<ELO>)
        avance();
    }
    
    
    public static void proceso33(){
        System.out.println("proceso33");
        // 3. <F> --> i 
        Elemento ele;
        NoTerminal nt,nt1;       
        int u = analizador.ultimo();
        ele=lex1.darElemento(indice);
        nt=analizador.getnode(u-1);
        nt1=analizador.getnode(nt.getDirec());
        nt1.setValor(ele.darValor());
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        avance();
    }
    
    
    public static void procesoParentesis(){
        // parentesis derecho con paréntesis derecho
        System.out.println("Si pasa por parentesis");
        int u = analizador.ultimo();
        analizador.removeNodo(u);    //   Pop   ( ) )
        avance();
     //   analizador.mostrarCadenaPila();
    }
    
    
    public static void suma(){
        System.out.println("Entra a sumar");
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        double sum=nt1.getValor()+nt2.getValor();
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        nt4.setValor(sum);
        //desapilar suma y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    
    public static void mul(){
        System.out.println("Entra a multiplicar");
        NoTerminal nt1,nt2,nt3,nt4;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        double mul=nt1.getValor()*nt2.getValor();
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(nt3.getDirec());
        nt4.setValor(mul);
        //desapilar suma y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        
    }
    

public static void resta(){
    System.out.println("Entra a restar");
    NoTerminal nt1,nt2,nt3,nt4;
    int u = analizador.ultimo();
    nt1=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    double resta = nt1.getValor()-nt2.getValor();
    nt3=analizador.getnode(u-3);
    nt4=analizador.getnode(nt3.getDirec());
    nt4.setValor(resta);
    //desapilar resta y sus atributos
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.removeNodo(u-3);
}


public static void division(){
    System.out.println("Entra a dividir");
    NoTerminal nt1,nt2,nt3,nt4;
    int u = analizador.ultimo();
    nt1=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    double div=nt1.getValor()/nt2.getValor();
    nt3=analizador.getnode(u-3);
    nt4=analizador.getnode(nt3.getDirec());
    nt4.setValor(div);
    //desapilar div y sus atributos
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.removeNodo(u-3);
}

public static void exponente(){
    System.out.println("entra a exponente");
    NoTerminal nt1,nt2,nt3,nt4;
    int u = analizador.ultimo();
    nt1=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    double exp=nt1.getValor();
    for (int i=1; i<nt2.getValor(); i++){
        exp*=nt1.getValor();
    }
    nt3=analizador.getnode(u-3);
    nt4=analizador.getnode(nt3.getDirec());
    nt4.setValor(exp);
    //desapilar exp y sus atributos
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.removeNodo(u-3);
}

public static void procOR(){
    System.out.println("entra a procOR");
    NoTerminal nt1,nt2,nt3,nt4;
    int u = analizador.ultimo();
    nt1=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    nt3=analizador.getnode(u-3);
    nt4=analizador.getnode(nt3.getDirec());
    if(nt1.getValorLogico() == 1 || nt2.getValorLogico() == 1){
        nt4.setValorLogico(1);
    }else{
        nt4.setValorLogico(0);
    }
    //desapilar suma y sus atributos
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.removeNodo(u-3);
}

public static void procAND(){
    System.out.println("entra a procAND");
    NoTerminal nt1,nt2,nt3,nt4;
    int u = analizador.ultimo();
    nt1=analizador.getnode(u-1);
    nt2=analizador.getnode(u-2);
    nt3=analizador.getnode(u-3);
    nt4=analizador.getnode(nt3.getDirec());
    if(nt1.getValorLogico() == 1 && nt2.getValorLogico() == 1){
        nt4.setValorLogico(1);
    }else{
        nt4.setValorLogico(0);
    }
    //desapilar suma y sus atributos
    analizador.removeNodo(u);
    analizador.removeNodo(u-1);
    analizador.removeNodo(u-2);
    analizador.removeNodo(u-3);
}

    public static void pRelacional(){
        System.out.println("Entra a pRelacional");
        NoTerminal nt1,nt2;
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-4);
        nt2=analizador.getnode(u-5);
        System.out.println(nt1.getNombre());
        System.out.println(nt2.getNombre());
        System.out.println(nt1.getValorLogico()+" - "+nt2.getValorLogico());
        if( nt1.getValorLogico() == 2 || nt2.getValorLogico() == 2){
            //rechace();
        }
        //desapilar suma y sus atributos
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        
    }

    public static void pComparar(){
        System.out.println("Entra a pComparar");
        NoTerminal nt1, nt2, nt3, s4, nt4; //i2,i3,i4,s4
        int u = analizador.ultimo();
        nt1=analizador.getnode(u-1);
        nt2=analizador.getnode(u-2);
        nt3=analizador.getnode(u-3);
        nt4=analizador.getnode(u-4);
        s4 =analizador.getnode(nt4.getDirec());
        double i2 = nt1.getValor();
        double i3 = nt2.getValor();
        System.out.println(nt3.getValor());
        System.out.println("Va a entra a Switch");
        switch((int)nt3.getValor()){
            case 1:
                if(i2<=i3){
                    s4.setValorLogico(1);
                }else{
                    s4.setValorLogico(0);
                }
                break;
            case 2:
                System.out.println("Caso <");
                if(i2<i3){            
                    s4.setValorLogico(1);
                    System.out.println(s4.getValorLogico());
                }else{
                    s4.setValorLogico(0);
                    System.out.println(s4.getValorLogico());
                }
                break;
            case 3:
                if(i2>=i3){
                    s4.setValorLogico(1);
                }else{
                    s4.setValorLogico(0);
                }
                break;
            case 4:
                if(i2>i3){
                    s4.setValorLogico(1);
                }else{
                    s4.setValorLogico(0);
                }
                break;
            case 5:
                
                if(i2==i3){
                    s4.setValorLogico(1);

                }else{
                    s4.setValorLogico(0);
                }
                break;
            case 6:
                if(i2!=i3){
                    s4.setValorLogico(1);
                }else{
                    s4.setValorLogico(0);
                }
                break;
            default:
                System.out.println("Error en pComparar valor comparar");
                rechace();
        }

        System.out.println("Sale del Switch");
        if(s4.getValorLogico() == 1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
        analizador.removeNodo(u-2);
        analizador.removeNodo(u-3);
        analizador.removeNodo(u-4);
    }

    public static void resultado(){
        System.out.println("entra a resultado");
        NoTerminal nt;
        int u=analizador.ultimo();
        nt=analizador.getnode(u-1);
        if(nt.getValorLogico() != 2 && nt.getValor() == 0.0){
            if (nt.getValorLogico() == 1){
                System.out.println("Resultado = True");
            }
            else{
                System.out.println("Resultado = False");
            }
        }
        else{
            System.out.println("Resultado = "+nt.getValor());
        }
        analizador.removeNodo(u);
        analizador.removeNodo(u-1);
    }
    
    public static void analisisLexico(){
        // Este analizador es sencillo determina solo constantes enteras y reales positivas
        // Trabaja los diferentes elementos en un ArrayList que trabaja con la clase Clexico
        // la cual define el ArrayList con la clase CElemento
        // Almacen los valores para poder hallar los resultados
        
        Elemento ele1; 
        
        int i=0;
        int ind=0;
        char tip=0;
        char sim1=cad.charAt(i);
        double val=0;
        
        while (sim1!='¬'){
            // determina si sim1 esta en la cadena de digitos cad1 que es global
            if (cad1.indexOf(sim1)!=-1){
                String num="";
                while(cad1.indexOf(sim1)!=-1){
                    num=num+sim1;
                    i++;
                    sim1=cad.charAt(i);
        
                }
                // en el String num se almacena el entero y se lo almacena en val como doble
                // DeterminarNumero(num);
                if (determinarNumero(num)){
                    val=Double.parseDouble(num);
                    tip='i';
                
                    // se tipifica el valor como i
                }
                else{
                    System.out.println("Se rechaza la secuencia");
                    System.exit(0);
                }
        
            }
            else {
               // si el simbolo de entrada no esta en cad1 lo tipifica como tal ej
               // +,-,* (,) etc.
                
               tip=(char)sim1;
               i++;
               sim1=cad.charAt(i);
               val=0;
              
            }
        
            // con los elementos establecidos anteriormente se crea el elemento y se lo
            // adicina a lex1 que es el objeto de la clase Clexico
            if (tip!=' '){
            ele1=new Elemento(tip,val,ind);
            lex1.adicionarElemento(ele1);
            
            ind=ind+1;
            }
            //System.out.print("indice ="+ind);
               
        }
        ele1=new Elemento('¬',0,ind);
        lex1.adicionarElemento(ele1);
        lex1.mostrarLexico();
        System.out.println(" cadena"+lex1.cadenaLexico());
    }
    
    public static boolean determinarNumero(String numero){
     // Este método recibe un número en string y determina mediante un autómata finito
     // si está o no correcto. El string es una cadena de dígitos y el punto.
     // Retorna un valor booleano.
     
        int estado=1,i=0;
        char simbolo;
        boolean b=true;
        while (i<numero.length()&&b) {
            simbolo = numero.charAt(i);
            switch (simbolo) {
                case '0':case '1':case '2':case '3':case '4':case '5':case '6':  
                case '7':case '8':case '9':    
                    switch (estado) {
                        case 1:
                           estado=2;
                           i++;
        
                           break;
                        case 2:
                           estado=2;
                           i++;
        
                           break;
                        case 3:
                           estado=4;
                           i++;
        
                           break;
                        case 4:
                            estado=4;
                           i++;
        
                           break;
                    
                    }
                    break;
                case '.':    
                    switch (estado) {
                        case 1:case 3: case 4:
                           b=false;
                           break;
                        case 2:
                           estado=3;
                           i++;
        
                           break;
                        
                    
                    }
                    break;
                default: b=false;
            }
        
    }
        return b;
    }
    
    
    public static void resultado(double res){
        System.out.println("Resultado "+res);
    }
    public static void avance(){
        indice++;
        if (indice<cad.length()) {
        sim=lex1.darElemento(indice).darTipo();
        cadavance=cadavance+sim;
        System.out.println("Cadena procesada "+cadavance);
              
       }
    }
    
    public static void mostrarContador(int i2){
    System.out.println("Cantidad de unos "+i2);
    }
    
    public static void rechace(){
        System.out.println("Se rechaza la secuencia");
        System.exit(0);
    }
}