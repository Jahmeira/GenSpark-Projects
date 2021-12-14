package Main;


import java.util.ArrayList;

public class Goblin extends Humanoid{

    ArrayList<String> loot;
    ArrayList<String> inventory;

    public Goblin(String name){
        try{
            setName(name);
            setHealth(1100);
            setAttack(10);
            setDefense(8);
            setLuck(2);
            setGold(RandomRan.generator(45, 145));

           // loot = new ArrayList<>();
            inventory = new ArrayList<>();

            inventory.add("Sword");
            inventory.add("Gun");
            inventory.add("Pepper Spray");
            inventory.add("Grenade");

            int num = RandomRan.generator(0, (loot.size() - 1));

            inventory.add(loot.get(num));
        }catch (Exception e){
            System.out.println("Failed to create Goblin object.");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        try{
            return "Goblin: {" +
                    " Name: " + this.getName() +
                    ", Level: " + this.getLevel() +
                    ", Health: " + this.getHealth() +
                    ", Attack: " + this.getAttack() +
                    ", Defense: " + this.getDefense()+
                    ", Luck: " + this.getLuck() +
                    "}";
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Failed to print Goblin object.";

        }
    }
}