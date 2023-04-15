package task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Оберіть формат документа: doc / txt / xml");
        String formatDoc = in.next();
        System.out.println("Оберіть необхідну дію: open / create / change / save");
        String actionDoc = in.next();

        switch (formatDoc.toLowerCase()) {
            case "doc":{
                if (actionDoc.equalsIgnoreCase("open")) {
                    AbstractHandler docOpen = new DOCHandler();
                    docOpen.open();
                } else if (actionDoc.equalsIgnoreCase("create")) {
                    AbstractHandler docCreate = new DOCHandler();
                    docCreate.create();
                } else if (actionDoc.equalsIgnoreCase("change")) {
                    AbstractHandler docChange = new DOCHandler();
                    docChange.change();
                } else if (actionDoc.equalsIgnoreCase("save")) {
                    AbstractHandler docSave = new DOCHandler();
                    docSave.save();}
            } break;
            case "txt":{
                if (actionDoc.equalsIgnoreCase("open")) {
                    AbstractHandler txtOpen = new TXTHandler();
                    txtOpen.open();
                } else if (actionDoc.equalsIgnoreCase("create")) {
                    AbstractHandler txtCreate = new TXTHandler();
                    txtCreate.create();
                } else if (actionDoc.equalsIgnoreCase("change")) {
                    AbstractHandler txtChange = new TXTHandler();
                    txtChange.change();
                } else if (actionDoc.equalsIgnoreCase("save")) {
                    AbstractHandler txtSave = new TXTHandler();
                    txtSave.save();}
            } break;
            case "xml":{
            if (actionDoc.equalsIgnoreCase("open")) {
                AbstractHandler xmlOpen = new XMLHandler();
                xmlOpen.open();
            } else if (actionDoc.equalsIgnoreCase("create")) {
                AbstractHandler xmlCreate = new XMLHandler();
                xmlCreate.create();
            } else if (actionDoc.equalsIgnoreCase("change")) {
                AbstractHandler xmlChange = new XMLHandler();
                xmlChange.change();
            } else if (actionDoc.equalsIgnoreCase("save")) {
                AbstractHandler xmlSave = new XMLHandler();
                xmlSave.save();}
        } break;
        }
    }
}
