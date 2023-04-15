package task_5;
// Напишіть на ConverterTemperature клас для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
// У класу має бути метод convert, який робить конвертацію
public class Converter implements ConverterTemperature{
    @Override
    public void convert(double temp, String conv) {
        double result;
        if (conv.equalsIgnoreCase("Кельвін")) {
            result = temp + KELVIN;
            System.out.println("Результат конвертації Цельсія в Кельвіни = " + result);
        } else if (conv.equalsIgnoreCase("Фаренгейт")) {
            result = temp * 1.8 + 32;
            System.out.println("Результат конвертації Цельсія в Фаренгейти = " + result);
        }
    }
}
