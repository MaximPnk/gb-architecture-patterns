package pattern.behavioral.command;

import pattern.behavioral.command.model.Notepad;
import pattern.behavioral.command.service.CopyCommand;
import pattern.behavioral.command.service.NotepadCommand;
import pattern.behavioral.command.service.PasteCommand;

public class App {

    public static void main(String[] args) {
        Notepad notepad = new Notepad("abc");
        NotepadCommand copyCommand = new CopyCommand(notepad);
        NotepadCommand pasteCommand = new PasteCommand(notepad);

        System.out.println(notepad.getText());
        notepad.setSelectedText("bca");
        copyCommand.exec();
        pasteCommand.exec();
        System.out.println(notepad.getText());
        pasteCommand.exec();
        System.out.println(notepad.getText());
        pasteCommand.rollback();
        System.out.println(notepad.getText());
    }
}
