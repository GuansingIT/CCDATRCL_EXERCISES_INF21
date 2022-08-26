public class Weapon {
   // Weapon attributes
  
       String name;
       double damage;
       int weight;
       String rarity;
       String description;
  
  // Weapon method
    public void weaponDescription () {
      System.out.println("Greetings warrior! This " + name + " can help you to become one of the greatest by contributing its " + damage + " damage!");
    }
}
