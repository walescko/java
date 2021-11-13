public class P0203Escopo {
	public static void main(String[] args) {
		int i = 6;
		int j;
		{
//			int j = 2;
			System.out.println(i);
			j = 5*i;
			System.out.println(j);
		
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		System.out.println(i);
		System.out.println(j); //ERRO! Uso de j FORA do seu escobo -> deveria ser declarada junto com o i
	}
}
