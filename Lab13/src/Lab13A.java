import java.util.Scanner;
class Enemy{
    int hp, dmg;
    boolean alive=true;
    Enemy(int hp,int dmg){
        this.hp=hp;
        this.dmg=dmg;
    }

    String print(int enemies, Enemy[] enemy) {
        String enemyhealth="";
        int enemycount=0;

        for (int i = 0; i < enemies; i++) {
            if (enemy[i].alive){
                enemycount++;
            }
           enemyhealth+=("|"+ enemy[i].hp);
        }
        return "Num enemies left: "+enemycount+ "\n"+enemyhealth;
    }

    public int getHp() {
        return hp;
    }

    void takeDamage(int dmg){
        hp-=dmg;
        if (hp<=0){
            alive=false;
        }
    }
}
class Hero {
    int hp, dmg;
    boolean alive = true;

    Hero(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }
    void takeDamage(int dmg) {
        hp -= dmg;
        if (hp <= 0) {
            alive = false;
        }
    }
}
    public  class Lab13A {
        /* Class: CSE 1321L
                    Section: 05
                    Term: Fall
                    Instructor: Vishal
                    Name: Shane Wild
                    Lab#: 12B

            */
        public static void main(String[] Args) {
            int hp, enemydmg, herodmg, enemies, round=0, counter;
            Scanner scan= new Scanner(System.in);
            System.out.print("Enter the number of enemies: ");
            enemies=scan.nextInt();
            System.out.print("Enter the enemy damage: ");
            enemydmg=scan.nextInt();
            //Summon enemies here w array
            Enemy[] e1= new Enemy[enemies];
            for (int i=0;i<enemies;i++){
                hp=10+i*2;
        e1[i]=new Enemy(hp,enemydmg);
            }
            System.out.print("Enter the hero's starting HP:");
            hp=scan.nextInt();
            System.out.print("Enter the hero's damage: ");
            herodmg=scan.nextInt();
            Hero h1= new Hero(hp,herodmg);
        do {
            round++;
            counter =0;
            while (counter<enemies) {
                if (e1[counter].alive) {
                    h1.takeDamage(e1[counter].dmg);
                }
                if (e1[counter].alive) {
                    e1[counter].takeDamage(h1.dmg);
                }
                counter++;
            }
            System.out.println("==== After round "+round+" ====");
            System.out.println(e1[enemies-1].print(enemies, e1 ));
            System.out.println("Hero HP: " +h1.hp);

        }while(h1.alive && e1[enemies-1].alive);
        if(e1[enemies-1].alive){
                System.out.println("Enemies Win!");
            }
        else if (h1.alive){
            System.out.println("Hero Wins!");
        }

        }
    }

