package pattern.creational.abstractfactory.common;

import lombok.Getter;

public enum PhoneType {
    WINDOWS("Windows"), ANDROID("Android"), IPHONE("Iphone");

    @Getter
    String value;

    PhoneType(String value) {
        this.value = value;
    }
}
