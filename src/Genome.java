public class Genome {

    private String[] sequence;

    public Genome (String [] sequence1) {

        sequence = sequence1;

    }

    public String[] getSequence() {

        return sequence;

    }

    public String getNucleotide(int index) {

        return sequence[index];

    }

    public void printGenome() {

        System.out.println();

        for (String nucleotide : sequence) {

            System.out.print(nucleotide);

        }

    }

    public String countNucleotides() {

        int aCount = 0;

        int cCount = 0;

        int gCount = 0;

        int tCount = 0;

        for (String elem : sequence) {

            if (elem.equals("A")) {

                aCount++;

            }

            if (elem.equals("C")) {

                cCount++;

            }

            if (elem.equals("T")) {

                tCount++;

            }

            if (elem.equals("G")) {

                gCount++;

            }

        }

        return aCount + " " + cCount + " " + tCount + " " + gCount;

    }

    public String[] transcribeRNA() {

        String[] rna = new String[sequence.length];

        int index = 0;

        for (String elem : sequence) {

            if (elem.equals("T")) {

                rna[index] = "U";

                index++;
            } else {

                rna[index] = elem;

                index++;
            }

        }

        return rna;

    }

    public double calculateGC() {

        int cCount = 0;

        int gCount = 0;

        for (String elem : sequence ) {

            if (elem.equals("C")) {

                cCount++;

            }

            if (elem.equals("G")) {

                gCount++;

            }

        }

        return 100 * (((double)(gCount + cCount))/sequence.length);

    }



}