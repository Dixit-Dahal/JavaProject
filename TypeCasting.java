class TypeCasting {
    public static void main (String[] args){
        int x = 6;
        float y = x; // widening (Small to Big)

        System.out.println(x);
        System.out.println(y);
        
        int z = (int) y; // Narrowing (Big to Small)
        System.out.println(z);
    }
}