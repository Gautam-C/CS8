public class Genome {

    private String[] sequence;

    public Genome (String [] sequence1) {

        sequence = sequence1;

    }

    /** returns the array, sequence
     *
     * @return String[]
     */
    public String[] getSequence() {

        return sequence;

    }


    /** returns the nucleotide at the specified index
     *
     * @param index of type int
     * @return String
     */
    public String getNucleotide(int index) {

        return sequence[index];

    }

    /** Prints to terminal the nucleotide sequence as a String
     *
     * @return void
     */
    public void printGenome() {

        System.out.println();

        for (String nucleotide : sequence) {

            System.out.print(nucleotide);

        }

    }


    /** Counts the amount of each nucleotide in sequence
     *
     * @return String
     */
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


    /** Returns the DNA transcribed to RNA
     *
     * (incorrectly though, as in reality :
     * 'A's would become 'U's
     * 'C's would become 'G's
     * 'G's would become 'C's
     * 'T's would become 'A's
     * )
     *
     * @return String[]
     */
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


    /** returns the GC-content of the nucleotide sequence
     *
     * @return double
     */
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