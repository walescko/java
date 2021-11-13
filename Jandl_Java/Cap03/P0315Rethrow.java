package com.company.Jandl_Java.Cap03;

public class P0315Rethrow {

    @SuppressWarnings("deprecation")
    public static Object create (String className)
    throws ClassNotFoundException, IllegalAccessException{
        try {
            Class<?> classe = Class.forName(className);
            return classe.newInstance();
        } catch (ClassNotFoundException e) {
            throw e;
        } catch (InstantiationException e) {
            System.out.println(e +"\nObjeto não criado.");
            return null;
        } catch (IllegalAccessException e) {
            throw e;
        }
    }

    public static void main(String... a){
        try{
            Object o = create(a[0]);
            if (o != null) {
                System.out.println("Objeto: " + o.getClass());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "\nFalta argumento com o nome da classe!");
        } catch (ClassNotFoundException | IllegalAccessException e) {
            System.out.println(e);
        }
    }
}
