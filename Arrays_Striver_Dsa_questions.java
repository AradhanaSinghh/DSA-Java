package com.company;
import java.util.*;

public class Arrays_Striver_Dsa_questions {
    //check if array is sorted
    public static Boolean checkIfSorted(int[] arr){
        if(arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    //remove duplication
    public static int removeDuplicates(int[] arr, int N) {
        LinkedHashSet<Integer> wrap = new LinkedHashSet<>();
        for (int i = 0; i < N; i++) {
            wrap.add(arr[i]);
        }
        int index = 0;
        for (Integer idx : wrap) {
            arr[index] = idx;
            index++;
        }
        return index;
    }
    //meth2
    public static int removeDuplicate(int[] arr, int N) {
        int i = 0;
        for (int j = 1; j < N; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
    //rotation by d elements
    public static void rotateToRight(int[] arr,int n,int k){
        k=k%n;
        if(k>n){
            return;
        }
        int[] temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
    public static void moveZeroToEnd(int[]arr,int n){
        int[] temp=new int[n];
        int k=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        while(k<n){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }
    //union
    public static ArrayList<Integer> union(int[] arr1,int[] arr2,int m,int n){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for(int i=0;i<m;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<n;j++){
            set.add(arr2[j]);
        }
        for(int element: set){
            Union.add(element);
        }
        Collections.sort(Union);
        return Union;
    }
    public static ArrayList<Integer> intersection(int[] arr1,int[] arr2) {

        ArrayList<Integer> intersection = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int element : arr1) {
            set.add(element);
        }

        for (int element : arr2) {
            if (set.contains(element)) {
                intersection.add(element);
                set.remove(element); // Optional: Remove the element from set if duplicates are not allowed
            }
        }

        Collections.sort(intersection);
        return intersection;
    }
    //missing number
    public static int missingNum(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<=arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    public static int missingNumber(int[] nums) {
        int sum_range=0;
        int sum_org=0;
        for(int i=0;i<=nums.length;i++){
            sum_range+=i;
        }
        for(int j=0;j<nums.length;j++){
            sum_org+=nums[j];
            System.out.println("sum_org"+sum_org);
        }
        return sum_range-sum_org;
    }
    public static void main(String[] args) {
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            int length = removeDuplicate(nums, nums.length);
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            int[] arr={1,2,3,4,5,6,7};
            int k=2;
            int n=arr.length;
            rotateToRight(arr,n,k);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");
            int[] arr1={1,2,0,2,0,0,4,5};
            int n1=arr1.length;
            moveZeroToEnd(arr1,n1);
            for (int i = 0; i < n1; i++) {
                System.out.print(arr1[i] + " ");
            }
            int[] arr2={1,2,4,0,5};
        System.out.println();
        System.out.print(missingNumber(arr2));
        }
}
