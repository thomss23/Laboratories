package com.company;

//public class PasswordMaker {
//
//    private String name;
//    private final int MAGIC_NUMBER=5;
//    private final String MAGIC_STRING;
//
//    public PasswordMaker(String name) {
//        this.name = name;
//        RandomStringGenerator generator = new RandomStringGenerator(25,"abcdefghijklmnopqrstuvwxyz");
//        //generating MAGIC_STRING from a string containing all the letters of the alphabet
//        MAGIC_STRING = new String(generator.next());
//   }
//
//    public String getMAGIC_STRING() {
//        return MAGIC_STRING;
//    }
//   public String getPassword(){
//
//    String step1 = Integer.toString(this.name.length());
//    // transforming the variable's size into String
//    int max = 100;
//    int min = 0;
//    int range = max-min +1;
//    String step2 = Integer.toString((int) (Math.random() * range) +min);
//    // generating random number between 0-100 and transforming it into a String
//
//    String concat1 = step1+step2; //combining the two strings
//
//    RandomStringGenerator generator = new RandomStringGenerator(MAGIC_NUMBER,MAGIC_STRING);
//    String concat2 = generator.next(); // getting the random string
//
//
//    return(concat2+concat1); // returning password
//   }

   //===============================================SINGLETON===============================================

    public class PasswordMaker {

        private String name;
        private final int MAGIC_NUMBER=5;
        private final String MAGIC_STRING;
        private static PasswordMaker instance = null;
        public static int count=0;

        private PasswordMaker() {
            RandomStringGenerator generator = new RandomStringGenerator(25,"abcdefghijklmnopqrstuvwxyz");
            //generating MAGIC_STRING from a string containing all the letters of the alphabet
            this.MAGIC_STRING = new String(generator.next());
        }

        //===Versiunea fara block static===

//        public static PasswordMaker getInstance() {
//            if (instance == null) {
//                instance = new PasswordMaker();
//            }
//            count++;
//            return instance;
//        }

        //===Implementati o versiune sa se initializeze instance intr un block static===
        static{
            if(instance == null){
                instance = new PasswordMaker();
            }
        }
        public static PasswordMaker getInstance() {
            count++;
            return instance;
        }

        public String getPassword(String name){
            this.name = name;
            String step1 = Integer.toString(this.name.length());
            // transforming the variable's size into String
            int max = 100;
            int min = 0;
            int range = max-min +1;
            String step2 = Integer.toString((int) (Math.random() * range) +min);
            // generating random number between 0-100 and transforming it into a String

            String concat1 = step1+step2; //combining the two strings

            RandomStringGenerator generator = new RandomStringGenerator(MAGIC_NUMBER,MAGIC_STRING);
            String concat2 = generator.next(); // getting the random string


            return(concat2+concat1); // returning password
        }






}
