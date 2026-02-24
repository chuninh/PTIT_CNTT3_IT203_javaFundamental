package ss11;

interface ISkill {
    void useUltimate(GameCharacter target);
}

abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;
    protected static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        } else {
            System.out.println(name + " mất " + amount + " máu. HP còn: " + hp);
        }
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }
}

class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " tấn công " + target.getName());
        target.takeDamage(attackPower);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " dùng 'Đấm ngàn cân'!");
        target.takeDamage(attackPower * 2);

        int selfDamage = (int)(hp * 0.1);
        hp -= selfDamage;
        System.out.println(name + " tự mất " + selfDamage + " máu.");
    }

    @Override
    public void takeDamage(int amount) {
        int reduced = amount - armor;
        if (reduced < 0) reduced = 0;

        System.out.println(name + " có giáp " + armor);
        super.takeDamage(reduced);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}

class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 5) {
            mana -= 5;
            System.out.println("[Pháp sư] " + name + " tung phép!");
            target.takeDamage(attackPower);
        } else {
            System.out.println(name + " hết mana, đánh yếu.");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            mana -= 50;
            System.out.println(name + " dùng 'Hỏa cầu'!");
            target.takeDamage(attackPower * 3);
        } else {
            System.out.println(name + " không đủ mana!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}

public class miniProject {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        GameCharacter[] characters = new GameCharacter[3];

        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 400, 40, 200);

        // Anonymous Class
        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("[Quái vật] Goblin tấn công!");
                System.out.println("Goblin cắn trộm " + target.getName());
                target.takeDamage(10);
            }
        };

        characters[0] = yasuo;
        characters[1] = veigar;
        characters[2] = goblin;

        System.out.println("Đã tạo " + GameCharacter.getCount() + " nhân vật.\n");

        yasuo.attack(goblin);
        System.out.println();

        veigar.useUltimate(yasuo);
        System.out.println();

        goblin.attack(veigar);

        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (int i = 0; i < characters.length; i++) {
            characters[i].displayInfo();
        }
    }
}