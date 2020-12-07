package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lindt bomboana1 = new Lindt("cirese","india",3,2,1);

//        Lindt bomboana2 = new Lindt("cirese","india",3,2,1);
//        System.out.println(bomboana1.equals(bomboana2)); //afiseaza true - testam dupa origine si flavor

        Bravelli bomboana3 = new Bravelli("arahide","germania",2,3);
        ChocAmor bomboana4 = new ChocAmor("ciocolata","turcia",2);

        CandyBag cutie = new CandyBag("Cutiuta");
        cutie.getBomboane().add(bomboana1);
        cutie.getBomboane().add(bomboana3);
        cutie.getBomboane().add(bomboana4);

        Area locatie = new Area(cutie,2,"Gara catelu");

        locatie.printBag();
        System.out.println("==========");
        locatie.getBirthdayCard();





    }
}
