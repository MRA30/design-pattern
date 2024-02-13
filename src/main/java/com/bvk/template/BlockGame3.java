package com.bvk.template;

public class BlockGame3 extends BlockGameTemplate {
    @Override
    public String getTitle() {
        return "BLOCK GAME 3";
    }

    @Override
    public String getCharacter() {
        return "X";
    }

    @Override
    public String getEndTitle() {
        return "BLOCK GAME 3 FINISHED";
    }

    @Override
    public Integer getHeight() {
        return 10;
    }

    @Override
    public Integer getWidth() {
        return 20;
    }
}
