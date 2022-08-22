public class Main {

    public static void main(String[] args){

        OnRoad autovehicul = new OnRoad("111",4,"Skoda Rapid",4,4);
        autovehicul.prinInfo();
        autovehicul.goTo(10.0,20.0);
        autovehicul.addFuel(150.0);
        System.out.println();

        OnWater ambarcatiune = new OnWater("222",8,"BlackBeard",2,230);
        ambarcatiune.prinInfo();
        ambarcatiune.goTo(20.0,30.0);
        ambarcatiune.addFuel(250.0);
        System.out.println();

        OnAir aeroplanLowCost = new OnAir("3331",50,"Tarom",2,false);
        aeroplanLowCost.prinInfo();
        aeroplanLowCost.goTo(30.0,40.0);
        aeroplanLowCost.addFuel(350.0);
        System.out.println();

        OnAir aeroplanHighCost = new OnAir("3332",10,"Emirate",4,true);
        aeroplanHighCost.prinInfo();
        aeroplanHighCost.goTo(40.0,50.0);
        aeroplanHighCost.addFuel(450.0);



    }
}
