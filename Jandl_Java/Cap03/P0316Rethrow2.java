package JandlJrCap03;

public class P0316Rethrow2 {
    @SuppressWarnings("deprecation")//@SuppressWarnings("deprecation")
    public static Object create (String className) throws Exception{
        try {
            Class<?> classe = Class.forName(className);
            return classe.getNestHost();
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }
    public static void main (String... a){
        try {
            Object o = create(a[0]);
            if (o != null) {
                System.out.println("Objeto: "+ o.getClass());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e+ "\nFalta argumento com nome de classe!");
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
