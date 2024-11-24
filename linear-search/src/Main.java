public class Main {

    public static int linear_search(int[] arr, int target){
        // burada i ' başlangıç değeri belirleniyor ve dizinin eleman sayısından küçük olana kadar çalışacak şekilde ayarlanıyor
        for (int i = 0; i < arr.length; i++){
            // dizinin index numarasına göre i değiri tek tek arttırılarak arama yapılıyor
            if (arr[i] == target){
                return i;
            }
        }
     // arana değer yoksa index numarası-1 dönüyor zaten böyle bir değer olmadığı için bulunamadı dönüyor
    return -1;
    }


    public static void main(String[] args) {

        int[] arr = {-2,-1,1,2,3,4,5,6,11,22,33,44,55};
        int target = 5;
        int result = linear_search(arr,target);
        if (result !=-1){
            System.out.println(target + " hedefiniz " + result +" bulundu ");
        }else {
            System.out.println(target + " bulunamadı ");
        }



    }
}