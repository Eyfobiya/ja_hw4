package task_3;
// Створіть 2 інтерфейси Playable та Recordable. У кожному з інтерфейсів створіть по 3 методи
// void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
// Створіть похідний клас Player від базових інтерфейсів Playable та Recordable.
// Написати програму, яка виконує програвання та запис.
public class Player implements Playable, Recordable {
    @Override
    public void play(){
        System.out.println("Play");
    }
    @Override
    public void record(){
        System.out.println("Record");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
