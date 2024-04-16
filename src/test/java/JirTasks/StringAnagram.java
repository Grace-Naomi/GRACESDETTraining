package JirTasks;

import java.util.Arrays;

public class StringAnagram {




       public static boolean isAnagram(char[] str1, char[] str2)
        {

            int strLength1 = str1.length;
            int strLength2 = str2.length;


            if (strLength1 != strLength2)
                return false;


            Arrays.sort(str1);
            Arrays.sort(str2);


            for (int i = 0; i < strLength1; i++)
                if (str1[i] != str2[i])
                    return false;

            return true;
        }


        public static void main(String args[])
        {
            char str1[] = {'E','A','R','T','H'};
            char str2[] = {'H','E','A','R','T' };


            if (isAnagram(str1, str2))
                System.out.println("The two strings are anagram of each other");
            else
                System.out.println("The two strings are not anagram of each other");
        }


}
