public class Player {



  String Name;
  Statistics stats = new Statistics();
  public String Weapon;


  public String getName() {
    return this.Name;
  }

  public Statistics getStats() {
    return stats;
  }

  public String getWeapon() {
    return Weapon;
  }



  public void setWeapon(String weapon) {
    Weapon = weapon;
  }

  public void setName(String name) {
    this.Name =name;
    stats.setPlayerName(name);

  }
















}
