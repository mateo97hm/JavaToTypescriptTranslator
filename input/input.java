interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
}



public class Ejemplos {
    private static int uno = 1;

    public static void metodoSinArgumentos() {
    }

    public static void metodoConArgumentos(String a, int b, String[] arr) {
    }

    public static String metodoConReturn(String texto) {
        texto = "mensaje de prueba";
        return texto;
    }

    public static void metodoDeclaracionesBasicas() {
        int[] x = new int[]{1, 2, 3, 4, 5};
        MyClass myClass = new MyClass(1, 2, x[5]);
        String a[] = {"Avila", "Burgos", "León", "Palencia", "Salamanca", "Segovia", "Soria", "Valladolid", "Zamora"};
        a[0] = "Avila";
        int PerMax = 5;
        int[] cupo = new int[PerMax];
        int[] arrayInt = new int[10];
        String[] arrayString = new String[]{"one", "two", "three", "four", "five"};
        MyClass nombre_array[];
        nombre_array = new MyClass[PerMax];
        int[][] twoD_arr = new int[3][2];
        int[][][] threeD_arr = new int[2][3][];
        int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] arr2 = new int[][]{{1, 2}, {3, 4}, {5, 6}};
    }

    private static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return this.fibonacciRecursivo(n - 1) + this.fibonacciRecursivo(n - 2);
        }
    }

    protected static void tryCatchStatement() {
        Connection conexion;
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String usuario = "root";
        String clave = "";
        String consulta = "insert into Libros (isbn,titulo,autor,precio,categoria) values ('5','net','juan',20,'web')";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);
            Statement sentencia = conexion.createStatement();
            sentencia.execute(consulta);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("no hemos podido cargar el driver");
        } catch (SQLException e) {
            System.out.println("la consulta SQL es erronea");
        }
    }

    protected static void switchStatement(int day) {
        day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                System.out.println("and second line");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }

    public static void main(String[] args) {
        metodoSinArgumentos();
        metodoConArgumentos(a, b, arr);
        metodoConReturn();
        metodoDeclaracionesBasicas();
        fibonacciRecursivo();
        tryCatchStatement();
        switchStatement();
    }
}