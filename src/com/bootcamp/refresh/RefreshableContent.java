package com.bootcamp.refresh;

import java.util.List;

abstract class RefreshableContent {
    List<RefreshableContent> children;

    abstract String refresh();

    void addChild(RefreshableContent child) {
        this.children.add(child);
    }
}
