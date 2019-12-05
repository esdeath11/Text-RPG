public class Enemy extends Human {

    public String EnemyName[] = {"Soldier", "Heliodora", "Aikaterine", "Protesilaus", "Scamandrius", "Eutychides"};
    public int dropExp[] = {70, 150, 250, 300, 400, 1000};
  //  public int idExp[]={1,2,3,4,5,6};


    @Override
    public void setExp(int exp) {
        super.setExp(exp);
    }
}