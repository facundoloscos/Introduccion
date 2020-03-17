import java.util.Scanner;

public class Introduccion {
    public static void main (String[] args){
        Scanner entry = new Scanner(System.in);
        int opcion;
        char control = 's';

        do{
            System.out.println("\t\t\t\t\t---Escoja ejercicio---\n");
            System.out.println("Ejercicio: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18");

            opcion = entry.nextInt();
            switch (opcion){
                case 1:
                    int N = 10;
                    double A = 5.5;
                    char C = 'F';
                    System.out.println("N: "+N+"\nA: "+A+"\nC: "+C+"\n");
                    System.out.println("N+A: "+(N+A));
                    System.out.println("A-N: "+(A-N));
                    break;
                case 2:
                    int X = 10, Y = 20;
                    double N2 = 5.5, M2 = 3.5;
                    System.out.println("X = "+X+"\nY = "+Y+"\nN = "+N2+"\nM = "+M2+"\n");
                    System.out.println("X+M: "+(X+M2));
                    System.out.println("X-Y: "+(X-Y));
                    System.out.println("N+M: "+(N2+M2));
                    System.out.println("N*Y: "+(N2*Y));
                    break;
                case 3:
                    int N3 = 5;
                    System.out.println("N = "+N3+"\n");
                    System.out.println("N + 77 = "+(N3+77));
                    System.out.println("N - 3 = "+(N3-3));
                    System.out.println("N x 2 = "+(N3*2));
                    break;
                case 4:
                    int A4 = 5, B4 = 10, C4 = 15, D4 = 20, aux;
                    System.out.println("-Valores iniciales-");
                    System.out.println("A="+A4+"\tB="+B4+"\tC="+C4+"\tD="+D4+"\n");
                    aux = B4;
                    B4 = C4;
                    C4 = A4;
                    A4 = D4;
                    D4 = aux;
                    System.out.println("-Valores cambiados-");
                    System.out.println("A="+A4+"\tB="+B4+"\tC="+C4+"\tD="+D4+"\n");
                    break;
                case 5:
                    int A5;
                    System.out.print("Ingrese un numero: ");
                    A5 = entry.nextInt();
                    if (A5 % 2 == 0){
                        System.out.println("El numero ingresado es PAR");
                    }else{
                        System.out.println("El numero ingresado es IMPAR");
                    }
                    break;
                case 6:
                    int B6;
                    System.out.print("Ingrese un numero: ");
                    B6 = entry.nextInt();
                    if (B6 >= 0){
                        System.out.println("El numero ingresado es POSITIVO");
                    }else{
                        System.out.println("El numero ingresado es NEGATIVO");
                    }
                    break;
                case 7:
                    int C7;
                    System.out.print("Ingrese un numero: ");
                    C7 = entry.nextInt();
                    if (C7 >= 0){
                        System.out.println(C7+" es POSITIVO");
                    }else{
                        System.out.println(C7+" es NEGATIVO");
                    }
                    if (C7 % 2 == 0){
                        System.out.println(C7+" es PAR");
                    }else{
                        System.out.println(C7+" es IMPAR");
                    }
                    if (C7 % 5 == 0){
                        System.out.println(C7+" es MULTIPLO DE 5");
                    }
                    if (C7 % 10 == 0){
                        System.out.println(C7+" es MULTIPLO DE 10");
                    }
                    if (C7 > 100){
                        System.out.println(C7+" es MAYOR que 100");
                    }else{
                        if (C7 < 100){
                            System.out.println(C7+" es MENOR que 100");
                        }
                    }
                    break;
                case 8:
                    String name;
                    entry.nextLine();    //borro buffer
                    System.out.print("Ingrese un nombre: ");
                    name = entry.nextLine();
                    System.out.println("Buenos dias, "+name);
                    break;
                case 9:
                    int nro;
                    System.out.print("Ingrese un numero: ");
                    nro = entry.nextInt();
                    System.out.println("Doble: "+(nro*2));
                    System.out.println("Triple: "+(nro*3));
                    break;
                case 10:
                    float temperatura;
                    System.out.print("Ingrese temperatura en grados Fahrenheit: ");
                    temperatura = entry.nextFloat();
                    System.out.println(temperatura+" Fahrenheit es igual a "+((temperatura-32)/1.8)+" Centigrados");
                    break;
                case 11:
                    float radio;
                    System.out.print("Ingrese radio de la circunferencia: ");
                    radio = entry.nextFloat();
                    System.out.println("Longitud: "+(3.14*2*radio));
                    System.out.println("Area: "+(3.14*radio*radio));
                    break;
                case 12:
                    float km;
                    System.out.print("Ingrese kilometros: ");
                    km = entry.nextFloat();
                    System.out.println(km+" Kilometros por hora es lo mismo que "+(km*5/18)+" Metros por segundo");
                    break;
                case 13:
                    float cat1, cat2;
                    float hipo;
                    System.out.print("Ingrese el valor del cateto 1: ");
                    cat1 = entry.nextFloat();
                    System.out.print("Ingrese el valor del cateto 2: ");
                    cat2 = entry.nextFloat();
                    hipo = (float)Math.sqrt((cat1*cat1)+(cat2*cat2));
                    System.out.println("La hipotenusa segun esos catetos cargados seria de: "+hipo);
                    break;
                case 14:
                    float radioEsfera;
                    System.out.print("Ingrese el radio de la esfera: ");
                    radioEsfera = entry.nextFloat();
                    System.out.println("El volumen de una esfera con "+radioEsfera+" radio es de : "+(3.14*radioEsfera*radioEsfera*radioEsfera*4/3));
                    break;
                case 15:
                    float lado1, lado2, lado3, semip, area;
                    System.out.print("Ingrese el valor del lado 1: ");
                    lado1 = entry.nextFloat();
                    System.out.print("Ingrese el valor del lado 2: ");
                    lado2 = entry.nextFloat();
                    System.out.print("Ingrese el valor del lado 3: ");
                    lado3 = entry.nextFloat();
                    semip = (lado1+lado2+lado3)/2;
                    area = (float)Math.sqrt((semip*(semip-lado1)*(semip-lado2)*(semip-lado3)));
                    System.out.println("El area del triangulo es: "+area);
                    break;
                case 16:
                    int numerin, centena, decena, unidad;
                    do{
                        System.out.print("Ingrese un numero de tres cifras: ");
                        numerin = entry.nextInt();
                    }while (numerin > 999 || numerin < -999);
                    centena = numerin/100;
                    System.out.println("Centena: "+centena);
                    decena = (numerin/10) % 10;
                    System.out.println("Decena: "+decena);
                    unidad = numerin % 10;
                    System.out.println("Unidad: "+unidad);
                    break;
                case 17:
                    int num, pos1, pos3, pos5;
                    do{
                        System.out.print("Ingrese un numero de 5 cifras: ");
                        num = entry.nextInt();
                    }while (num > 99999 || num < -99999);
                    pos5 = num/10000;
                    System.out.println("Posicion 5: "+pos5);
                    pos3 = (num/100) % 10;
                    System.out.println("Posicion 3: "+pos3);
                    pos1 = num % 10;
                    System.out.println("Posicion 1: "+pos1);
                    break;
                case 18:
                    int H, M, S;
                    boolean valida = true;
                    System.out.print("Ingrese Hora: ");
                    H = entry.nextInt();
                    System.out.print("Ingrese Minutos: ");
                    M = entry.nextInt();
                    System.out.print("Ingrese Segundos");
                    S = entry.nextInt();
                    if (H < 0 || H > 24){
                        valida = false;
                    }
                    if (M < 0 || M > 60){
                        valida = false;
                    }
                    if (S < 0 || S > 60){
                        valida = false;
                    }
                    if (valida == true){
                        System.out.println("La hora ingresada es VALIDA");
                    }else{
                        System.out.println("La hora ingresada es INVALIDA");
                    }
                    break;
                default:
                    System.out.println("Elija una opcion valida por favor");
            }
            System.out.println("Desea continuar en el programa? (s/n)");
            control = entry.next().charAt(0);

        }while ((control == 's') || (control == 'S'));

        System.out.println("-- Gracias por usar mi humilde guia introductoria --");
    }
}
