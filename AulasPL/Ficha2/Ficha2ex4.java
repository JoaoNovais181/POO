package Ficha2;

public class Ficha2ex4 
{
    private int[] array;
    private int occupation;

    public Ficha2ex4 ()
    {
        array = new int[10];
        occupation = 0;
    }

    public Ficha2ex4 (int s)
    {
        array = new int[s];
        occupation = 0;
    }

    public Ficha2ex4 (int[] v)
    {
        array = v.clone();
        occupation = array.length;
    }

    public void push (int val)
    {
        if (occupation >= array.length)
        {
            int[] v = new int[(int)(0.4*array.length)];
            System.arraycopy(array, 0, v, 0, occupation);
            array = v;
        }
        array[occupation++] = val;
    }

    public int pop ()
    {
        return array[occupation--];
    }

    public int[] getArray ()
    {
        return array.clone();
    }

    public void swap (int i, int j)
    {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public void sort (int from, int to)
    {
        if (to - from <= 1) return;
        int i=from, j=to-1, pivot=array[(from+to)/2];
        
        while (i<=j)
        {
            while (array[i]<pivot && i<to)
                i++;
            
            while (array[j]>pivot && j>from)
                j--;
            
            if (i<=j)
                swap(i++, j--);
        }

        if (j>from)
            sort(from, j+1);
        if (i<to)
            sort(i, to);
    }

    public int search (int val)
    {
        if (array.length<1) return -1;
        int mid, beg = 0, end = array.length;
        for (mid = ((end + beg)/2) ; (end - beg-1)>0 ; mid = ((end + beg)/2))
        {
            if (val < array[mid]) end = mid;
            else if (val > array[mid]) beg = mid;
            else return mid;
        }
        if (val == array[mid]) return mid;

        return -1;
    }
}