import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double x, y, z;
        
        System.out.println("Digite a medida do lado x: ");
        x = scan.nextDouble();
        
		System.out.println("Digite a medida do lado y: ");
        y = scan.nextDouble();     
        
		System.out.println("Digite a medida do lado z: ");
        z = scan.nextDouble();
        

        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Lados nulos ou negativos nao sao aceitos.");
        }

        if (x >= y + z || y >= z + x || z >= x + y) {
            System.out.println("Triangulo inexistente.");
            System.exit(3);
        }

        if (x == y && y == z)
        System.out.println("Triangulo equilatero.");

        else if (x == y || y == z || z == x)
        System.out.println("Triangulo isosceles.");

        else
        System.out.println("Triangulo escaleno.");

        System.exit(0);
           
    }

    
    
    
}