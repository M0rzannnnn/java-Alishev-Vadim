package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt = 15;
    public Shaman () {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;

    }

    @Override
    public void healHimself() {
        health += 50;
        if (health >100)
            health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health >100)
            hero.health = 100;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackResult = hero.health - magicAtt* (1 - hero.magicDef);
        hero.health -= attackResult;
        if (hero.health-attackResult < 0) {
            hero.health = 0;
        }
    }

    @Override
    public String toString() {
        return "ХП Шамана :" + health;
    }
}