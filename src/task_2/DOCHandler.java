package task_2;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open(){
        System.out.println("Open DOCHandler");
    }
    @Override
    public void create(){
        System.out.println("Create DOCHandler");
    }
    @Override
    public void change(){
        System.out.println("Change DOCHandler");
    }
    @Override
    public void save(){
        System.out.println("Save DOCHandler");
    }
}
