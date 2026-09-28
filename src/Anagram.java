class Anagram {

    public static void main(String[] args) {


        String str1="kowsi";
        String str2="mowsi";
        int[] a = new int[127];

        for(int i=0;i<str1.length();i++){
            char ch= str1.charAt(i);
            a[ch]++;
        }

        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            a[ch]--;
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0){
                System.out.println("Not a Anagram");
            }
        }

        System.out.println("Anagram");

    }

}
