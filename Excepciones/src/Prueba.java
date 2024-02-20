import java.util.Iterator;
import java.util.Scanner;

public class Prueba{

	public static void main(String[] args) throws AdrianException {
		
		/**try {
			division();
		} catch (Exception e) {
			System.out.println("No se puede dividir entre cero");
		}
		
		indiceFueraRango();
		indiceFueraRango();
		cadenaEntero();
		divisionCadena();**/
		String a=" ";
		char b=a.charAt(0);
		String[] c=split("hola que tal? buenos dias mundo", b);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		System.out.println(c[5]);
		//a
		}
		
	public static double division() throws AdrianException{
		
		Scanner sc=new Scanner(System.in);
		double num1;
		double num2;
		
		System.out.println("Dime dos numeros para ");
		
		System.out.println("Dime numero 1");
		num1=sc.nextDouble();
		
		System.out.println("Dime numero 2");
		num2=sc.nextDouble();
		
		double resultado;
		
		if(num2==0) {
			throw new AdrianException("No se puede dividir entre cero");
			
		}else {
			resultado = num1/num2;
		}
		return resultado;
	}
	
	
	private static void indiceFueraRango() throws AdrianException{
		
		int[] array= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int posicion;
		System.out.println("Dime una posicion");
		posicion=sc.nextInt();
		if (posicion<0 || posicion>array.length) {
			
			throw new AdrianException("Esa posicion no existe");
			
		}else {
			System.out.println(array[posicion]);
		}
		
	}
	public static void cadenaEntero() throws AdrianException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero en una cadena de texto");
		String str=sc.nextLine();
		boolean sePuede=true;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				
			}else {
				sePuede=false;
			}
		}
		if (sePuede) {
			int num= Integer.parseInt(str);
			System.out.println(num);
		}else {
			throw new AdrianException("Esta cadena no es un numero valido");
		}
		
	}
	
	public static String[] split(String cadena,char delimitado) throws AdrianException{
		
		
		if (cadena==null||cadena=="") {throw new AdrianException("No hay cadena para dividir");}
		if(!cadena.contains(""+delimitado)) {throw new AdrianException("El delimitador no se encuentra en la cadena");}
		
		int numeroLimitado=0;
		
		for (int i = 0; i < cadena.length(); i++) {
			char actual=cadena.charAt(i);
			
			if(delimitado==cadena.charAt(i)) {
				numeroLimitado++;
			}
		}
		
		StringBuffer str=new StringBuffer();
		String[] array=new String[numeroLimitado+1];
		int meterArrary=0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)!=delimitado) {
				str.append(cadena.charAt(i));
			}else {
				array[meterArrary]=str.toString();
				meterArrary++;
				StringBuffer a=new StringBuffer();
				str=a;
			}

			array[meterArrary]=str.toString();
			
			
		}
		return array;
		
	}
	public static int calculoFactorial() throws AdrianException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero para hacer su factorial");
		int factorial=sc.nextInt();
		int resultado=1;
		if(factorial<0) {throw new AdrianException("Los numeros negativos no se permiten");}
		for (int i = 1; i <= factorial; i++) {
			resultado*=i;
		}
		if(resultado>9999) {throw new AdrianException("Factorial de 5 cifras o mayor");}
		if(resultado<0) {throw new AdrianException("Factorial de 5 cifras o mayor");}
		return resultado;
	}
	
}
