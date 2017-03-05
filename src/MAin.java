/**
 * Created by pc on 17-3-5.
 */

    public  class MAin
{

        public static void main(String[] args)
        {
            int[] a = new int[9];
            a[0] = 1;

            for(int b=1; b<a.length; b++){
                a[b] = 1;
                for(int c=b+1; c<a.length; c++){
                    a[c] = 1;
                    String s = "A" + (char)(b+'A') + (char)(c+'A');
                    System.out.println(s);
                   // a[c]=0;
                }
                a[b] = 0;
            }
        }
    }

