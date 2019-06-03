/**
 * Demo1
 *  对于长度为5位的一个01串，每一位都可能是0或者1，
 *  一共有32种可能，请按从小到大的顺序输出这32种01串
 * @author Mr Li
 * @date 2019/1/11
 */
public class Demo1 {
    public static void main(String[] args) {
        notUseJDKFunction();
    }
    private static void useJDKFunction(){
        for (int i = 0; i < 32; i++) {
            String result=Integer.toBinaryString(i);
            int num=result.length();
            for (int j=0;j<5-num;j++){
                result="0"+result;
            }
            System.out.println(result);
        }
    }
    private static void useJDKFunction1(){
        for (int i = 0; i < 32; i++) {
            String num = Integer.toBinaryString(i);
            switch (num.length()) {
                case 1:
                    num = "0000" + num;
                    break;
                case 2:
                    num = "000" + num;
                    break;
                case 3:
                    num = "00" + num;
                    break;
                case 4:
                    num = "0" + num;
                    break;
                    default:
                        break;
            }
            System.out.println(num);
        }
    }
    private static void notUseJDKFunction(){
        for (int i=0;i<32;i++){
            int a[]=new int[5];
            int temp=i;
            int index=4;
            while (temp>=1){
                a[index--]=temp%2;
                temp=temp/2;
            }
            for(int idx=0;idx<5;++idx){
                System.out.print(a[idx]);
            }
            System.out.println();
        }
    }


}
