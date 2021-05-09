package example;

public class WithoutNo {
    public static void main(String[] args) {
        int one = 'A'/'A';
//        String st = "..........";
//        for(int i = one; i<=(st.length()*st.length()); i++){
//            System.out.print(i+" ");
//        }
        for (int i = one; i<='d'; i+=1){ // ASCII of d = 100
            System.out.print(i+" ");
        }
    }
}
