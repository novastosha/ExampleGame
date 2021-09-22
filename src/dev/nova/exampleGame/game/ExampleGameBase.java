package dev.nova.exampleGame.game;

import dev.nova.exampleGame.ExamplePlugin;
import dev.nova.gameapi.game.base.GameBase;
import org.bukkit.ChatColor;

public class ExampleGameBase extends GameBase {
    public ExampleGameBase() {
        super(ExamplePlugin.getPlugin(ExamplePlugin.class),"example","Example Game", new Class[] {
                ExampleGameIntance.class
        }, ChatColor.RED);
    }
}
