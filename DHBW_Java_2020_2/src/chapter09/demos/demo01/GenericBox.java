package chapter09.demos.demo01;

/**
 * generische Box
 * 
 * @author Daniel Appenmaier
 *
 */
public class GenericBox<T> {

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

}
