package day11.task2;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;

    }

    @Override
    public void healHimself() {
        health += 25;
        if (health >100){
            health = 100;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        if(hero.health > 100){
            hero.health = 100;
        }
    }

    @Override
    public String toString() {
        return "ХП Паладина : " + health;
    }
}