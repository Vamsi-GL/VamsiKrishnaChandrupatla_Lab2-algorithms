package com.greatlearning.currency;

public class MergeSort {

    static void merge(int[] arr,int left, int mid,int right){
        //Find sizes of 2 sub arrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //Copy data to temporary arrays
        for(int i=0;i<n1;++i){
            leftArray[i] = arr[left+i];
        }
        for(int j=0;j<n2;++j){
            rightArray[j] = arr[mid+1+j];
        }

        //Merge the temporary arrays

        //initial index of first and second sub-arrays
        int i=0,j=0;

        //initial index of merged sub array
        int k=left;
        while (i < n1 && j < n2) {
            if(leftArray[i] > rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //Copying remaining elements of L[] (if any)
        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        //Copying remaining elements of R[] (if any)
        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    //Main function that sorts array[left...right] using merge()
    public static void sort(int[] arr,int left,int right){
        if(left < right){
            int mid = (left + right)/2;//Find middle point

            //Sort first and second halves
            sort(arr,left,mid);
            sort(arr,mid+1,right);

            //Merge the sorted halves
            merge(arr,left,mid,right);
        }
    }
}
