package behavioral.nullobject;

public class Operation {
    private String name;
    private String domain;

    public Operation(String domain, String name) {
        this.domain = domain;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
