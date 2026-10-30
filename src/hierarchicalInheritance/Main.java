package hierarchicalInheritance;

public class Main {
    public static void main(String[] args) {

        Developer d = new Developer();
        d.display();
        d.developerWork();

        System.out.println();

        Tester t = new Tester();
        t.display();
        t.testerWork();
    }
}

//In hierarchical inheritance, multiple child classes inherit from a single parent class.
//indha example ah Employee class la oru method eluthiruken and adha developer and tester oda connect panniruken
//ippo developer andh tester layum different differetnt method eluthiruken
//ippo namma developer and tester ku object  create panni renduthyum thanni thaniya call pannikalam employe class la ulla method ah
