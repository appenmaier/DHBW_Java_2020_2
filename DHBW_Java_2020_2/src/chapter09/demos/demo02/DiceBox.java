package chapter09.demos.demo02;

/**
 * generische Würfelbox
 * 
 * @author Daniel Appenmaier
 *
 */
public class DiceBox<T extends Dice> {

	/*
	 * Attribute
	 */
	private T content;

	/*
	 * Methoden
	 */
	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
	
	public void rollTheDice() {
		content.rollTheDice();
	}

}
