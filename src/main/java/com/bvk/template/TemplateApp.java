package com.bvk.template;

public class TemplateApp {

    public static void main(String[] args) {

        // untuk mempermudah pengembangan template dan kode logic tidak bercecer di masing masing class

        BlockGame blockGame1 = new BlockGame();
        blockGame1.start();

        BlockGame2 blockGame2 = new BlockGame2();
        blockGame2.start();

        BlockGame3 blockGame3 = new BlockGame3();
        blockGame3.start();

    }

}
