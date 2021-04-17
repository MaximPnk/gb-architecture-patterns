package pattern.structural.adapter.adapter;

import lombok.AllArgsConstructor;
import pattern.structural.adapter.model.Flashlight;
import pattern.structural.adapter.model.SuperPhone;

@AllArgsConstructor
public class PhoneLightAdapter extends Flashlight {

    private final SuperPhone superPhone;

    @Override
    public void setMoreBright() {
        superPhone.setBrightness(superPhone.getBrightness() + 1);
    }

    @Override
    public void setLessBright() {
        superPhone.setBrightness(superPhone.getBrightness() - 1);
    }

    @Override
    public int getBrightness() {
        return superPhone.getBrightness();
    }
}
