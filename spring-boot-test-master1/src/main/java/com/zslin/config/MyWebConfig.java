package com.zslin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 钟述林 393156105@qq.com on 2016/10/18 10:31.
 */
@ConfigurationProperties(locations = "classpath:config/my-web.properties", prefix = "web")
@Component
public class MyWebConfig {

    private String name;

    private String version;

    private String author;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
