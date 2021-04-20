package pattern.behavioral.command.service;

import pattern.behavioral.command.model.Notepad;

public class CopyCommand extends NotepadCommand {
    public CopyCommand(Notepad notepad) {
        super(notepad);
    }

    @Override
    public void exec() {
        notepad.setClipboard(notepad.getSelectedText());
    }
}
