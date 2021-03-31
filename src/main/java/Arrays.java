public class Arrays {
    static int NUMBER = 4;
    static int NUMBER2 = 1;

    public int[] arrHomeWork(int[] arr) {
        int numberPos = 0;
        int[] arrNew;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == NUMBER) {
                numberPos = i + 1;
                arrNew = new int[arr.length - i - 1];
                for (int j = 0; j < arr.length - i - 1; j++) {
                    arrNew[j] = arr[numberPos];
                    numberPos++;
                }
                return arrNew;
            }
        }
        if (numberPos == 0) {
            throw new RuntimeException("В массиве нет цифры: " + NUMBER);
        }
        return new int[0];
    }

    public boolean arrHomeWorkTwo(int[] arr){
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == NUMBER){
                count++;
            }
            if (arr[i] == NUMBER2){
                count2++;
            }
        }
        if (count + count2 == arr.length & count > 0 & count2 > 0){
            return true;
        }else{
            return false;
        }
    }
}
