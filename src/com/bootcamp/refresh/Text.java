package com.bootcamp.refresh;

import java.util.ArrayList;

public class Text extends RefreshableContent {
    Text() {
        this.children = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder content = new StringBuilder("Refreshing Text");
        this.children.forEach(child -> content.append(" " + child.refresh()));
        return String.valueOf(content);
    }
}
