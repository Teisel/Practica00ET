import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        int op = -1;
        numero lisNumero = null;

        while(op != 0)
        {
            System.out.println("Elija una opción");
            System.out.println("1. Agregar número.");
            System.out.println("2. Mostrar números agregados.");
            System.out.println("3. Eliminar ultimo número en la lista.");
            System.out.println("0. Salir del programa.");

            Scanner sc = new Scanner(System.in);
            
            //numero Numero = new numero(0,null);

            op = tryNum(sc);

            switch (op) {
                //agregar
                case 1:
                    System.out.println("Ingrese  el número que desea agregar a la lista: ");
                    int n = tryNum(sc);
                    numero Numero = new numero(n,null);
                    if (lisNumero == null)
                    {
                        lisNumero = Numero;
                    }
                    else
                    {
                        numero aux = lisNumero;
                        while (aux.getNext() != null)
                        {
                            aux = aux.getNext();
                        }
                        aux.setNext(Numero);
                    }
                    break;

                    case 2:
                    System.out.println("Numeros agregados:");
                        numero aux = lisNumero;
                        while (aux.getNext() != null)
                        {
                            System.out.println(aux.getNum() + "");
                            aux = aux.getNext();
                        }         
                        System.out.println(aux.getNum());
                    break;

                    case 3:
                    System.out.println("Eliminar");
                        numero auxi = lisNumero;
                        
                        while (auxi.getNext().getNext() != null)
                        {
                            auxi = auxi.getNext();  
                        }    
                        System.out.println("sse eliminó" + auxi.getNum());
                        auxi.setNext(null);
                    break;
            
                default:
                    break;
            }
        }
        
    }

    static int tryNum(Scanner sc)
    {
        int num = -1;
        try
            {
                num = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Error: Por favor, ingrese un valor numérico válido.");
            }

            return num;
    }
}

