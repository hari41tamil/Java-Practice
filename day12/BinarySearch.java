package day12;
class binary{
    void search(int[] arr,int key){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == key){
                System.out.println("Element is present at Index:"+mid);
                break;
            }
            else if(arr[mid] >key){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 30;
        binary b = new binary();
        b.search(arr, key);
    }
}
