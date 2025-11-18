package level1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UndoTesting {

    private Undo undo;

    @BeforeEach
    void setUp(){
        undo = Undo.getInstance();
        undo.stackCommands.clear();
    }

    @Test
    void givenAGetInstance_whenCreateTwoInstances_thenProofTheInstanceIsTheSame(){

        Undo obj1 = Undo.getInstance();
        Undo obj2 = Undo.getInstance();

        assertSame(obj1, obj2);

    }

    @Test
    void givenACommand_whenPushCommandToStack_thenTheLastPositionStackEquals(){

        undo.addCommand("Control C");

        assertEquals("Control C", undo.showLastCommand());
    }

    @Test
    void givenAStack_whenAddEmptyCommand_thenThrowExceptionIsTheSameMessage(){

       Exception e = assertThrows(IllegalArgumentException.class, ()-> {
                undo.addCommand(" ");
       });


    }

    @Test
    void givenAStack_whenUndoCommand_thenShowTheCommandAndDeleteToTheStack(){

        String command = "Control Q";
        undo.addCommand(command);
        assertTrue(undo.stackCommands.contains(command));
        

        String undone = undo.undoCommand();

        assertTrue(undone.contains(command));
        assertTrue(undo.showEmpty());
    }


    @Test
    void givenAStackCommands_whenAddACommand_thenProofTheListChangeOfSize(){


        int expectedSize = 1;

        undo.addCommand("ESC");

        int actualSize = undo.showSize();

        assertEquals(expectedSize, actualSize);
    }


}
