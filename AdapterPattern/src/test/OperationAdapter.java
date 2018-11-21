package test;

public class OperationAdapter implements DataOperation {

    private Serach serach;
    private Sort sort;

    public OperationAdapter(Serach serach, Sort sort) {
        this.serach = serach;
        this.sort = sort;
    }

    @Override
    public int[] sort(int[] nums) {
        return sort.sort(nums);
    }

    @Override
    public int search(int[] nums, int key) {
        int a[]=this.sort(nums);
        return serach.search(a,key);
    }
}
