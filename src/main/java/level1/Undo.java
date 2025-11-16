package level1;


import java.util.Iterator;
import java.util.Stack;

public class Undo {


    Stack<String> stackCommands = new Stack<>();

    private static Undo instance;


    private Undo(){

    }


    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;

    }
    public void addCommand(String command){
        if(command.isBlank()){
            throw new IllegalArgumentException("Write a computer command...");

        }
        stackCommands.push(command);
    }

    public String undoCommand(){
        if(stackCommands.isEmpty()){
            System.out.println("No command to Undo");
        }
       return "Delete command: ["+stackCommands.pop()+"]";


    }

    public String showLastCommand(){
        return stackCommands.peek();
    }
    public boolean showEmpty(){
        return stackCommands.isEmpty();
    }

    public int showSize(){
        return stackCommands.size();
    }

    public void viewHistory(){
        if(stackCommands.isEmpty()){
            System.out.println("Nothing in the History");
            return;
        }

        for(int i= 0; i<stackCommands.size();i++){
            System.out.println("Command "+(i+1)+": "+stackCommands.get(i));
        }


    }

}
