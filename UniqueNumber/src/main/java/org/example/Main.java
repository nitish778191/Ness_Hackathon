package org.example;

public class Main {
    public static void main(String[] args) {
        UniqueNumbersCounter unc=new UniqueNumbersCounter();
        int[] nums1={4,5,2,1,2};
        int k1=3;
        String ans=unc.findUniqueNumbersCount(nums1,k1);
        System.out.println(ans);
        int[] nums2={6,10,4,5,2,1,2};
        int k2=7;
        System.out.println(unc.findUniqueNumbersCount(nums2,k2));
        int[] num3={6,10,4,5,2,1,2};
        int k3=10;
        System.out.println(unc.findUniqueNumbersCount(num3,k3));
        int[] nums4={7,10,2,1,2};
        int k4=-4;
        System.out.println(unc.findUniqueNumbersCount(nums4,k4));
    }
}