package ua.step.example;

/**
 * С больной головы на здоровую. Пробрасывание исключение наверх с помощью
 * ключевого слова throws.
 */

public class Task07 {
	public static void main(String[] args) {
		// создаем объект исключения
		Error ref = new Error();
		// "бросаем" его
		throw ref;

		// test(3);
	}

	/**
	 * Ключевое слово throws в объявлении метода, говорит о том, что при
	 * выплнении данного метода, может возникнуть исключение указаного типа.
	 * 
	 */
	private static void test(int a) /**/ throws /**/ Exception {
		if (a < 0) {
			// не смотря на то, что это проверяемое исключение
			// обработка не нужна, так как исключение проброщено на наверх.
			throw new Exception("a < 0");
		}
	}
}
