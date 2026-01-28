package prototype_pattern;

import lombok.Setter;

interface MinionPrototype {
    MinionPrototype clone();
}

class Minion implements MinionPrototype {
    @Setter
    private Integer id;
    private Double hp;
    private Integer level;
    @Setter
    private String color;
    private Integer damage;
    private Integer skill;

    public Minion(Integer id, Double hp, Integer level, String color, Integer damage, Integer skill) {
        this.id = id;
        this.hp = hp;
        this.level = level;
        this.color = color;
        this.damage = damage;
        this.skill = skill;
    }

    @Override
    public MinionPrototype clone() {
        return new Minion(this.id, this.hp, this.level, this.color, this.damage, this.skill);
    }

    @Override
    public String toString() {
        return "Minion{" +
                "id=" + id +
                ", hp=" + hp +
                ", level=" + level +
                ", color='" + color + '\'' +
                ", damage=" + damage +
                ", skill=" + skill +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {

        Minion minion1 = new Minion(
                1,
                100.0,
                10,
                "RED",
                100,
                3
        );

        Minion minion2 = (Minion) minion1.clone();
        minion2.setColor("BLUE");
        minion2.setId(2);

        System.out.println(minion1);
        System.out.println(minion2);
    }
}
