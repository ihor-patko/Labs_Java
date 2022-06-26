package ua.lviv.iot.lab1;

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
