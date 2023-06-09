package task_4;

public class Interface {
    /** Oracle: Інтерфейс.
     * https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
     * Інтерфейс (від лат. inter – «між», і face – «поверхня») – семантична та синтаксична конструкція в коді програми,
     * що використовується для специфікування послуг, які надаються класом або компонентом.
     * Інтерфейс визначає межу взаємодії між класами або компонентами, специфікуючи певну абстракцію,
     * яку здійснює реалізувальна сторона. На відміну від багатьох інших різновидів інтерфейсів,
     * інтерфейс ООП є суворо формалізованим елементом об'єктно- орієнтованої мови і як семантична конструкція широко
     * використовується кодом програми.
     * • Неможливо створити екземпляр інтерфейсу.
     * • Інтерфейси та члени інтерфейсів є абстрактними. Інтерфейси не мали реалізації за
     * замовчуванням до версії Java 8.
     * • Інтерфейс містив лише сигнатури методів до версії Java 8.
     * • Члени інтерфейсів автоматично є відкритими, абстрактними. Вони не можуть мати
     * модифікатори доступу.
     * • Поля інтерфейсів автоматично є public static final.
     * • Клас, який реалізує інтерфейс, має реалізувати члени цього інтерфейсу, які вказані під час його
     * створення.
     * • Однак якщо базовий клас реалізує інтерфейс, похідний клас також успадковує цю реалізацію.
     * • Інтерфейс може успадковуватись від одного або декількох базових інтерфейсів.
     * • Базовий клас може реалізувати члени інтерфейсу. У цьому випадку похідний клас може змінити
     * поведінку інтерфейсу через перевизначення цих членів.
     * • Якщо клас реалізує два інтерфейси, що містять член з однаковою сигнатурою, то під час
     * реалізації цього члена в класі обидва інтерфейси будуть використовувати цей член для своєї
     * реалізації.
     * • Переваги використання інтерфейсів:
     * 1. Клас може реалізувати кілька інтерфейсів.
     * 2. Якщо клас реалізує інтерфейс, він отримує лише імена та сигнатури методу.
     * 3. Інтерфейси визначають поведінку екземплярів похідних класів.
     * 4. Базовий клас може мати непотрібний функціонал, отриманий від інших його базових класів.
     * Цього можна уникнути, застосовуючи інтерфейси.
     * • Впровадження залежностей (Dependency Injection, DI) – чудова методика для створення слабозв'язаних застосунків. Вона надає можливості для спрощення коду, вилучення та обробки залежностей між об'єктами й автоматичного створення екземплярів залежного об'єкта.
     * • Впровадження залежностей описує процес розробки застосунків – замість зазначення конкретних залежностей у застосунку під час розробки та створення необхідних об'єктів у коді під час виконання застосунок вирішує, які об'єкти йому потрібні, а потім створює та впроваджує їх у застосунок.
     * • Використання впровадження залежностей має кілька переваг:
     * 1. Ослаблення зв'язку між класами.
     * 2. Створення коду, який краще піддається перевірці.
     * 3. Спрощення тестування.
     */
}
