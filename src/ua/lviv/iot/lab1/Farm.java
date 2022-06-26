package ua.lviv.iot.lab1;

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
            res += "\n\tName: " + name() + ";";
            res += "\n\tLocation: " + location() + ";";
            res += "\n\tCount of animals: " + animals() + ";";
            res += "\n\tAnnual yield: " + yield + " kg;";
            res += "\n\tSquare of arable land: " + square() + " hectares;";
            res += "\n\tPower of ventilators: " + power() + " watts;";
            return res;
        }
    }
