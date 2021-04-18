package pattern.structural.proxy;

import pattern.structural.proxy.service.CacheDataProxy;
import pattern.structural.proxy.service.Data;
import pattern.structural.proxy.service.DataImpl;

public class App {

    public static void main(String[] args) {
        Data data = new DataImpl();
        data.getData("test_data");
        data.getData("test_data");
        data.getData("test_data");

        System.out.println();

        Data cacheData = new CacheDataProxy(data);
        cacheData.getData("cached_data");
        cacheData.getData("cached_data");
        cacheData.getData("cached_data");
    }
}
