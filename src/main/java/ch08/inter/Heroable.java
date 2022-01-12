package ch08.inter;

interface Fightable {
    int fire();
}

interface Transformable {
    void changeShape(boolean isHeroMode);
}

public interface Heroable extends Fightable, Transformable{
    void upgrade();
}
