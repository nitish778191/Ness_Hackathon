package org.example;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class UniqueNumbersCounter {
    public String findUniqueNumbersCount(int []nums,int k){
        if(nums==null || nums.length==0){
            return "Give proper input not empty array";

        }
        if(k<=0){
            return "Give proper input, sub array length can not be negative or zero";
        }
        if(k> nums.length){
            return "Give proper input, sub array length exceeds array length";
        }
        int maxCount=0;
        int count=0;
        Deque<Integer> dq=new LinkedList<>();
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            dq.addLast(nums[i]);
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            count++;
            if(count==k){
                maxCount=Math.max(maxCount,mp.size());
                int ele=dq.removeFirst();
                int fq=mp.get(ele);
                if(fq==1)
                    mp.remove(ele);
                else
                    mp.put(ele,fq-1);

                count--;


            }

        }

        return "Count of Unique Numbers is "+maxCount;
    }
}
