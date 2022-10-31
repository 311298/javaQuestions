package dsa.section6_crackingBigOInterviewQuestions;

/*
    create a function which calculate sum and product of an array
    find the time complexity of created method
*/

class Main1 {
    public static void main(String[] args) {
        Main1 method = new Main1();
        int[] sampleArray = new int[] { 1, 2, 4 };
        method.arrayMethod(sampleArray);
    }

    public void arrayMethod(int[] sampleArray) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < sampleArray.length; i++) {
            sum += sampleArray[i];
        }
        for (int i = 0; i < sampleArray.length; i++) {
            product *= sampleArray[i];
        }
        System.out.println(sum + ", " + product);
    }

}