package pattern.structural.adapter;

import pattern.structural.adapter.adapter.PhoneLightAdapter;
import pattern.structural.adapter.model.Flashlight;
import pattern.structural.adapter.model.SuperPhone;
import pattern.structural.adapter.service.BrightChangerService;

public class App {

    private static final BrightChangerService brightChangerService;

    static {
        brightChangerService = new BrightChangerService();
    }

    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight(5);
        brightChangerService.setMore(flashlight);
        brightChangerService.setLess(flashlight);

        SuperPhone phone = new SuperPhone(50);
        PhoneLightAdapter adapter = new PhoneLightAdapter(phone);
        brightChangerService.setMore(adapter);
        brightChangerService.setLess(adapter);
    }
}
