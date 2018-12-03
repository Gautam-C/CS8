public class DNArunner {

    public static void main(String[] args) {

        String[] s = {"A", "G", "C", "C"};

        String[] s1 = {"A", "G", "C", "C", "T"};

        String[] s2 = {"A", "G", "C", "C", "T", "A"};


        Genome g = new Genome(s);

        Genome g1 = new Genome(s1);

        Genome g2 = new Genome(s2);


        System.out.println("Testing g getNucleotide");
        System.out.println(g.getNucleotide(3));
        System.out.println("C");

        System.out.println("Testing g1 getNucleotide");
        System.out.println(g1.getNucleotide(3));
        System.out.println("C");

        System.out.println("Testing g2 getNucleotide");
        System.out.println(g2.getNucleotide(3));
        System.out.println("C");

        System.out.println();

        System.out.println("Testing g printGenome");
        g.printGenome();
        System.out.println();
        System.out.println("AGCC");

        System.out.println();

        System.out.println("Testing g1 printGenome");
        g1.printGenome();
        System.out.println();
        System.out.println("AGCCT");

        System.out.println();

        System.out.println("Testing g2 printGenome");
        g2.printGenome();
        System.out.println();
        System.out.println("AGCCTA");

        System.out.println();


        System.out.println("Testing g countNucleotides");
        System.out.println(g.countNucleotides());
        System.out.println();
        System.out.println("1 2 0 1");

        System.out.println();

        System.out.println("Testing g1 countNucleotides");
        System.out.println(g1.countNucleotides());
        System.out.println();
        System.out.println("1 2 1 1");

        System.out.println();

        System.out.println("Testing g2 countNucleotides");
        System.out.println(g2.countNucleotides());
        System.out.println();
        System.out.println("2 2 1 1");

        System.out.println();


        System.out.println("Testing g transcribeRNA");
        System.out.println();
        for (String elem : g.transcribeRNA()) {
            System.out.print(elem);
        }

        System.out.println();

        System.out.println("AGCC");

        System.out.println();

        System.out.println("Testing g1 transcribeRNA");
        System.out.println();
        for (String elem : g1.transcribeRNA()) {
            System.out.print(elem);
        }

        System.out.println();

        System.out.println("AGCCU");

        System.out.println();

        System.out.println("Testing g2 transcribeRNA");
        System.out.println();
        for (String elem : g2.transcribeRNA()) {
            System.out.print(elem);
        }

        System.out.println();

        System.out.println("AGCCUA");

        System.out.println();


        System.out.println("Testing g calculateGC");

        System.out.println(g.calculateGC());

        System.out.println("Expected : 75.0");

        System.out.println();


        System.out.println("Testing g1 calculateGC");

        System.out.println(g1.calculateGC());

        System.out.println("Expected : 60.0");

        System.out.println();

        System.out.println("Testing g2 calculateGC");

        System.out.println(g2.calculateGC());

        System.out.println("Expected : 50.0");

        System.out.println();
    }

}
