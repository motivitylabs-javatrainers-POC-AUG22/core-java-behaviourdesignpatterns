package org.behaviour_design_patterns.template_design_pattern;

public class Template_design_pattern {
    public static void main(String[] args) {
        Game game=(Game) new Chess();
        game.play();
    }
}
