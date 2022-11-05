package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;


    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }


    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }


    public void takeDamage(Champion other) {
        int damage;
        if (armor >= other.attack) {
            damage = 1;
            life -= damage;
        }else {
            damage = other.attack - armor;
            life -= damage;
        }
    }

    public String status() {
        if (life < 1) {
            life = 0;
            return name + ": " + life + " de vida (morreu)";
        }
        return name + ": " + life + " de vida";
    }

}
