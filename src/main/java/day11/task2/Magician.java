package day11.task2;

public class Magician extends Hero implements MagicAttack{
    int magicAtt = 20;

    public Magician () {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;

    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackResult = magicAtt* (1 - hero.magicDef);
        hero.health -= attackResult;
        if (hero.health-attackResult < 0) {
            hero.health = 0;
        }
    }

    @Override
    public String toString() {
        return "ХП Мага :" + health;
    }
}
