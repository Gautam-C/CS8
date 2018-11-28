public class GenomeRunner {

    public static void main(String[] args) {

        String[] s = {"A", "G", "C", "C", "T", "A", "A"};

        Genome testGenome = new Genome(s);

        System.out.println(testGenome.getNucleotide(5));

        testGenome.printGenome();

    }

}
