import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um número : ");
        Scanner entrada = new Scanner(System.in);
        int idx = Integer.parseInt(entrada.nextLine());
        for(int i =1; i<=idx; i++){
            for( int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
