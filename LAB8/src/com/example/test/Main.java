package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studenti = new ArrayList<Student>();

        //task 2 -  Creați 5 obiecte de tip Student și adăugați-le într-un ArrayList, pe care să îl
        // sortați (hint: Collections.sort),
        // apoi afisați conținutul din ArrayList.

        studenti.add(new Student("Pavelescu", "Mircea", 1, 6.00));
        studenti.add(new Student("Barbulescu", "Bogdan", 2, 5.00));
        studenti.add(new Student("Hanganu", "Eduard", 3, 3.50));
        studenti.add(new Student("Pavelescu", "Tom", 4, 6.00));
        studenti.add(new Student("Sandu", "Cicero", 5, 8.40));
        studenti.add(new Student("Sandu", "Alexe", 6, 8.40));

        Collections.sort(studenti);

        System.out.println("task 2:");
        System.out.println(studenti);

        //task 3 -Sortați ArrayList-ul de la punctul anterior cu metoda sort() din interfața List sau
        // cu Collections.sort(),
        // în care să folosiți o funcție lambda, în care se compară descrescător după medie.

        studenti.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));

        System.out.println("task 3:");
        System.out.println(studenti);

        //task 4 - Adăugați ArrayList-ul definit la subpunctul anterior într-un PriorityQueue
        // (hint: Collection.addAll), care folosește un Comparator (hint: constructor PriorityQueue)
        // sau o funcție anonimă,
        // unde elementele sunt sortate crescător după id
        // (aici puteti folosi Long.compare ca să comparați două numere de tip long).

        PriorityQueue<Student> q = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Long.compare(o1.getId(), o2.getId());
            }
        });

        System.out.println("task 4 :");
        q.addAll(studenti);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        //task 6  -  Folosiți un HashMap<Student, LinkedList<String», în care se vor adăuga perechi de tipul
        // (Student, lista de materii pe care le are studentul respectiv), iar apoi afisați conținutul colecției
        // (hint: Map.Entry și entrySet()).

        HashMap<Student,LinkedList<String>> stud = new HashMap<>();

        stud.put(new Student("Pavelescu", "Mircea", 1, 6.00),
                new LinkedList<>(Arrays.asList("Matematica","Geometrie","Romana"))
        );
        stud.put(new Student("Pavelescu", "Mircea", 1, 6.00),
                new LinkedList<>(Arrays.asList("Matematica","Geometrie","Sport"))
        );

        stud.put(new Student("Barbulescu", "Bogdan", 2, 5.00),
                new LinkedList<>(Arrays.asList("Astrofizica","Biologie","Romana"))
        );

        stud.put(new Student("Sandu", "Cicero", 5, 8.40),
                new LinkedList<>(Arrays.asList("Sport","Teoria Sportului","Studiu asupra handbalului feminin"))
        );

        System.out.println("Task 6: ");

        for(Map.Entry<Student,LinkedList<String>> entry: stud.entrySet()){
            System.out.println(entry.getKey() + " are urmatoarele materii: " + entry.getValue());
        }


        //Task 7 -  Extindeți clasa LinkedHashSet<Integer>, cu o clasă în care se vor putea adăuga doar numere pare.
        // Va fi suprascrisă metoda add, în așa fel încât să nu fie permise adăugarea de numere impare în colecție.
        // Pentru testare, adăugați numere pare și impare, iar după aceea iterați prin colecție, folosind Iterator
        // (tipizat cu Integer) sau folosind forEach, afișând elementele din colecție. Înlocuiți LinkedHashSet cu HashSet

        System.out.println("Task 7: ");

        NumerePare<Integer> numere = new NumerePare();

        numere.add(7);
        numere.add(4);
        numere.add(3);
        numere.add(10);
        numere.add(2);

        for(Integer num : numere){
            System.out.println(num);
        }





    }
}
