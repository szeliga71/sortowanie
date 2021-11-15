public class RadixSort {
    public int liczbaR[];
    public double liczbyDoubleR[];
    public double[] liczbyFloatR;
    public char literkiR[];
    long wynik;

    public RadixSort(int liczba[]){


        liczbaR=new int[liczba.length];
        for(int i=0;i<liczbaR.length;i++){
            liczbaR[i]=liczba[i];}


       long start=System.nanoTime();
        radixSortInt(liczbaR);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania RadixSort tablicy int "+wynik);
        for(int i=0;i<liczbaR.length;i++){
            System.out.print(liczbaR[i]+" ");

        }
        System.out.println();
    }

    public RadixSort(double liczba[]){
        liczbyDoubleR=new double[liczba.length];
        for(int i=0;i<liczbyDoubleR.length;i++){
            liczbyDoubleR[i]=liczba[i];}

       long start=System.nanoTime();
        radixSortDouble(liczbyDoubleR);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania RadixSort tablicy double "+wynik);
        for(int i=0;i<liczbyDoubleR.length;i++){
            System.out.print(liczbyDoubleR[i]+" ");

        }
        System.out.println();
    }


    public RadixSort(char liczba[]){
       int []liczbyR=new int[liczba.length];
        for(int i=0;i<liczbyR.length;i++){
            liczbyR[i]=liczba[i]; }


        long start=System.nanoTime();
        radixSortInt(liczbyR);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania RadixSort tablicy char "+wynik);
        for(int i=0;i<liczbyR.length;i++){
            System.out.print((char)liczbyR[i]+" ");

        }
        System.out.println();
    }
    public RadixSort(float liczba[]){
        liczbyFloatR=new double[liczba.length];
        for(int i=0;i<liczbyFloatR.length;i++){
            liczbyFloatR[i]=liczba[i];}

       long start=System.nanoTime();
        radixSortDouble(liczbyFloatR);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania RadixSort tablicy float "+wynik);
        for(int i=0;i<liczbyFloatR.length;i++){
            System.out.print((float)liczbyFloatR[i]+" ");

        }
        System.out.println();
    }



    //========================================================================================


    public void radixSortInt(int[]liczba){
    int MAXEL = znajdzNajwieksza(liczba);

        int []b=new int [liczba.length];
        int m;
        m = 1;

       while (m <= MAXEL) {
        Sort(liczba, b, m);
        m <<= 1;
        Sort(b, liczba, m);
    }

}

public static void Sort ( int wejscie[], int pomocnicza[], int m)
    {

        int N= wejscie.length;


        int a=0;
        int b=0;
        for (int i = 0; i <N; i++){

            if((wejscie[i] & m) > 0){
                a++;
            }else{
                b++;}

            for(int k=N-1;k>=0;k--)
                if((wejscie[i] & m) > 0){
                    pomocnicza[N-a]=wejscie[i];
                }else{
                    pomocnicza[b-1]=wejscie[i];
                }
        }
        for (int i = 0; i < pomocnicza.length - 1; i++) {
            int pozMinimalna = i;
            for (int j = i + 1; j < pomocnicza.length; j++)
                if (pomocnicza[pozMinimalna] > pomocnicza[j])
                    pozMinimalna = j;
            int temp = pomocnicza[pozMinimalna];
            pomocnicza[pozMinimalna] = pomocnicza[i];
            pomocnicza[i] = temp;
        }
    }
    public static int znajdzNajwieksza(int[]numbers){
        int m=numbers[0];
        for (int w=0;w< numbers.length;w++){
            if((w+1)< numbers.length){
                if(numbers[w+1]>numbers[w]&&(numbers[w+1]>m)){m=numbers[w+1];}

            }}
        return m;}

    public void radixSortDouble(double[]liczba){

            long start=System.nanoTime();
            for(int i=liczba.length-2;i>=0;i--){
                double val=liczba[i];
                int k=i+1;
                while((k<liczba.length)&&(val>liczba[k]))
                {
                    liczba[k-1]=liczba[k];
                    k++;
                }
                liczba[k-1]=val;

            }
        }
}


