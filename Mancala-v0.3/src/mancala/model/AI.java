/**
 * 
 */
package mancala.model;

/**
 * @author jonathan
 *
 */
public class AI {
	
	private boolean active = false;
	
	public void setPlaying(boolean tf) {
		active = tf;
	}
	
	public boolean isPlaying() {
		return active;
	}
}