package ua.step.example.part1.enumeration.model;

public enum AbstractDirection {
	UP {
		public AbstractDirection getOpposite() {
			return DOWN;
		}
	},
	DOWN {
		public AbstractDirection getOpposite() {
			return UP;
		}
	},
		LEFT {
			public AbstractDirection getOpposite1() {
				return LEFT;
			}

			@Override
			public AbstractDirection getOpposite() {
				// TODO Auto-generated method stub
				return LEFT;
			}
	
	}; 

	
	/**
	 * Каждый элемент перечисления обязан будт реализовать данный метод. 
	 */
	public abstract AbstractDirection getOpposite();
	
	// FIXME Добавьте направления LEFT и RIGHT
}
