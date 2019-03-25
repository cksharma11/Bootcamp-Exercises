package com.bootcamp.refresh;

import java.util.ArrayList;

public class Image extends RefreshableContent {
    Image() {
        this.children = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder content = new StringBuilder("Refreshing Image");
        this.children.forEach(child-> content.append(" " +child.refresh()));
        return String.valueOf(content);
    }
}
