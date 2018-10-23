package ua.step.example.part7.gof.model.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	// список слушателей
	private List<AccountListener> listeners;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void changeBalance(int summa) {
		balance += summa;
		fireChangeBalance(summa);
	}

	private void fireChangeBalance(int summa) {
		if (listeners != null) {
			for (AccountListener listener : listeners) {
				listener.changed(summa);
			}
		}
	}

	public void addAccountListener(AccountListener accountListener) {
		if (listeners == null) {
			listeners = new ArrayList<AccountListener>();
		}
		listeners.add(accountListener);
	}
}
