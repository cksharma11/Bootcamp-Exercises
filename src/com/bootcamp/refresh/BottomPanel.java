package com.bootcamp.refresh;

import java.util.ArrayList;

public class BottomPanel extends RefreshableContent {

    BottomPanel() {
        this.children = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder content = new StringBuilder("Refreshing BottomPanel");
        this.children.forEach(child-> content.append(" " +child.refresh()));
        return String.valueOf(content);
    }
}
