package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character wrappee) {
        super(wrappee);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 2;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 5;
    }

    @Override
    public String getSprite() {
        return "golden_" + super.getSprite();
    }

    @Override
    public void move() {
        System.out.println("Golden Aura");
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Golden Aura");
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }
}
