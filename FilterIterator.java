import java.util.Iterator;
import java.util.NoSuchElementException;


public class FilterIterator<T> implements Iterator<T> {
	Iterator<T> iterator;
	Iterable<Filter<T>> filters;
	T next;

	/**
	 * Constructs a FilterIterator with the specified elements and filters.
	 *
	 * 	filters are not null
	 *  elements are not null
	 * 
	 * @param elements an iterable collection of elements to be filtered
	 * @param filters the iterable collection of filters to apply on the elements
	 */
	public FilterIterator(Iterable<T> elements, Iterable<Filter<T>> filters) {
		// ---------------write your code BELOW this line only! ------------------
		this.iterator = elements.iterator();
		this.filters = filters;
		// ---------------write your code ABOVE this line only! ------------------
	}
	/**
	 * Checks if there is a next element in the iteration that satisfies the filter condition.
	 *
	 * @return true - if there is a next element that satisfies the filter condition, false otherwise.
	 */	
	@Override
	public boolean hasNext() {
		// ---------------write your code BELOW this line only! ------------------
		if (next != null)
			return true;
		while (iterator.hasNext()) {
			T element = iterator.next();
			Iterator<Filter<T>> filterIterator = filters.iterator();
			boolean valid = true;
			while (filterIterator.hasNext() && valid) {
				Filter<T> filter = filterIterator.next();
				valid = filter.accept(element);
			}
			if (valid) {
				this.next = element;
				return true;
			}
		}
		return false;
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Returns the next element in the elementes iterable that statsify all the filters condition.
	 * If there are no more elements to return, a NoSuchElementException is thrown.
	 * must not iterate on all the elementes to find the next element.
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if there are no more elements to return
	 */
	@Override
	public T next() {
		// ---------------write your code BELOW this line only! ------------------
		if (!hasNext())
			throw new NoSuchElementException("no more elements");
		T result = next;
		next = null;
		return result;
		// ---------------write your code ABOVE this line only! ------------------
	}
}
