package ua.lviv.iot.lab1;

//power - power of ventilators,
//animals - count of animals
record Farm(String name,String location,int animals,int yield, int square,int power) {
    private static String country = "Ukraine";
    public static String showCountry() {return country;}
    Farm () {
        this ("","",0);
    }
    Farm (String name, String location, int animals) {
        this(name,location,animals,0);
    }
    Farm (String name, String location, int animals, int yield) {
        this(name,location,animals,yield,0);
    }
    Farm (String name, String location, int animals, int yield, int square) {this (name, location, animals,yield,square,0);}

    @Override
    public String toString () {
        String res = "Farm: ";
        if(name() != "") res += "\n\tName: " + name() + ";";
        if(location() != "") res+= "\n\tLocation: " + location() + ";";
        if(animals() != 0) res += "\n\tCount of animals: " + animals() + ";";
        if(yield != 0) res += "\n\tAnnual yield: " + yield + " kg;";
        if(square() != 0) res += "\n\tSquare of arable land: " + square() + " hectares;";
        if(power() != 0) res += "\n\tPower of ventilators: " + power() + " watts;";
        return res;
    }
}

class Main {
    public static void main (String[] args) {
        Farm farm1 = new Farm ("Shevchenko Agrofirm LLC","Hryhorivka,Chernihiv Oblast`", 2200);
        System.out.println (farm1.toString ());
        Farm farm2 = new Farm ("Promin-Lan LLC","Vesela Dolyna, Poltava Oblast`",810,8529);
        System.out.println (farm2.toString ());
        Farm farm3 = new Farm ("LLC Agrofirm \"Sonyashnyk\"","Velyki Krynky, Poltava Oblast`",631,9352,2343);
        System.out.println (farm3.toString ());
        System.out.println ("Country: " + Farm.showCountry());
    }
}