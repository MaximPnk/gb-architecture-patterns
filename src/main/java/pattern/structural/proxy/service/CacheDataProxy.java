package pattern.structural.proxy.service;

import java.util.HashMap;
import java.util.Map;

public class CacheDataProxy implements Data {

    Data data;
    private Map<String, String> cache;

    public CacheDataProxy(Data data) {
        this.data = data;
        cache = new HashMap<>();
    }

    @Override
    public String getData(String name) {
        return searchInCache(name);
    }

    private String searchInCache(String name) {
        if (cache.containsKey(name)) {
            System.out.println("Got from cache");
            return cache.get(name);
        } else {
            String value = data.getData(name);
            System.out.println("Add to cache");
            cache.put(name, value);
            return name;
        }
    }
}
