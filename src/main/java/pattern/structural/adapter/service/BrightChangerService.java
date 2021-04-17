package pattern.structural.adapter.service;

import pattern.structural.adapter.model.Flashlight;

public class BrightChangerService {

    public void setMore(Flashlight flashlight) {
        flashlight.setMoreBright();
        System.out.println("brightness = " + flashlight.getBrightness());
    }

    public void setLess(Flashlight flashlight) {
        flashlight.setLessBright();
        System.out.println("brightness = " + flashlight.getBrightness());
    }
}
