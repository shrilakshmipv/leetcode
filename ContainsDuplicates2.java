import java.util.HashSet;

class ContainsDuplicates2{
    public boolean containsDuplicates(int[] nums){
        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i = 0;i < nums.length; i++){
            if(unique.contains(nums[i]))
                return true;

            unique.add(nums[i]);

        }
        return false; 
    }

    public static void main(String[] args){
        ContainsDuplicates2 result = new ContainsDuplicates2();
        int[] nums_list = new int[]{1,2,3,4,5,6};
        boolean res = result.containsDuplicates(nums_list);
        System.out.println(res);
    }
} 
