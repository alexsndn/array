public class Main {
    public static void main(String[] args) {
        //task 1.1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //task 1.2
        double[] doubleArray = {1.57, 7.654, 9.986};
        //task 1.3
        int[] randomArray = new int[2];
        randomArray[0] = 2;
        randomArray[1] = 5;
        //task 2
        System.out.println(array[0]+","+array[1]+","+array[2]);
        System.out.println(doubleArray[0]+","+doubleArray[1]+","+doubleArray[2]);
        System.out.println(randomArray[0]+","+randomArray[1]);
        //task 3
        System.out.println("task 3");
        System.out.println(array[2]+","+array[1]+","+array[0]);
        System.out.println(doubleArray[2]+","+doubleArray[1]+","+doubleArray[0]);
        System.out.println(randomArray[1]+","+randomArray[0]);
        //task 4
        System.out.println("task 4");
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 ==0){
                System.out.println(array[i]);
            }else{
                array[i] = array[i]+1;
                System.out.println(array[i]);
            }
        }
    }
}