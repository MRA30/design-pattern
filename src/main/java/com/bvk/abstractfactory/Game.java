package com.bvk.abstractfactory;

public class Game {

    private final Arena arena;

    private final Level level;

    private final Enemy enemy;

    public Game(GameFactory gameFactory) {
        this.arena = gameFactory.createArena();
        this.level = gameFactory.createLevel();
        this.enemy = gameFactory.createEnemy();
    }

    public void start() {
        this.arena.start();
        this.level.start();
        this.enemy.start();
    }

}
