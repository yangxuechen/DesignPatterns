package test;

public class MainTest {
    public static void main(String[] args) {
        OperationAdapter operationAdapter;
        Serach serach=new Serach();
        Sort sort=new Sort();

        operationAdapter=new OperationAdapter(serach,sort);

        int nums[]={1,5,6,9,8,2,3,6};
        int key=5;

        int a[]=operationAdapter.sort(nums);

        System.out.println("排序后的数组：");
        for(int i:a){
            System.out.print(i+" ");
        }

        int n=operationAdapter.search(nums,key);

        if(n==1){
            System.out.println("找到");
        }else{
            System.out.println("没找到");
        }
    }
}
