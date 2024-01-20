import java.util.Arrays;
import java.util.Comparator;

class Tstr{
    public String n;
    public int p;
    public int parent;
    public Tstr(String name,int value1, int value2)
    {
     n=name;
     p=value1;
     parent=value2;
     System.out.println(parent);
    }
}

class Tree {
    public static void main(String args[]) {
        Tstr n[] = new Tstr[5];
        String a = "Five:5:4,Four:4:2,Two:2:1,Three:3:2,One:null:null";
        String b[] = a.split(",");
        int t = 0;
        int s=0;
        for (String v : b) {
            String values[] = v.split(":");
            if (!"null".equals(values[2])) {
                n[t] = new Tstr(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
            } else {
                n[t] = new Tstr(values[0], 1, 0);
            }
            t++;
        }
        Arrays.sort(n, Comparator.comparingInt(j -> j.p));

        // Print the sorted array
        for (Tstr j : n) {
            System.out.println(j.n);
        }
        for (Tstr j : n) {
           if(j.parent==0)
           {
            System.out.print(j.n);
            s=s+1;
           }else{
           
            if(n[j.p-2].p==j.parent){
                System.out.print("-->");
                System.out.print(j.n);
                s=s+1;
            }else{
                System.out.println("");
                for(int r=0;r<s;r++)
                {
                    System.out.print("   "); 
                }
                
                System.out.print("-->");
                System.out.print(j.n); 
            }
                // System.err.println(n[j.p-2].p+"  "+j.parent);
                
           }
        }
    }
}

