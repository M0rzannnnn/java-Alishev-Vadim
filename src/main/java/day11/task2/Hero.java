package day11.task2;

public abstract class Hero implements PhysAttack {

    int health;
    double physDef;
    double magicDef;
    int physAtt;
    public Hero() {
        health = 100;
    }
    public void physicalAttack(Hero hero1){
        double attackResult = physAtt * (1 - hero1.physDef);
        hero1.health -= attackResult;
        if (hero1.health < 0) {
            hero1.health = 0;
        }
    }
}
