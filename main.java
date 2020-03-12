import java.util.Scanner;

public class Juros{
    public static void main(String[] args){
        double debito, meses, jurosMensal, juros;
        
        System.out.println("Débito: ");
        debito = new Scanner(System.in).nextDouble();
        System.out.println("Meses: ");
        meses = new Scanner(System.in).nextDouble();
        System.out.println("Juros Mensais (%): ");
        jurosMensal = new Scanner(System.in).nextDouble();
        
        juros = debito*(jurosMensal/100)*meses;
        
        System.out.println("O valor final da dívida é "+juros);
    }
}
