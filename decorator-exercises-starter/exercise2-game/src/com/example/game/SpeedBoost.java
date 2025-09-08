package com.example.game;

public class SpeedBoost extends CharacterDecorator{
    int boost;
    public SpeedBoost(Character character, int boost) {
        super(character);
        this.boost = boost;
    }
    
    @Override
    public int getSpeed() {
        return super.getSpeed() + boost;
    }

    @Override
    public void move() {
        System.out.println("speed boosted " + getSpeed() + " with sprite " + getSprite());
    }
}
