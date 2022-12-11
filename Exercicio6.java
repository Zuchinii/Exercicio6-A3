import java.util.Scanner;

public class Exercicio6 {
      
    public static void main(String[] args) {
    int horas, minutos;
    String opcao;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite as horas: ");
    horas = teclado.nextInt();
    System.out.println("Digite os minutos: ");
    minutos = teclado.nextInt();
    teclado.close();
    
    
    do{
    if ((horas > 12) && (horas < 24))   {
        horas = horas-12;
        imprimeHorario(horas, minutos,  'P');
    } else if (horas==12) {
        imprimeHorario(horas, minutos,  'P');
    }    else {
            imprimeHorario(horas, minutos,  'A');
        }
        System.out.println("Deseja converter mais um numero?");
        
        opcao = teclado.nextLine();

    } while (opcao!= "n");
    }

    static void imprimeHorario(int h, int m, char t){
        System.out.println(h+":"+ m + t+ ".M.");
    }


}