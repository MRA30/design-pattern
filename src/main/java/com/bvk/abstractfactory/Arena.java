package com.bvk.abstractfactory;

public interface Arena {

    void start();

}

class ArenaEasy implements Arena {

    @Override
    public void start() {
        System.out.println("Arena easy");
    }

}

class ArenaMedium implements Arena {

    @Override
    public void start() {
        System.out.println("Arena medium");
    }

}

class ArenaHard implements Arena {

    @Override
    public void start() {
        System.out.println("Arena hard");
    }

}