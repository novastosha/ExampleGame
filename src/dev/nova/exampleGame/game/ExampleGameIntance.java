package dev.nova.exampleGame.game;

import dev.nova.gameapi.game.base.instance.GameInstance;
import dev.nova.gameapi.game.map.GameMap;

import javax.annotation.Nonnull;

public class ExampleGameIntance extends GameInstance {

    /**
     *
     * Required to initialize the game instance!
     *
     */
    public static final String code = "exampleInstance";
    private int ticks;

    public ExampleGameIntance(@Nonnull String gameBase, GameMap map) {
        super("Example Instance", gameBase, map, new String[]{"An example game!"}, "Example!");
    }

    /**
     * Runs every server tick
     *
     * Where 20 ticks is a second
     *
     */
    @Override
    public void tick() {
        ticks++;
        if(ticks == 20L){
            ticks = 0;
            //Sends a message to every player in this game using game utils!
            //Every running instance has its own utils class.
            getUtils().sendMessage("§aA second has passed!");
        }
    }
}
