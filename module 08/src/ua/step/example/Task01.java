package ua.step.example;

/**
 * 
 * Р’РѕР·РЅРёРєРЅРѕРІРµРЅРёРµ РёСЃРєР»СЋС‡РµРЅРёСЏ РІРѕ РІСЂРµРјСЏ СЂР°Р±РѕС‚С‹
 * РїСЂРѕРіСЂР°РјРјС‹
 *
 */
public class Task01 {
	public static void main(String[] args) {
		int a = 4;


		// TODO РґРµР»РµРЅРёРµ С†РµР»С‹С… С‡РёСЃРµР» РЅР° РЅРѕР»СЊ
		// РЅРµРґРѕРїСѓСЃС‚РёРјРѕ Рё РІС‹Р·С‹РІР°РµС‚ РёСЃРєР»СЋС‡РёС‚РµР»СЊРЅСѓСЋ
		// СЃРёС‚СѓР°С†РёСЋ
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException x) {
			System.out.println("nepraw chislo");
		}
		System.out.println(a / 0.0); // РІ РѕС‚Р»РёС‡РёРё РѕС‚ РґСЂРѕР±РЅС‹С…
	}
}
