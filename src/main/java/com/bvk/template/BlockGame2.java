package com.bvk.template;

public class BlockGame2 extends BlockGameTemplate{
    @Override
    public String getTitle() {
        return "BLOCK GAME 2";
    }

    @Override
    public String getCharacter() {
        return "O";
    }

    @Override
    public String getEndTitle() {
        return "BLOCK GAME 2 FINISHED";
    }

    @Override
    public Integer getHeight() {
        return 10;
    }

    @Override
    public Integer getWidth() {
        return 10;
    }
}
