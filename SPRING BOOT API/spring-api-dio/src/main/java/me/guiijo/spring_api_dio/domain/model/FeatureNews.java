package me.guiijo.spring_api_dio.domain.model;

public abstract class FeatureNews {

    public String icon;
    public String description;

    public FeatureNews(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }
}
