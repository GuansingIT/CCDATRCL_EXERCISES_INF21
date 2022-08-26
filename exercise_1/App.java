public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        // Weapon Class
        Weapon common new = Weapon();
            
        common.object = "Axe";
        common.name = "Mjollnir"
        common.weight = 4.5;
        common.rarity = "Common"
        common.description = "A weapon combined with stone and wood to execute nemesis."
            
        Weapon rare new = Weapon();
        
        rare.object = "Hammer";
        rare.name = "Mjollnir";
        rare.weight = 4.5;
        rare.rarity = "Rare";
        Description - "A mighty hammer owned by the god of lightning thor!"
            
        Weapon legend new = Weapon();
        
        legend.object = "Sword";
        legend.name = "Mighty Sword";
        legend.weight = 2;
        legend.rarity = "Legendary";
        legend.description = "A mighty sword used mostly to execute masters of enemies";
        
