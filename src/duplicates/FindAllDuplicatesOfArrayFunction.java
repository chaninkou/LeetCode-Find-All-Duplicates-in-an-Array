package duplicates;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesOfArrayFunction {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            // flip the number at position i -1 to negative
            int index = Math.abs(nums[i]) - 1;
            
            // if number at position i - 1 is already negative, then i is the number that appears twice
            if(nums[index] < 0){
                res.add(Math.abs(index + 1));
            }
            
            nums[index] = -nums[index];
        }
        
        return res;
    }
}
