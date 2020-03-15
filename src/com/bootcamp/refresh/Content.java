package com.bootcamp.refresh;

import java.util.ArrayList;

public class Content extends RefreshableContent {
    Content() {
        this.children = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder content = new StringBuilder("Refreshing Content");
        this.children.forEach(child -> content.append(" " + child.refresh()));
        return String.valueOf(content);
    }
}
