package com.bootcamp.refresh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BodyTest {

    private Body body;
    private SidePanel sidePanel;
    private BottomPanel bottomPanel;
    private Content content;

    private Image image;
    private Text text;

    @BeforeEach
    void setUp() {
        body = new Body();
        sidePanel = new SidePanel();
        bottomPanel = new BottomPanel();
        content = new Content();
        image = new Image();
        text = new Text();

        body.addChild(sidePanel);
        body.addChild(bottomPanel);
        body.addChild(content);

        content.addChild(image);
        content.addChild(text);
    }

    @Test
    void shouldRefreshBody() {
        String expected = "Refreshing Body Refreshing SidePanel Refreshing BottomPanel Refreshing Content Refreshing Image Refreshing Text";
        String actual = body.refresh();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRefreshSidePanel() {
        String expected = "Refreshing SidePanel";
        String actual = sidePanel.refresh();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRefreshContent() {
        String expected = "Refreshing Content Refreshing Image Refreshing Text";
        String actual = content.refresh();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRefreshBottomPanel() {
        String expected = "Refreshing BottomPanel";
        String actual = bottomPanel.refresh();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRefreshImage() {
        String expected = "Refreshing Image";
        String actual = image.refresh();

        assertEquals(expected, actual);
    }

    @Test
    void shouldRefreshText() {
        String expected = "Refreshing Text";
        String actual = text.refresh();

        assertEquals(expected, actual);
    }
}