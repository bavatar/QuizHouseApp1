package com.company;

public class Window {
    private int windowSize;     // large, medium, small
    private String windowType;  // double pane, single pane

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public String getWindowType() {
        return windowType;
    }

    public void setWindowType(String windowType) {
        this.windowType = windowType;
    }

    public Window() {
    }

}
