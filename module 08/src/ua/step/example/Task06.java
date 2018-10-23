package ua.step.example;

import java.io.IOException;

/**
 * 
 * Выбрасывание исключительных ситуаций в коде командой throw
 *
 */
public class Task06
{
    public static void main(String[] args)
    {

        try {
			throw new IOException("Таки null");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        //throw new String(“Ошибка”);         // разкомментируй меня
        //throw new null;
    }
}
