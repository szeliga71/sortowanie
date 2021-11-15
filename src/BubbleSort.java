public class BubbleSort {

private int liczbaB[];
private double liczbyDouble[];
private double[] liczbyFloat;
private int[] literki;
long wynik;


public BubbleSort(int liczba[]){

    liczbaB=new int[liczba.length];
    for(int i=0;i<liczbaB.length;i++){
        liczbaB[i]=liczba[i];}

    long start=System.nanoTime();
    sortowanieBabelkowe(liczbaB);
    long stop=System.nanoTime();

    wynik=(stop-start);
    System.out.println("Czas sortowania Babelkowego tablicy int "+wynik);
    for(int i=0;i<liczbaB.length;i++){
        System.out.print(liczbaB[i]+" ");
    }
    System.out.println();
}



    public BubbleSort(double liczba[]){
        liczbyDouble=new double[liczba.length];
        for(int i=0;i<liczbyDouble.length;i++){
            liczbyDouble[i]=liczba[i];}

        long start=System.nanoTime();
        sortowanieBabelkoweDouble(liczbyDouble);
        long stop=System.nanoTime();

        wynik=(stop-start);
        System.out.println("Czas sortowania Babelkowego tablicy double "+wynik);
        for(int i=0;i<liczbyDouble.length;i++){
            System.out.print(liczbyDouble[i]+" ");
        }
        System.out.println();
    }



    public BubbleSort(char liczba[]){
    literki=new int[liczba.length];
        for(int i=0;i<literki.length;i++){
            literki[i]=liczba[i];}

        long start=System.nanoTime();
        sortowanieBabelkowe(literki);
        long stop=System.nanoTime();

        wynik=(stop-start);
        System.out.println("Czas sortowania Babelkowego tablicy char "+wynik);
        for(int i=0;i<literki.length;i++){
            System.out.print((char)literki[i]+" ");
        }
        System.out.println();
    }




    public BubbleSort(float liczba[]){
    liczbyFloat=new double[liczba.length];
        for(int i=0;i<liczbyFloat.length;i++){
            liczbyFloat[i]=liczba[i];}

        long start=System.nanoTime();
        sortowanieBabelkoweDouble(liczbyFloat);
        long stop=System.nanoTime();

        wynik=(stop-start);
        System.out.println("Czas sortowania Babelkowego tablicy float "+wynik);
        for(int i=0;i<liczbyFloat.length;i++){
            System.out.print((float)liczbyFloat[i]+" ");
        }
        System.out.println();
    }


    public static void sortowanieBabelkowe(int liczba[]) {


        for (int i = 0; i < liczba.length; i++) {
            for (int j = 0; j < liczba.length - 1; j++) {
                int temp = 0;
                if (liczba[j] > liczba[j + 1]) {
                    temp = liczba[j];
                    liczba[j] = liczba[j + 1];
                    liczba[j + 1] = temp;
                }
            }
        }
    }

    public static void sortowanieBabelkoweDouble(double liczba[]){


        for(int i=0;i<liczba.length;i++){
            for(int j=0;j<liczba.length-1;j++){
                double temp=0;
                if(liczba[j]>liczba[j+1]){
                    temp=liczba[j];
                    liczba[j]=liczba[j+1];
                    liczba[j+1]=temp;


                }
            }
        }

}

}
