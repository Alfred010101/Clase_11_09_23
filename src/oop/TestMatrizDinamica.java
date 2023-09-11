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
        objMatrizD.insertar(221);
        objMatrizD.insertar(1);
        objMatrizD.insertar(34);
        objMatrizD.insertar(23);
        
        System.out.println(objMatrizD.desplegar());
        objMatrizD.eliminar(4);
        System.out.println(objMatrizD.desplegar());
        objMatrizD.eliminarDato(221);
        System.out.println(objMatrizD.desplegar());
        //objMatrizD.eliminar(0);
        //System.out.println(objMatrizD.desplegar());
        //System.out.println(objMatrizD.getArr().length);
    }    
}
