import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public int liczbaB[];
    public double liczbyDoubleB[];
    public double[] liczbyFloatB;
    public int[] literkiB;
    long wynik;

    public BucketSort(int liczba[]){


        liczbaB=new int[liczba.length];
        for(int i=0;i<liczbaB.length;i++){
            liczbaB[i]=liczba[i];}

        long start=System.nanoTime();
        bucketSortInt(liczbaB);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania BucketSort tablicy int "+wynik);
        for(int i=0;i<liczbaB.length;i++){
            System.out.print(liczbaB[i]+" ");

        }
        System.out.println();
    }

    public BucketSort(double liczba[]){
        liczbyDoubleB=new double[liczba.length];
        for(int i=0;i<liczbyDoubleB.length;i++){
            liczbyDoubleB[i]=liczba[i];}


        long start=System.nanoTime();
        bucketSortDouble(liczbyDoubleB);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania BucketSort tablicy double "+wynik);
        for(int i=0;i<liczbyDoubleB.length;i++){
            System.out.print(liczbyDoubleB[i]+" ");

        }
        System.out.println();
    }


    public BucketSort(char liczba[]){
        literkiB= new int[liczba.length];
        for(int i=0;i<literkiB.length;i++){
            literkiB[i]=liczba[i];}

        long start=System.nanoTime();
        bucketSortInt(literkiB);
        long stop=System.nanoTime();
         wynik=(stop-start);
        System.out.println("Czas sortowania BucketSort tablicy char "+wynik);
        for(int i=0;i<literkiB.length;i++){
            System.out.print((char)literkiB[i]+" ");

        }
        System.out.println();
    }
    public BucketSort(float liczba[]){
        liczbyFloatB=new double[liczba.length];
        for(int i=0;i<liczbyFloatB.length;i++){
            liczbyFloatB[i]=liczba[i];}



        long start=System.nanoTime();
        bucketSortDouble(liczbyFloatB);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania BucketSort tablicy float "+wynik);
        for(int i=0;i<liczbyFloatB.length;i++){
            System.out.print((float)liczbyFloatB[i]+" ");

        }
        System.out.println();
    }
    public static void bucketSortInt(int[]liczba){


            int[] temp = maximalMinimal(liczba);
            int valMaxi = temp[1];
            int valMini = temp[0];
            int[] buckets = new int[valMaxi - valMini + 1];


            for (int i = 0; i < liczba.length; i++)
            {
                buckets[liczba[i] - valMini]= buckets[liczba[i] - valMini]+1;
            }
            int index = 0;

            for (int i = 0; i < buckets.length; i++) {
                int a;
                for (a = index; a < buckets[i] + index; a++) {
                    liczba[a] = i + valMini;
                }
                index = a;
            }
        }


    public static void bucketSortDouble(double[]liczba){

        int max = (int) ((znajdzNajwieksza(liczba)) + 1);

        if (liczba.length > 0) {


            List[] koszyk = new ArrayList[max];

            for (int i = 0; i < max; i++) {
                koszyk[i] = new ArrayList<Double>();
            }

            for (int j = 0; j < liczba.length; j++) {
                if (liczba[j] < 0) {

                    koszyk[0].add(liczba[j]);
                } else {
                    double index_koszy = (liczba[j] * max) / max;
                    koszyk[(int) index_koszy].add(liczba[j]);
                }


            }

            for (int k = 0; k < koszyk.length - 1; k++) {
                int roz = koszyk[k].size();
                if (roz > 0) {
                    for (int h = koszyk[k].size() - 2; h >= 0; h--) {


                        double val = (double) koszyk[k].get(h);

                        int p = h + 1;

                        while ((p < koszyk[k].size()) && (val > (double) koszyk[k].get(p))) {
                            koszyk[k].set((p - 1), koszyk[k].get(p));

                            p++;
                        }

                        koszyk[k].set((p - 1), val);

                    }

                }
            }

            int index = 0;
            for (int i = 0; i <max; i++) {
                for (int j = 0; j < koszyk[i].size(); j++) {
                    liczba[index] = (double)koszyk[i].get(j);
                    index++;
                }
            }
        }
    }

    public static double znajdzNajwieksza(double[]numbers){
        double m=numbers[0];
        for (int w=0;w< numbers.length;w++){
            if((w+1)< numbers.length){
                if(numbers[w+1]>numbers[w]&&(numbers[w+1]>m)){m=numbers[w+1];}

            }}
        return m;}


    public static int[] maximalMinimal(int[] tab) {
        int[] tabTemp = new int[2];
        tabTemp[0] = tab[0];
        tabTemp[1] = tab[0];

        for(int i=0;i<tab.length;i++){
            if(tabTemp[0] > tab[i]) {
                tabTemp[0] = tab[i];
            }
            else if (tabTemp[1] < tab[i]) {
                tabTemp[1] = tab[i];
            }
        }
        return tabTemp;
    }


}

