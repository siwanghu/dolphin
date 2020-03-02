package com.test;
import com.siwanghu.array.*;
import com.siwanghu.linkedlist.*;
import com.siwanghu.simulation.*;
import com.siwanghu.string.*;

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

        //ContainsDuplicateV3
        System.out.println("------------------ContainsDuplicateV3--------------------");
        try {
            System.out.println(new ContainsDuplicateV3().containsDuplicateV3upT(new int[]{1,3,1,4},2,3));
            System.out.println(new ContainsDuplicateV3().containsDuplicateV3upT(new int[]{1},1,1));
            System.out.println(new ContainsDuplicateV3().containsDuplicateV3upT(new int[]{1,2,3,1,6,1},7,5));
            System.out.println(new ContainsDuplicateV3().containsDuplicateV3downT(new int[]{1,3,1,4},2,3));
            System.out.println(new ContainsDuplicateV3().containsDuplicateV3downT(new int[]{1},1,1));
            System.out.println(new ContainsDuplicateV3().containsDuplicateV3downT(new int[]{1,2,3,1,6,1},0,1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ProductofArrayExceptSelf
        System.out.println("------------------ProductofArrayExceptSelf--------------------");
        try {
            System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productofArrayExceptSelf(new int[]{1,2,3,4})));
            System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productofArrayExceptSelf(new int[]{3})));
            System.out.println(Arrays.toString(new ProductofArrayExceptSelf().productofArrayExceptSelf(new int[]{1,2,8})));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //IncreasingTripletSubsequence
        System.out.println("------------------IncreasingTripletSubsequence--------------------");
        try {
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequence(new int[]{2,1,4,3,1,2,3}));
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequence(new int[]{1,2}));
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequence(new int[]{1,2,3}));
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequence(new int[]{4,3,2,1}));
            System.out.println("------------------IncreasingTripletSubsequenceV2--------------------");
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequenceV2(new int[]{2,1,4,3,1,2,3}));
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequenceV2(new int[]{1,2}));
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequenceV2(new int[]{1,2,3}));
            System.out.println(new IncreasingTripletSubsequence().increasingTripletSubsequenceV2(new int[]{4,3,2,1}));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //GameofLife
        System.out.println("------------------GameofLife--------------------");
        try {
            int[][] board = {
                    {1,0,1,0},
                    {1,1,0,0},
                    {0,0,0,0},
                    {1,1,1,1}
            };
            System.out.println(new GameofLife().gameofLife(board));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ReverseLinkedList
        System.out.println("------------------ReverseLinkedList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node4=new Node(3,null);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new ReverseLinkedList().reverseLinkedList(head));
            System.out.println(new ReverseLinkedList().reverseLinkedList(head1));
            System.out.println(new ReverseLinkedList().reverseLinkedList(head2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //OddEvenLinkedList
        System.out.println("------------------OddEvenLinkedList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node6=new Node(5,null);
            Node node5=new Node(4,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new OddEvenLinkedList().oddEvenLinkedList(head));
            System.out.println(new OddEvenLinkedList().oddEvenLinkedList(head1));
            System.out.println(new OddEvenLinkedList().oddEvenLinkedList(head2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //AddTwoNumbers
        System.out.println("------------------AddTwoNumbers--------------------");
        try {
            Node head=new Node(1,null);
            Node node2=new Node(3,null);
            Node node1=new Node(4,node2);
            Node head1=new Node(2,node1);
            Node node4=new Node(4,null);
            Node node3=new Node(6,node4);
            Node head2=new Node(5,node3);
            Node node6=new Node(9,null);
            Node node5=new Node(9,node6);
            Node head3=new Node(9,node5);
            Node node8=new Node(9,null);
            Node node7=new Node(9,node8);
            Node head4=new Node(9,node7);
            System.out.println(new AddTwoNumbers().addTwoNumbers(head,null));
            System.out.println(new AddTwoNumbers().addTwoNumbers(null,head));
            System.out.println(new AddTwoNumbers().addTwoNumbers(head1,head2));
            System.out.println(new AddTwoNumbers().addTwoNumbers(head3,head4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ReverseLinkedListV2
        System.out.println("------------------ReverseLinkedListV2--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node6=new Node(5,null);
            Node node5=new Node(4,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new ReverseLinkedListV2().reverseLinkedListV2(head,1,2));
            System.out.println(new ReverseLinkedListV2().reverseLinkedListV2(head1,1,2));
            System.out.println(new ReverseLinkedListV2().reverseLinkedListV2(head2,1,5));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PartitionList
        System.out.println("------------------PartitionList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node7=new Node(2,null);
            Node node6=new Node(5,node7);
            Node node5=new Node(2,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(4,node4);
            Node head2=new Node(1,node3);
            System.out.println(new PartitionList().partitionList(head,1));
            System.out.println(new PartitionList().partitionList(head1,1));
            System.out.println(new PartitionList().partitionList(head2,4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RemoveDuplicatesfromSortedList
        System.out.println("------------------RemoveDuplicatesfromSortedList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(2,node1);
            Node node6=new Node(3,null);
            Node node5=new Node(3,node6);
            Node node4=new Node(2,node5);
            Node node3=new Node(1,node4);
            Node head2=new Node(1,node3);
            Node node8=new Node(2,null);
            Node node7=new Node(1,node8);
            Node head3=new Node(1,node7);
            System.out.println(new RemoveDuplicatesfromSortedList().removeDuplicatesfromSortedList(head));
            System.out.println(new RemoveDuplicatesfromSortedList().removeDuplicatesfromSortedList(head1));
            System.out.println(new RemoveDuplicatesfromSortedList().removeDuplicatesfromSortedList(head2));
            System.out.println(new RemoveDuplicatesfromSortedList().removeDuplicatesfromSortedList(head3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RemoveDuplicatesfromSortedListV2
        System.out.println("------------------RemoveDuplicatesfromSortedListV2--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(2,node1);
            Node node15=new Node(5,null);
            Node node14=new Node(3,node15);
            Node node13=new Node(3,node14);
            Node head12=new Node(2,node13);
            Node node11=new Node(1,head12);
            Node node10=new Node(1,node11);
            Node head2=new Node(1,node10);
            Node node5=new Node(5,null);
            Node node4=new Node(4,node5);
            Node node3=new Node(4,node4);
            Node head9=new Node(3,node3);
            Node node8=new Node(3,head9);
            Node node7=new Node(2,node8);
            Node head3=new Node(1,node7);
            System.out.println(new RemoveDuplicatesfromSortedListV2().removeDuplicatesfromSortedListV2(head));
            System.out.println(new RemoveDuplicatesfromSortedListV2().removeDuplicatesfromSortedListV2(head1));
            System.out.println(new RemoveDuplicatesfromSortedListV2().removeDuplicatesfromSortedListV2(head2));
            System.out.println(new RemoveDuplicatesfromSortedListV2().removeDuplicatesfromSortedListV2(head3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RotateList
        System.out.println("------------------RotateList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node6=new Node(5,null);
            Node node5=new Node(4,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new RotateList().rotateList(head,1));
            System.out.println(new RotateList().rotateList(head1,1));
            System.out.println(new RotateList().rotateList(head2,2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //RemoveNthNodeFromEndofList
        System.out.println("------------------RotateList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node6=new Node(5,null);
            Node node5=new Node(4,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new RemoveNthNodeFromEndofList().removeNthNodeFromEndofList(head,1));
            System.out.println(new RemoveNthNodeFromEndofList().removeNthNodeFromEndofList(head1,2));
            System.out.println(new RemoveNthNodeFromEndofList().removeNthNodeFromEndofList(head2,3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //SwapNodesinPairs
        System.out.println("------------------SwapNodesinPairs--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node6=new Node(5,null);
            Node node5=new Node(4,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new SwapNodesinPairs().swapNodesinPairs(head));
            System.out.println(new SwapNodesinPairs().swapNodesinPairs(head1));
            System.out.println(new SwapNodesinPairs().swapNodesinPairs(head2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ReverseNodesInkGroup
        System.out.println("------------------ReverseNodesInkGroup--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node6=new Node(5,null);
            Node node5=new Node(4,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            System.out.println(new ReverseNodesInkGroup().reverseNodesInkGroup(head,1));
            System.out.println(new ReverseNodesInkGroup().reverseNodesInkGroup(head1,2));
            System.out.println(new ReverseNodesInkGroup().reverseNodesInkGroup(head2,2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------CopyListwithRandomPointer--------------------");
        try{
            RandomNode head1=new RandomNode(1,null,null);
            RandomNode node3=new RandomNode(4,null,null);
            RandomNode node2=new RandomNode(3,node3,null);
            RandomNode node1=new RandomNode(2,node2,null);
            RandomNode head2=new RandomNode(1,node1,null);
            head2.random=node3;
            node1.random=node2;
            node2.random=head2;
            node3.random=node1;
            System.out.println(new CopyListwithRandomPointer().copyListwithRandomPointer(head1));
            System.out.println(new CopyListwithRandomPointer().copyListwithRandomPointer(head2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LinkedListCycle
        System.out.println("------------------LinkedListCycle--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node4=new Node(3,null);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            Node node7=new Node(4,null);
            Node node6=new Node(3,node7);
            Node node5=new Node(2,node6);
            Node head3=new Node(1,node5);
            node7.next=node5;
            Node head4=new Node(1,null);
            head4.next=head4;
            System.out.println(new LinkedListCycle().linkedListCycle(head));
            System.out.println(new LinkedListCycle().linkedListCycle(head1));
            System.out.println(new LinkedListCycle().linkedListCycle(head2));
            System.out.println(new LinkedListCycle().linkedListCycle(head3));
            System.out.println(new LinkedListCycle().linkedListCycle(head4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LinkedListCycleV2
        System.out.println("------------------LinkedListCycleV2--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node4=new Node(3,null);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            node4.next=node3;
            Node node7=new Node(4,null);
            Node node6=new Node(3,node7);
            Node node5=new Node(2,node6);
            Node head3=new Node(1,node5);
            node7.next=node5;
            Node head4=new Node(1,null);
            head4.next=head4;
            System.out.println(new LinkedListCycleV2().linkedListCycleV2(head));
            System.out.println(new LinkedListCycleV2().linkedListCycleV2(head1));
            System.out.println(new LinkedListCycleV2().linkedListCycleV2(head2));
            System.out.println(new LinkedListCycleV2().linkedListCycleV2(head3));
            System.out.println(new LinkedListCycleV2().linkedListCycleV2(head4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LinkedListCycleV2
        System.out.println("------------------LinkedListCycleV2--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(1,node1);
            Node node4=new Node(3,null);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            Node node7=new Node(4,null);
            Node node6=new Node(3,node7);
            Node node5=new Node(2,node6);
            Node head3=new Node(1,node5);
            System.out.println(new ReorderList().reorderList(head));
            System.out.println(new ReorderList().reorderList(head1));
            System.out.println(new ReorderList().reorderList(head2));
            System.out.println(new ReorderList().reorderList(head3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LRUCache
        System.out.println("------------------LRUCache--------------------");
        try{
            LRUCache lruCache=new LRUCache();
            for(int i=0;i<5;i++){
                lruCache.set(i,i);
                System.out.println(lruCache);
            }
            lruCache.get(0);
            System.out.println(lruCache);
            lruCache.set(1,100);
            System.out.println(lruCache);
            lruCache.set(5,5);
            System.out.println(lruCache);
            lruCache.set(6,6);
            System.out.println(lruCache);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //PalindromeLinkedList
        System.out.println("------------------PalindromeLinkedList--------------------");
        try {
            Node head=new Node(1,null);
            Node node1=new Node(2,null);
            Node head1=new Node(2,node1);
            Node node6=new Node(1,null);
            Node node5=new Node(2,node6);
            Node node4=new Node(3,node5);
            Node node3=new Node(2,node4);
            Node head2=new Node(1,node3);
            Node node9=new Node(1,null);
            Node node8=new Node(2,node9);
            Node node7=new Node(2,node8);
            Node head3=new Node(1,node7);
            System.out.println(new PalindromeLinkedList().palindromeLinkedList(head));
            System.out.println(new PalindromeLinkedList().palindromeLinkedList(head1));
            System.out.println(new PalindromeLinkedList().palindromeLinkedList(head2));
            System.out.println(new PalindromeLinkedList().palindromeLinkedList(head3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ValidPalindrome
        System.out.println("------------------ValidPalindrome--------------------");
        try{
            String str="A man, a plan, a canal: Panama";
            String str1="race a car";
            String str2="race ,ecar";
            String str3=",@12q,+q21-";
            String str4="+--,.";
            String str5="a";
            System.out.println(new ValidPalindrome().validPalindrome(str));
            System.out.println(new ValidPalindrome().validPalindrome(str1));
            System.out.println(new ValidPalindrome().validPalindrome(str2));
            System.out.println(new ValidPalindrome().validPalindrome(str3));
            System.out.println(new ValidPalindrome().validPalindrome(str4));
            System.out.println(new ValidPalindrome().validPalindrome(str5));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //StrStr
        System.out.println("------------------StrStr--------------------");
        try{
            String str="A man, a plan, a canal: Panama";
            String subStr="a plan";
            String str1="race a car";
            String subStr1="brac";
            System.out.println(new StrStr().strStr(str,subStr));
            System.out.println(new StrStr().strStr(str1,subStr1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Atoi
        System.out.println("------------------Atoi--------------------");
        try{
            String str="";
            String str1="-123";
            String str2="+123";
            String str3="123";
            String str4="  -00123";
            System.out.println(new Atoi().atoi(str));
            System.out.println(new Atoi().atoi(str1));
            System.out.println(new Atoi().atoi(str2));
            System.out.println(new Atoi().atoi(str3));
            System.out.println(new Atoi().atoi(str4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            String str5="  001a23";
            System.out.println(new Atoi().atoi(str5));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            String str6="1234567898765432";
            System.out.println(new Atoi().atoi(str6));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //AddBinary
        System.out.println("------------------AddBinary--------------------");
        try{
            String str="11";
            String subStr="1";
            String str1="11";
            String subStr1="011";
            String str2="11111111";
            String subStr2="11111111";
            System.out.println(new AddBinary().addBinary(str,subStr));
            System.out.println(new AddBinary().addBinary(str1,subStr1));
            System.out.println(new AddBinary().addBinary(str2,subStr2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LongestPalindromicSubstring
        System.out.println("------------------LongestPalindromicSubstring--------------------");
        try{
            String str="a";
            String str1="aab";
            String str2="baa";
            String str3="dxaabaaf";
            System.out.println(new LongestPalindromicSubstring().longestPalindromicSubstring(str));
            System.out.println(new LongestPalindromicSubstring().longestPalindromicSubstring(str1));
            System.out.println(new LongestPalindromicSubstring().longestPalindromicSubstring(str2));
            System.out.println(new LongestPalindromicSubstring().longestPalindromicSubstring(str3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //LongestCommonPrefix
        System.out.println("------------------LongestCommonPrefix--------------------");
        try{
            String[] str={"a"};
            String[] str1={"aab","aba"};
            String[] str2={"baa","baa"};
            String[] str3={"dxaabaaf","dxaa","dx"};
            System.out.println(new LongestCommonPrefix().longestCommonPrefix(str));
            System.out.println(new LongestCommonPrefix().longestCommonPrefix(str1));
            System.out.println(new LongestCommonPrefix().longestCommonPrefix(str2));
            System.out.println(new LongestCommonPrefix().longestCommonPrefix(str3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //ValidNumber
        System.out.println("------------------ValidNumber--------------------");
        try{
            String str="+0";
            String str1=" 0.1";
            String str2="abc";
            String str3="1 a";
            String str4="2e10";
            String str5="2.e10";
            String str6=".1e10";
            String str7="2.1e10.1";
            String str8="2.1e1.";
            String str9="-2.1e10";
            System.out.println(str+" "+new ValidNumber().validNumber(str));
            System.out.println(str1+" "+new ValidNumber().validNumber(str1));
            System.out.println(str2+" "+new ValidNumber().validNumber(str2));
            System.out.println(str3+" "+new ValidNumber().validNumber(str3));
            System.out.println(str4+" "+new ValidNumber().validNumber(str4));
            System.out.println(str5+" "+new ValidNumber().validNumber(str5));
            System.out.println(str6+" "+new ValidNumber().validNumber(str6));
            System.out.println(str7+" "+new ValidNumber().validNumber(str7));
            System.out.println(str8+" "+new ValidNumber().validNumber(str8));
            System.out.println(str9+" "+new ValidNumber().validNumber(str9));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
