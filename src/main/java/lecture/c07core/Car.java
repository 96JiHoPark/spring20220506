package lecture.c07core;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
	private Engine engine;
	
	/*public Car(Engine engine) {
		this.engine = engine;
	}*/
	
	public void move()	{
		engine.action();
	}
}
