package JirTasks;

public class GetHighestValueFromArray {

    int a[] = {99, 30, 48, 24, 65};

    int max = a[0];
    for(int i = 1;i<a.length;i++)

    {
        if (a[i] > max)
            max = a[i];
    }


}
