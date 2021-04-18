package pattern.structural.proxy.service;

public class DataImpl implements Data {
    @Override
    public String getData(String name) {
        return searchInDB(name);
    }

    private String searchInDB(String name) {
        System.out.println("Searching on the server");
        return name;
    }
}
