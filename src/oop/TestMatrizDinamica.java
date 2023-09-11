package oop;

/**
 *
 * @author alfredo
 */
public class TestMatrizDinamica
{
    public static void main(String[] args)
    {
        MatrizDinamica objMatrizD = new MatrizDinamica();

        objMatrizD.insertar(19);
        
        System.out.println(objMatrizD.desplegar());
        objMatrizD.eliminar(0);
        System.out.println(objMatrizD.desplegar());
        //System.out.println(objMatrizD.getArr().length);
    }    
}
