public class Main {

    public static void main(String[] args) {
	  double[] myList = {1.2,0.3,4.2,7.8,9.9};
	  double total = 0;
	  double max = myList[0];
	  for(double number : myList){ // number ile myListteki elemanlar gezilir
	     if(max<number) max = number;//o anki sayı ile max ı kıyaslar ve büyük olanı yeni max yapar
	      total += number;//tüm elemanları toplayarak toplamı elde eder.
	      System.out.println(number);

      }
	  System.out.println("toplam=" + total);
	  System.out.println("en büyük sayı=" + max);
    }
}
