package pattern.structural.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Flashlight {
    int brightness;

    public void setMoreBright() {
        brightness++;
    }

    public void setLessBright() {
        brightness--;
    }
}
