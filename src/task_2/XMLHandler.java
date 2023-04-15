package task_2;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open(){
        System.out.println("Open XMLHandler");
    }
    @Override
    public void create(){
        System.out.println("Create XMLHandler");
    }
    @Override
    public void change(){
        System.out.println("Change XMLHandler");
    }
    @Override
    public void save(){
        System.out.println("Save XMLHandler");
    }
}
