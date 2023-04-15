package task_2;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open(){
        System.out.println("Open TXTHandler");
    }
    @Override
    public void create(){
        System.out.println("Create TXTHandler");
    }
    @Override
    public void change(){
        System.out.println("Change TXTHandler");
    }
    @Override
    public void save(){
        System.out.println("Save TXTHandler");
    }
}
