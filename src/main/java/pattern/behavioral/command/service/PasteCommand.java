package pattern.behavioral.command.service;

import pattern.behavioral.command.model.Notepad;

public class PasteCommand extends NotepadCommand {
    public PasteCommand(Notepad notepad) {
        super(notepad);
    }

    @Override
    public void exec() {
        backup();
        notepad.setText(notepad.getText() + notepad.getClipboard());
    }
}
