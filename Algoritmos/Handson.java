import java.util.Scanner;

public class Handson {
public static void main(String[] args) {

int o;    
Scanner leitor = new Scanner(System.in);
System.out.println("Escolha um dos exercícios para prosseguir: ");
System.out.println("\n 1- Saída 2 - Calcular distância 3 - Contador de caracteres 4 - Multipla escolha");
o = leitor.nextInt();

switch (o) {    
    case 1:
     
    System.out.println();
        System.out.println();
        System.out.println("                               +\"\"\"\"\"+");
        System.out.println("                              [| o o |]");
        System.out.println("                               |  ^  |");
        System.out.println("                               | '-' |");
        System.out.println("                               +-----+");
                              
                             
    
    break;

    
    case 2:
    Double x1 = 25. , x2 = 35.5 , y1 = 35. , y2 = 25.5;
    Double d;
    Double r = 6371.01;
    x1 = Math.toRadians(x1);
    y1 = Math.toRadians(y1);
    x2 = Math.toRadians(x2);
    y2 = Math.toRadians(y2);

    System.out.println("Distancia entre os pontos A (Latitude: 25 e Longitude: 35) e B (Latitude: 35.5 e Longitude: 25.5)\n");
    
    
    d = r * Math.acos( Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)); 
     
    System.out.println("Distância: " + d + " km");

    break;

    
    case 3:
    int a = 0;
    String palavra;
    System.out.println("Digite uma palavra: ");
    leitor.nextLine();
    palavra = leitor.nextLine();    
    
    for(int i = 0; i < palavra.length(); i++){

        a++;

    }

    System.out.println("Sua palavra contém: " + a + " caracteres.");

    break;

    
    case 4:
    int opc;
    int tentativas = 3;
    
    do{
    System.out.println("Questão Java - Algoritmos e programação. ");
    System.out.println("\n Enunciado: Em Java, qual é o método da classe Scanner utilizado para ler uma linha inteira de texto digitada pelo usuário? ");
    System.out.println("\n Alternativas: 1- nextInt() 2- next() 3- nextLine() 4- read() 5- getLine() \n (*Você possui 3 tentivas.) ");
    opc = leitor.nextInt(); 
    switch (opc) {
        
    case 1:
    tentativas--;
    System.out.println("Opção errada, tente novamente! Você tem mais " + tentativas + " tentativas\n");
    
            break;
    
    case 2:
    tentativas--;
    System.out.println("Opção errada, tente novamente! Você tem mais " + tentativas + " tentativas\n");
    
            break;
    case 3:
    
    System.out.println("Opção correta, parabéns!!!\n");
    tentativas = 0;
            break;
    case 4:
    tentativas--;
    System.out.println("Opção errada, tente novamente! Você tem mais " + tentativas + " tentativas\n");

            break;
    case 5:
    tentativas--;
    System.out.println("Opção errada, tente novamente! Você tem mais " + tentativas + " tentativas\n");
    
            break;
    
        
            default: 
            System.out.println("\nOpção inválida, digite novamente.\n");
            break;
    }
    }while (tentativas != 0); 
    break;   
    

    


    default:
        System.out.println("Opção inválida.");
    break;
}



leitor.close();
}}