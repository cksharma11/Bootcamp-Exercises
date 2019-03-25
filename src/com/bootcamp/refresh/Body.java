package com.bootcamp.refresh;

import java.util.ArrayList;

public class Body extends RefreshableContent {
    Body() {
        children = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder content = new StringBuilder("Refreshing Body");
        this.children.forEach(child-> content.append(" "+child.refresh()));
        return String.valueOf(content);
    }
}
