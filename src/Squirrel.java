public class Squirrel {
    private int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
        return nuts[index];

    }

    ///*
    public int maxNuts() {
        int maxOfNuts = 0, len = nuts.length;
        if (len > 1) {
            int i = 0;

            if (nuts[i] > 0)
                maxOfNuts += nuts[i];

            for (; i < len - 2; i++) {
                if (nuts[i + 1] < 0 && nuts[i + 1] <= nuts[i + 2])
                    i++;
                maxOfNuts += nuts[i + 1];
                if (maxOfNuts < 0)
                    maxOfNuts = 0;
            }
            if (i == len - 2 && nuts[i + 1] > 0) {
                maxOfNuts += nuts[i + 1];
            }
            return maxOfNuts;
        } else if (nuts[0] >= 0)
            return nuts[0];
        else
            return 0;
    }

    public static void main(String[] args) {

    Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
System.out.println(s.maxNuts());
    Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
System.out.println(s2.maxNuts());
        System.out.println();
}}
