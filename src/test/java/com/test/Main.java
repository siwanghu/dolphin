package com.test;
import com.siwanghu.*;

import java.util.*;

public class Main {
    public static void main(String args[]){
        //ReverseInteger
        System.out.println("------------------ReverseInteger--------------------");
        try {
            System.out.println(new ReverseInteger().reverseInteger(0));
            System.out.println(new ReverseInteger().reverseInteger(123));
            System.out.println(new ReverseInteger().reverseInteger(-123));
            System.out.println(new ReverseInteger().reverseInteger(1000000003));
            System.out.println(new ReverseInteger().reverseInteger(-1000000003));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PalindromeNumber
        System.out.println("------------------PalindromeNumber--------------------");
        try {
            System.out.println(new PalindromeNumber().palindromeNumber(0));
            System.out.println(new PalindromeNumber().palindromeNumber(9));
            System.out.println(new PalindromeNumber().palindromeNumber(-1));
            System.out.println(new PalindromeNumber().palindromeNumber(10));
            System.out.println(new PalindromeNumber().palindromeNumber(121));
            System.out.println(new PalindromeNumber().palindromeNumber(12321));
            System.out.println(new PalindromeNumber().palindromeNumber(12341));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //InsertInterval
        System.out.println("------------------InsertInterval--------------------");
        try {
            ArrayList<Interval> list=new ArrayList<Interval>();
            list.add(new Interval(1,2));
            list.add(new Interval(3,5));
            list.add(new Interval(6,7));
            list.add(new Interval(8,10));
            list.add(new Interval(12,16));
            System.out.println(new InsertInterval().insertInterval(list,new Interval(4,9)));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            ArrayList<Interval> list1=new ArrayList<Interval>();
            list1.add(new Interval(1,3));
            list1.add(new Interval(6,9));
            System.out.println(new InsertInterval().insertInterval(list1,new Interval(2,5)));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //InsertInterval
        System.out.println("------------------MergeIntervals--------------------");
        try {
            ArrayList<Interval> list=new ArrayList<Interval>();
            list.add(new Interval(1,3));
            list.add(new Interval(2,6));
            list.add(new Interval(8,10));
            list.add(new Interval(15,18));
            System.out.println(new MergeIntervals().mergeIntervals(list));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //MinimumWindowSubstring
        System.out.println("------------------minimumWindowSubstring--------------------");
        try {
            System.out.println(new MinimumWindowSubstring().minimumWindowSubstring("ADOBECODEBANC","ABC"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //MultiplyStrings
        System.out.println("------------------multiplyStrings--------------------");
        try {
            System.out.println(new MultiplyStrings().multiplyStrings("340282366920938463463374607431768211456","340282366920938463463374607431768211456"));
            System.out.println(new MultiplyStrings().multiplyStrings("123","345"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //FindSubString
        System.out.println("------------------findSubString--------------------");
        try {
            ArrayList<String> list=new ArrayList<String>();
            list.add("bar");
            list.add("foo");
            ArrayList<String> list1=new ArrayList<String>();
            list1.add("a");
            list1.add("b");
            list1.add("c");
            //System.out.println(new FindSubString().findSubString("barfoothefoobarman",list));
            System.out.println(new FindSubString().findSubString("abbcabac",list1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PascalTriangle
        System.out.println("------------------pascalTriangle--------------------");
        try {
            System.out.println(new PascalTriangle().pascalTriangle(1));
            System.out.println(new PascalTriangle().pascalTriangle(2));
            System.out.println(new PascalTriangle().pascalTriangle(4));
            System.out.println(new PascalTriangle().pascalTriangle(5));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PascalTriangle2
        System.out.println("------------------pascalTriangle2--------------------");
        try {
            System.out.println(new PascalTriangle2().pascalTriangle2(3));
            System.out.println(new PascalTriangle2().pascalTriangle2(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RemoveDuplicates
        System.out.println("------------------RemoveDuplicates--------------------");
        try {
            System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{1}));
            System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{1,1,2}));
            System.out.println(new RemoveDuplicates().removeDuplicates(new int[]{1,1,2,3,3,4,4,5,6,7,7,8,9}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RemoveDuplicates2
        System.out.println("------------------RemoveDuplicates2--------------------");
        try {
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,2}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,1,2}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,1,2,3,4}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,1,2,2}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,1,2,2,3}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,1,2,2,2,3,4}));
            System.out.println(new RemoveDuplicates2().removeDuplicates2(new int[]{1,1,1,1,1,2,2,2,2,3,4,4}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LongestConsecutiveSequence
        System.out.println("------------------LongestConsecutiveSequence--------------------");
        try {
            System.out.println(new LongestConsecutiveSequence().longestConsecutiveSequence(new int[]{1}));
            System.out.println(new LongestConsecutiveSequence().longestConsecutiveSequence(new int[]{1,2}));
            System.out.println(new LongestConsecutiveSequence().longestConsecutiveSequence(new int[]{100,4,200,1,3,2}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //TwoSum
        System.out.println("------------------TwoSum--------------------");
        try {
            System.out.println(new TwoSum().twoSum(new int[]{2, 7, 11, 15,1,8,9},9));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ThreeSum
        System.out.println("------------------ThreeSum--------------------");
        try {
            System.out.println(new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4},0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ThreeSumClosest
        System.out.println("------------------ThreeSumClosest--------------------");
        try {
            System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-1,2,1,-4,7},1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //FourSum
        System.out.println("------------------FourSum--------------------");
        try {
            System.out.println(new FourSum().fourSum(new int[]{1,0,-1,0,-2,2},0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RemoveElement
        System.out.println("------------------RemoveElement--------------------");
        try {
            System.out.println(new RemoveElement().removeElement(new int[]{1,2,3,3,4,5,3},3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //MoveZeroes
        System.out.println("------------------MoveZeroes--------------------");
        try {
            System.out.println(new MoveZeroes().moveZeroes(new int[]{0,1,0,3,12}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //NextPermutation
        System.out.println("------------------NextPermutation--------------------");
        try {
            System.out.println(Arrays.toString(new NextPermutation().nextPermutation(new int[]{1,2,3})));
            System.out.println(Arrays.toString(new NextPermutation().nextPermutation(new int[]{3,2,1})));
            System.out.println(Arrays.toString(new NextPermutation().nextPermutation(new int[]{1,1,5})));
            System.out.println(Arrays.toString(new NextPermutation().nextPermutation(new int[]{2,1,5,4,3})));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PermutationSequence
        System.out.println("------------------PermutationSequence--------------------");
        try {
            System.out.println(Arrays.toString(new PermutationSequence().permutationSequence(3,1)));
            System.out.println(Arrays.toString(new PermutationSequence().permutationSequence(3,2)));
            System.out.println(Arrays.toString(new PermutationSequence().permutationSequence(3,5)));
            System.out.println(Arrays.toString(new PermutationSequence().permutationSequence(3,7)));
            System.out.println(new PermutationSequence().permutationSequenceV2(4,8));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ValidSudoku
        System.out.println("------------------ValidSudoku--------------------");
        try {
            char[][] board = {
                    {'.','.','4','.','.','.','6','3','.'},
                    {'.','.','.','.','.','.','.','.','.'},
                    {'5','.','.','.','.','.','.','9','.'},
                    {'.','.','.','5','6','.','.','.','.'},
                    {'4','.','3','.','.','.','.','.','.'},
                    {'.','.','.','7','.','.','.','.','.'},
                    {'.','.','.','1','.','.','.','.','.'},
                    {'.','.','.','.','.','.','.','.','.'},
                    {'.','.','.','.','.','.','.','.','.'}
            };
            System.out.println(new ValidSudoku().validSudoku(board));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //TrappingRainWater
        System.out.println("------------------TrappingRainWater--------------------");
        try {
            System.out.println(new TrappingRainWater().trappingRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
            System.out.println(new TrappingRainWater().trappingRainWater(new int[]{1,1}));
            System.out.println(new TrappingRainWater().trappingRainWater(new int[]{2,0,3}));
            System.out.println(new TrappingRainWater().trappingRainWater(new int[]{2,0,3,2,4}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RotateImage
        System.out.println("------------------RotateImage--------------------");
        try {
            System.out.println(Arrays.toString(new RotateImage().rotateImage(new int[][]{{1,2},{3,4}})));
            System.out.println(Arrays.toString(new RotateImage().rotateImage(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}})));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PlusOne
        System.out.println("------------------PlusOne--------------------");
        try {
            System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9,9,9},5)));
            System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9,1,2},9)));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ClimbingStairs
        System.out.println("------------------ClimbingStairs--------------------");
        try {
            System.out.println(new ClimbingStairs().climbingStairs(1));
            System.out.println(new ClimbingStairs().climbingStairs(2));
            System.out.println(new ClimbingStairs().climbingStairs(6));
            System.out.println(new ClimbingStairs().climbingStairs(10));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //SetMatrixZeroes
        System.out.println("------------------SetMatrixZeroes--------------------");
        try {
            System.out.println(Arrays.toString(new SetMatrixZeroes().setMatrixZeroes(new int[][]{{1,2},{0,4}})));
            System.out.println(Arrays.toString(new SetMatrixZeroes().setMatrixZeroes(new int[][]{{1,2,3,0},{5,0,7,8},{9,10,0,12},{0,14,15,16}})));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //GasStation
        System.out.println("------------------GasStation--------------------");
        try {
            System.out.println(new GasStation().gasStation(new int[]{1,2,3,4,1},new int[]{1,2,3,4,1}));
            System.out.println(new GasStation().gasStation(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
            System.out.println(new GasStation().gasStation(new int[]{2,3,4},new int[]{3,4,3}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Candy
        System.out.println("------------------Candy--------------------");
        try {
            System.out.println(Arrays.toString(new Candy().candy(new int[]{1,2,3,4})));
            System.out.println(Arrays.toString(new Candy().candy(new int[]{4,3,2,1})));
            System.out.println(Arrays.toString(new Candy().candy(new int[]{2,1,3,2})));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //MajorityElement
        System.out.println("------------------MajorityElement--------------------");
        try {
            System.out.println(new MajorityElement().majorityElement(new int[]{1,3,2,1,1,4}));
            System.out.println(new MajorityElement().majorityElement(new int[]{1,2,3,1,4,6}));
            System.out.println(new MajorityElement().majorityElement(new int[]{1,2,3,1,1,6}));
            System.out.println(new MajorityElement().majorityElement(new int[]{1,2}));
            System.out.println(new MajorityElement().majorityElement(new int[]{2}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RotateArray
        System.out.println("------------------RotateArray--------------------");
        try {
            System.out.println(Arrays.toString(new RotateArray().rotateArray(7,3)));
            System.out.println(Arrays.toString(new RotateArray().rotateArray(7,7)));
            System.out.println(Arrays.toString(new RotateArray().rotateArray(7,2)));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ContainsDuplicate
        System.out.println("------------------ContainsDuplicate--------------------");
        try {
            System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,3,2,4}));
            System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1}));
            System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ContainsDuplicateV2
        System.out.println("------------------ContainsDuplicateV2--------------------");
        try {
            System.out.println(new ContainsDuplicateV2().containsDuplicateV2(new int[]{1,3,1,4},2));
            System.out.println(new ContainsDuplicateV2().containsDuplicateV2(new int[]{1},1));
            System.out.println(new ContainsDuplicateV2().containsDuplicateV2(new int[]{1,2,3,1,6,1},2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
