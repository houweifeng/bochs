package net.sourceforge.bochs.entity;

public class VgaCard {
    private String value;
    private String description;

    public VgaCard(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
