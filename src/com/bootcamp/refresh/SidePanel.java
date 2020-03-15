package com.bootcamp.refresh;

import java.util.ArrayList;
import java.util.List;

public class SidePanel extends RefreshableContent {
    SidePanel() {
        this.children = new ArrayList<>();
    }

    @Override
    public String refresh() {
        StringBuilder content = new StringBuilder("Refreshing SidePanel");
        this.children.forEach(child -> content.append(" " + child.refresh()));
        return String.valueOf(content);
    }
}
