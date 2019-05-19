import java.util.Scanner;

public class Dell_all_spaces {

    public static void main (String args[]){

                // Program info

        System.out.println("Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран. ");

                // Var

        String in_str, out_str;

        // Data processing

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите сроку из которой требуется удалить все пробелы: ");
        in_str = scan.nextLine();

        out_str = in_str.replaceAll("\\s","");

        System.out.println("Строка без пробелов: " + out_str);

    }
}
