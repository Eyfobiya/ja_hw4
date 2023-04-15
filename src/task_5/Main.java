package task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть температуру в градусах за Цельсієм: напр. 18.0 ");
        double temp = in.nextDouble();
        System.out.println("Оберіть необхідний спосіб конвертації: Кельвін чи Фаренгейт");
        String conv = in.next();

        ConverterTemperature convTo = new Converter();
        convTo.convert(temp, conv);
    }
}
