package oop;

/**
 *
 * @author alfredo
 */
public class MatrizDinamica
{

    private int arr[] = null;

    /**
     * @return the arr
     */
    public int[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(int[] arr)
    {
        this.arr = arr;
    }

    public String desplegar()
    {
        String str = "";
        if (arr != null)
        {
            for (int i = 0; i < arr.length; i++)
            {
                str += arr[i] + "\n";
            }
        } else
        {
            str += "no hay datos";
        }
        return str;
    }

    public void insertar(int x)
    {
        if (arr == null)
        {
            arr = new int[1];
            arr[0] = x;
        } else
        {
            int nvo[] = new int[arr.length + 1];
            System.arraycopy(arr, 0, nvo, 0, arr.length);
            nvo[arr.length] = x;
            arr = nvo;
        }
    }

    public void eliminar(int p)
    {
        if (arr != null)
        {
            if (p >= 0 && p < arr.length)
            {
                if (p == 0 && arr.length == 1)
                {
                    arr = null;
                } else
                {
                    int nvo[] = new int[arr.length - 1];
                    for (int j = 0, i = 0; i < arr.length; i++)
                    {
                        if (i != p)
                        {
                            nvo[j++] = arr[i];
                        }
                    }
                    arr = nvo;
                }
            } else
            {
                System.out.println("Posicion incorrecta");
            }
        } else
        {
            System.out.println("No hay datos");
        }
    }

    public void eliminarDato(int dato)
    {
        if (arr != null)
        {
            if (dato == arr[0] && arr.length == 1)
            {
                arr = null;
            } else
            {
                int nvo[] = new int[arr.length - 1];
                for (int j = 0, i = 0; i < arr.length; i++)
                {
                    if (arr[i] != dato)
                    {
                        nvo[j++] = arr[i];
                    }
                }
                arr = nvo;
            }

        } else
        {
            System.out.println("No hay datos");
        }
    }
}
