public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        System.out.println(arr[0]); //Now accessing within the bounds
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}