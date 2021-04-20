package pattern.behavioral.command.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notepad {
    private String text;
    private String selectedText;
    private String clipboard;

    public Notepad(String text) {
        this.text = text;
    }
}
