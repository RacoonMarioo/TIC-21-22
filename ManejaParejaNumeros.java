package MiCodigo;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParejaNumeros misNumeros;
		int num1=3;
		int num2=5;
		misNumeros= new ParejaNumeros(num1,num2);
		System.out.println("La suma vale ");
		System.out.print(misNumeros.devuelveSuma());
		System.out.println("\nLa resta vale ");
		System.out.print(misNumeros.devuelveResta());
		System.out.println("\nLa multiplicacion vale ");
		System.out.print(misNumeros.devuelveMultiplicacion());
		//Solo se puede usar 1
		System.out.print("La suma de el número ");
		System.out.print(num1);
		System.out.print("\ny el número ");
		System.out.print(num2);
		System.out.print("\nes igual a ");
		System.out.print(misNumeros.devuelveSuma());
	}

}
