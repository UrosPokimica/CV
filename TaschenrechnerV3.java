import java.util.Scanner;

public class TaschenrechnerV3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char operator='0';
        while (operator!='X') {
            System.out.println("Gib den Operator (+,-,*,/,%) ein:");
            operator = sc.nextLine().charAt(0);
            if (operator != 'X') {
                if ((operator=='+')&& (operator=='-')&&(operator=='*')&&(operator=='/')&&(operator=='%')) {
                    System.out.println("Gib die erste Zahl ein:");
                    int a = sc.nextInt();
                    System.out.println("Gib die zweite Zahl ein:");
                    int b = sc.nextInt();
                    sc.nextLine();
                    switch (operator) {
                        case '+':
                            System.out.println(a + "+" + b + "=" + (a + b));
                            break;
                        case '-':
                            System.out.println(a + "-" + b + "=" + (a - b));
                            break;
                        case '*':
                            System.out.println(a + "*" + b + "=" + (a * b));
                            break;
                        case '/':
                            System.out.println(a + "/" + b + "=" + ((double) a / b));
                            break;
                        case '%':
                            System.out.println(a + "%" + b + "=" + (a % b));
                            break;
                        default:
                            System.out.println("Falsche Operator!");
                    }
                }

            }
        }
    }
}
