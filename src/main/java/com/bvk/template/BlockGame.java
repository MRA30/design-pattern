package com.bvk.template;

public class BlockGame extends BlockGameTemplate {
    @Override
    public String getTitle() {
        return "BLOCK GAME";
    }

    @Override
    public String getCharacter() {
        return "A";
    }

    @Override
    public String getEndTitle() {
        return "BLOCK GAME FINISH";
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
