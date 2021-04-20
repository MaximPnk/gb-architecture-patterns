package pattern.behavioral.command.service;

import pattern.behavioral.command.model.Notepad;

public abstract class NotepadCommand {

    protected final Notepad notepad;
    private String backup;

    public NotepadCommand(Notepad notepad) {
        this.notepad = notepad;
    }

    public abstract void exec();

    protected void backup() {
        backup = notepad.getText();
    }

    public void rollback() {
        notepad.setText(backup);
    }
}
