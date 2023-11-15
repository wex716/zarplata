import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salary1 = scanner.nextInt();
        int salary2 = scanner.nextInt();
        int salary3 = scanner.nextInt();

        int[] Salaries = new int[3];

        Salaries[0] = salary1;
        Salaries[1] = salary2;
        Salaries[2] = salary3;

        int MaxSalaries = 0;
        for (int i = 0; i < Salaries.length; i++) {
            if (Salaries[i] > MaxSalaries) {
                MaxSalaries = Salaries[i];
            }
        }

        int MinSalaries = salary1;
        for (int i = 0; i < Salaries.length; i++) {
            if (Salaries[i] < MinSalaries) {
                MinSalaries = Salaries[i];
            }
        }

        System.out.println(MaxSalaries - MinSalaries);
    }
}